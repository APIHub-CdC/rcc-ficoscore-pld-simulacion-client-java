package io.RCCFicoScorePLDSimulacion.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoTipoResponsabilidad.Adapter.class)
public enum CatalogoTipoResponsabilidad {
  
  I("I"),
  
  M("M"),
  
  O("O"),
  
  A("A"),
  
  T("T");
  private String value;
  CatalogoTipoResponsabilidad(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoTipoResponsabilidad fromValue(String text) {
    for (CatalogoTipoResponsabilidad b : CatalogoTipoResponsabilidad.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoTipoResponsabilidad> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoResponsabilidad enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoTipoResponsabilidad read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoResponsabilidad.fromValue(String.valueOf(value));
    }
  }
}
