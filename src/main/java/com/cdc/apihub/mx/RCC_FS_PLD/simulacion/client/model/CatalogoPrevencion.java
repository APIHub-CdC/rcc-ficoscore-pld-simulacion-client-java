package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoPrevencion.Adapter.class)
public enum CatalogoPrevencion {
  
  AD("AD"),
  
  CA("CA"),
  
  CC("CC"),
  
  CD("CD"),
  
  CL("CL"),
  
  CO("CO"),
  
  CV("CV"),
  
  FD("FD"),
  
  FN("FN"),
  
  FP("FP"),
  
  FR("FR"),
  
  GP("GP"),
  
  IA("IA"),
  
  IM("IM"),
  
  IS("IS"),
  
  LC("LC"),
  
  LG("LG"),
  
  LO("LO"),
  
  LS("LS"),
  
  NA("NA"),
  
  NV("NV"),
  
  PC("PC"),
  
  PD("PD"),
  
  PE("PE"),
  
  PI("PI"),
  
  PR("PR"),
  
  RA("RA"),
  
  RI("RI"),
  
  RF("RF"),
  
  RN("RN"),
  
  RV("RV"),
  
  SG("SG"),
  
  UP("UP"),
  
  VR("VR");
  private String value;
  CatalogoPrevencion(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoPrevencion fromValue(String text) {
    for (CatalogoPrevencion b : CatalogoPrevencion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoPrevencion> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoPrevencion enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoPrevencion read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoPrevencion.fromValue(String.valueOf(value));
    }
  }
}
