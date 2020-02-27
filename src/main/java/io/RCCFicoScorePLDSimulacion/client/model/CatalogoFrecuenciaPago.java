package io.RCCFicoScorePLDSimulacion.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoFrecuenciaPago.Adapter.class)
public enum CatalogoFrecuenciaPago {
  
  A("A"),
  
  B("B"),
  
  C("C"),
  
  D("D"),
  
  E("E"),
  
  M("M"),
  
  Q("Q"),
  
  R("R"),
  
  S("S"),
  
  T("T"),
  
  U("U");
  private String value;
  CatalogoFrecuenciaPago(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoFrecuenciaPago fromValue(String text) {
    for (CatalogoFrecuenciaPago b : CatalogoFrecuenciaPago.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoFrecuenciaPago> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoFrecuenciaPago enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoFrecuenciaPago read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoFrecuenciaPago.fromValue(String.valueOf(value));
    }
  }
}
