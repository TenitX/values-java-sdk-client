package com.tenitx.values.java.sdk.client.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NapRoom {
  private static final Logger LOG = LoggerFactory.getLogger(NapRoom.class);

  public static void sleep(int seconds) {
    try {
      Thread.sleep(1000 * seconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void sleepMillis(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
