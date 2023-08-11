package com.tenitx.values.java.sdk.client;

import com.google.common.annotations.Beta;
import com.tenitx.values.java.sdk.client.utils.NapRoom;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
Beta Notice: The websocket client gets quicker updates, but is subject to reliability concerns such as connections being dropped frequently.
We're working on improving this, but in the meantime, using the HTTP client will have slow update times (still less than
a minute), but will more reliably get those updates.
 */
@Beta
public class ValuesWebsocketClient {
  private static final Logger LOG = LoggerFactory.getLogger(ValuesWebsocketClient.class);

  private final OkHttpClient httpClient = new OkHttpClient();

  private final InternalValuesManager internalValuesManager;

  private final ValuesClientConfig config;

  public ValuesWebsocketClient(
    ValuesClientConfig config,
    InternalValuesManager internalValuesManager
  ) {
    this.internalValuesManager = internalValuesManager;
    this.config = config;
  }

  public void connect() {
    if (config.getUseVerboseLogging()) {
      LOG.info("Values Websocket client connecting...");
    }
    Request.Builder requestBuilder =
      (new Request.Builder()).url(
          String.format(
            "wss://api.tenitx.com/values/connect/%s?apiToken=%s",
            config.getCoordinate(),
            config.getApiToken()
          )
        );
    httpClient.newWebSocket(
      requestBuilder.build(),
      new WebSocketListener() {

        @Override
        public void onOpen(WebSocket webSocket, Response response) {
          if (config.getUseVerboseLogging()) {
            LOG.info("Values internal websocket connected...");
          }
          NapRoom.sleep(1);
          webSocket.send("sync");
        }

        @Override
        public void onMessage(WebSocket webSocket, String text) {
          if (config.getUseVerboseLogging()) {
            LOG.info("Values internal websocket message... {}", text);
          }
          internalValuesManager.handleWebsocketUpdateString(text);
        }

        @Override
        public void onMessage(WebSocket webSocket, ByteString bytes) {
          if (config.getUseVerboseLogging()) {
            LOG.info("Values internal websocket message... {}", bytes);
          }
          internalValuesManager.handleWebsocketUpdateString(bytes.toString());
        }

        @Override
        public void onClosing(WebSocket webSocket, int code, String reason) {
          if (config.getUseVerboseLogging()) {
            LOG.info("Values internal websocket closing...");
          }
          NapRoom.sleep(1);
          connect();
        }

        @Override
        public void onClosed(WebSocket webSocket, int code, String reason) {
          if (config.getUseVerboseLogging()) {
            LOG.info("Values internal websocket closed...");
          }
          NapRoom.sleep(1);
          connect();
        }

        @Override
        public void onFailure(WebSocket webSocket, Throwable t, Response response) {
          if (config.getUseVerboseLogging()) {
            LOG.info("Values internal websocket failed...");
          }
          NapRoom.sleep(1);
          connect();
        }
      }
    );
  }
}
