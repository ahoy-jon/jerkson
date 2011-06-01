package com.codahale.jerkson.ser

import org.codehaus.jackson.JsonGenerator
import org.codehaus.jackson.map.{SerializerProvider, JsonSerializer}

class StringBuilderSerializer extends JsonSerializer[StringBuilder] {
  def serialize(value: StringBuilder, json: JsonGenerator, provider: SerializerProvider) {
    json.writeString(value.toString())
  }
}
