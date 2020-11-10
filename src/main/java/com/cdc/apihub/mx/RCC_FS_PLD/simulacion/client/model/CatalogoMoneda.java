package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoMoneda.Adapter.class)
public enum CatalogoMoneda {
  
  MX("MX"),
  
  US("US"),
  
  UD("UD");
  private String value;
  CatalogoMoneda(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoMoneda fromValue(String text) {
    for (CatalogoMoneda b : CatalogoMoneda.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoMoneda> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoMoneda enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoMoneda read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoMoneda.fromValue(String.valueOf(value));
    }
  }
}
