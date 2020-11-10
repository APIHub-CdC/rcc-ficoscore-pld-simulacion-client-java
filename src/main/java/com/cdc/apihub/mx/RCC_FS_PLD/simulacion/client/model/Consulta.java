package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoMoneda;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoTipoResponsabilidad;
import java.io.IOException;
@ApiModel(description = "Datos de consultas.")


public class Consulta {
  @SerializedName("fechaConsulta")
  private String fechaConsulta = null;
  @SerializedName("claveOtorgante")
  private String claveOtorgante = null;
  @SerializedName("nombreOtorgante")
  private String nombreOtorgante = null;
  @SerializedName("direccionOtorgante")
  private String direccionOtorgante = null;
  @SerializedName("telefonoOtorgante")
  private String telefonoOtorgante = null;
  @SerializedName("tipoCredito")
  private String tipoCredito = null;
  @SerializedName("claveUnidadMonetaria")
  private CatalogoMoneda claveUnidadMonetaria = null;
  @SerializedName("importeCredito")
  private Float importeCredito = null;
  @SerializedName("tipoResponsabilidad")
  private CatalogoTipoResponsabilidad tipoResponsabilidad = null;
  @SerializedName("idDomicilio")
  private String idDomicilio = null;
  
  @JsonAdapter(ServiciosEnum.Adapter.class)
  public enum ServiciosEnum {
    _0("0"),
    
    _1("1");
    private String value;
    ServiciosEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }
    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ServiciosEnum fromValue(String text) {
      for (ServiciosEnum b : ServiciosEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ServiciosEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiciosEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
      @Override
      public ServiciosEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiciosEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("servicios")
  private ServiciosEnum servicios = null;
  public Consulta fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "2020-01-09", value = "Fecha de la consulta.")
  public String getFechaConsulta() {
    return fechaConsulta;
  }
  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }
  public Consulta claveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "CDC0001", value = "Contiene la clave del otorgante que reporta el crédito. <br>Nota: Este elemento solo es reportado para reporte de crédito especial.")
  public String getClaveOtorgante() {
    return claveOtorgante;
  }
  public void setClaveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
  }
  public Consulta nombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "MICROFINANCIERA", value = "Contiene el Nombre del Otorgante de Crédito que reporto el Crédito. Ver Tabla: Tipo de Negocio. <br>Nota: Este elemento solo es reportado para reporte de crédito especial.")
  public String getNombreOtorgante() {
    return nombreOtorgante;
  }
  public void setNombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
  }
  public Consulta direccionOtorgante(String direccionOtorgante) {
    this.direccionOtorgante = direccionOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "HIDALGO 32", value = "Se presentará la Dirección de la Institución Otorgante que reporta la cuenta.")
  public String getDireccionOtorgante() {
    return direccionOtorgante;
  }
  public void setDireccionOtorgante(String direccionOtorgante) {
    this.direccionOtorgante = direccionOtorgante;
  }
  public Consulta telefonoOtorgante(String telefonoOtorgante) {
    this.telefonoOtorgante = telefonoOtorgante;
    return this;
  }
   
  @ApiModelProperty(value = "Se presentará el teléfono de la Institución Otorgante que reporta la cuenta.")
  public String getTelefonoOtorgante() {
    return telefonoOtorgante;
  }
  public void setTelefonoOtorgante(String telefonoOtorgante) {
    this.telefonoOtorgante = telefonoOtorgante;
  }
  public Consulta tipoCredito(String tipoCredito) {
    this.tipoCredito = tipoCredito;
    return this;
  }
   
  @ApiModelProperty(example = "M", value = "Tipo de crédito que se solicitó.")
  public String getTipoCredito() {
    return tipoCredito;
  }
  public void setTipoCredito(String tipoCredito) {
    this.tipoCredito = tipoCredito;
  }
  public Consulta claveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoMoneda getClaveUnidadMonetaria() {
    return claveUnidadMonetaria;
  }
  public void setClaveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
  }
  public Consulta importeCredito(Float importeCredito) {
    this.importeCredito = importeCredito;
    return this;
  }
   
  @ApiModelProperty(value = "Monto solicitado.")
  public Float getImporteCredito() {
    return importeCredito;
  }
  public void setImporteCredito(Float importeCredito) {
    this.importeCredito = importeCredito;
  }
  public Consulta tipoResponsabilidad(CatalogoTipoResponsabilidad tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoTipoResponsabilidad getTipoResponsabilidad() {
    return tipoResponsabilidad;
  }
  public void setTipoResponsabilidad(CatalogoTipoResponsabilidad tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
  }
  public Consulta idDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "316110890", value = "Identificador único del domicilio")
  public String getIdDomicilio() {
    return idDomicilio;
  }
  public void setIdDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
  }
  public Consulta servicios(ServiciosEnum servicios) {
    this.servicios = servicios;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "<table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>0</td><td>Sin servicios</td></tr><tr><td>1</td><td>Servicios al hogar</td></tr></tbody></table>")
  public ServiciosEnum getServicios() {
    return servicios;
  }
  public void setServicios(ServiciosEnum servicios) {
    this.servicios = servicios;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consulta consulta = (Consulta) o;
    return Objects.equals(this.fechaConsulta, consulta.fechaConsulta) &&
        Objects.equals(this.claveOtorgante, consulta.claveOtorgante) &&
        Objects.equals(this.nombreOtorgante, consulta.nombreOtorgante) &&
        Objects.equals(this.direccionOtorgante, consulta.direccionOtorgante) &&
        Objects.equals(this.telefonoOtorgante, consulta.telefonoOtorgante) &&
        Objects.equals(this.tipoCredito, consulta.tipoCredito) &&
        Objects.equals(this.claveUnidadMonetaria, consulta.claveUnidadMonetaria) &&
        Objects.equals(this.importeCredito, consulta.importeCredito) &&
        Objects.equals(this.tipoResponsabilidad, consulta.tipoResponsabilidad) &&
        Objects.equals(this.idDomicilio, consulta.idDomicilio) &&
        Objects.equals(this.servicios, consulta.servicios);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaConsulta, claveOtorgante, nombreOtorgante, direccionOtorgante, telefonoOtorgante, tipoCredito, claveUnidadMonetaria, importeCredito, tipoResponsabilidad, idDomicilio, servicios);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consulta {\n");
    
    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
    sb.append("    direccionOtorgante: ").append(toIndentedString(direccionOtorgante)).append("\n");
    sb.append("    telefonoOtorgante: ").append(toIndentedString(telefonoOtorgante)).append("\n");
    sb.append("    tipoCredito: ").append(toIndentedString(tipoCredito)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    importeCredito: ").append(toIndentedString(importeCredito)).append("\n");
    sb.append("    tipoResponsabilidad: ").append(toIndentedString(tipoResponsabilidad)).append("\n");
    sb.append("    idDomicilio: ").append(toIndentedString(idDomicilio)).append("\n");
    sb.append("    servicios: ").append(toIndentedString(servicios)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
