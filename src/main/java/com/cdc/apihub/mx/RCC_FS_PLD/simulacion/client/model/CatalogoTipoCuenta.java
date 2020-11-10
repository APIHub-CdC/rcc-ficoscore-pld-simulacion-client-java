package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoTipoCuenta.Adapter.class)
public enum CatalogoTipoCuenta {
  
  F("F"),
  
  H("H"),
  
  L("L"),
  
  R("R"),
  
  Q("Q"),
  
  A("A"),
  
  E("E"),
  
  P("P");
  private String value;
  CatalogoTipoCuenta(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoTipoCuenta fromValue(String text) {
    for (CatalogoTipoCuenta b : CatalogoTipoCuenta.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoTipoCuenta> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoCuenta enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoTipoCuenta read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoCuenta.fromValue(String.valueOf(value));
    }
  }
}
