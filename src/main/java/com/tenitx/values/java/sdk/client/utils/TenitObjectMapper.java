package com.tenitx.values.java.sdk.client.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;

public class TenitObjectMapper extends ObjectMapper {

  public TenitObjectMapper() {
    this.registerModules(new Jdk8Module(), new GuavaModule());
  }
}
