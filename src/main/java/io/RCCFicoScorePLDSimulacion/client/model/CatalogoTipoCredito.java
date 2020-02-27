package io.RCCFicoScorePLDSimulacion.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoTipoCredito.Adapter.class)
public enum CatalogoTipoCredito {
  
  AA("AA"),
  
  AB("AB"),
  
  AE("AE"),
  
  AM("AM"),
  
  AR("AR"),
  
  AV("AV"),
  
  BC("BC"),
  
  BL("BL"),
  
  BR("BR"),
  
  CA("CA"),
  
  CC("CC"),
  
  CF("CF"),
  
  CO("CO"),
  
  CP("CP"),
  
  ED("ED"),
  
  EQ("EQ"),
  
  FF("FF"),
  
  FI("FI"),
  
  FT("FT"),
  
  GS("GS"),
  
  HB("HB"),
  
  HE("HE"),
  
  HV("HV"),
  
  LC("LC"),
  
  MC("MC"),
  
  NG("NG"),
  
  PB("PB"),
  
  PC("PC"),
  
  PE("PE"),
  
  PG("PG"),
  
  PQ("PQ"),
  
  PM("PM"),
  
  PN("PN"),
  
  PP("PP"),
  
  SH("SH"),
  
  TC("TC"),
  
  TD("TD"),
  
  TG("TG"),
  
  TS("TS"),
  
  VR("VR"),
  
  OT("OT"),
  
  NC("NC");
  private String value;
  CatalogoTipoCredito(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoTipoCredito fromValue(String text) {
    for (CatalogoTipoCredito b : CatalogoTipoCredito.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoTipoCredito> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoCredito enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoTipoCredito read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoTipoCredito.fromValue(String.valueOf(value));
    }
  }
}
