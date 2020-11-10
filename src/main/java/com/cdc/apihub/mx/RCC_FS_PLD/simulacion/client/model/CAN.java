package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class CAN {
  @SerializedName("identificadorCAN")
  private String identificadorCAN = null;
  @SerializedName("prelacionOrigen")
  private Integer prelacionOrigen = null;
  @SerializedName("prelacionActual")
  private Integer prelacionActual = null;
  @SerializedName("fechaAperturaCAN")
  private String fechaAperturaCAN = null;
  @SerializedName("fechaCancelacionCAN")
  private String fechaCancelacionCAN = null;
  @SerializedName("historicoCAN")
  private String historicoCAN = null;
  @SerializedName("fechaMRCAN")
  private String fechaMRCAN = null;
  @SerializedName("fechaMACAN")
  private String fechaMACAN = null;
  public CAN identificadorCAN(String identificadorCAN) {
    this.identificadorCAN = identificadorCAN;
    return this;
  }
   
  @ApiModelProperty(example = "01", value = "Indica el estatus del crédito cuando es asociado a la nómina. <table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>01</td><td>Activo</td></tr><tr><td>02</td><td>Cancelado</td></tr></tbody></table>")
  public String getIdentificadorCAN() {
    return identificadorCAN;
  }
  public void setIdentificadorCAN(String identificadorCAN) {
    this.identificadorCAN = identificadorCAN;
  }
  public CAN prelacionOrigen(Integer prelacionOrigen) {
    this.prelacionOrigen = prelacionOrigen;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Indica el orden de la prelación origen.")
  public Integer getPrelacionOrigen() {
    return prelacionOrigen;
  }
  public void setPrelacionOrigen(Integer prelacionOrigen) {
    this.prelacionOrigen = prelacionOrigen;
  }
  public CAN prelacionActual(Integer prelacionActual) {
    this.prelacionActual = prelacionActual;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Indica el orden de la prelación actual.")
  public Integer getPrelacionActual() {
    return prelacionActual;
  }
  public void setPrelacionActual(Integer prelacionActual) {
    this.prelacionActual = prelacionActual;
  }
  public CAN fechaAperturaCAN(String fechaAperturaCAN) {
    this.fechaAperturaCAN = fechaAperturaCAN;
    return this;
  }
   
  @ApiModelProperty(example = "2016-03-16", value = "Fecha asociada a la apertura de la domiciliación CAN")
  public String getFechaAperturaCAN() {
    return fechaAperturaCAN;
  }
  public void setFechaAperturaCAN(String fechaAperturaCAN) {
    this.fechaAperturaCAN = fechaAperturaCAN;
  }
  public CAN fechaCancelacionCAN(String fechaCancelacionCAN) {
    this.fechaCancelacionCAN = fechaCancelacionCAN;
    return this;
  }
   
  @ApiModelProperty(example = "2016-03-16", value = "Fecha asociada a la cancelación de la domiciliación CAN")
  public String getFechaCancelacionCAN() {
    return fechaCancelacionCAN;
  }
  public void setFechaCancelacionCAN(String fechaCancelacionCAN) {
    this.fechaCancelacionCAN = fechaCancelacionCAN;
  }
  public CAN historicoCAN(String historicoCAN) {
    this.historicoCAN = historicoCAN;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "Histórico CAN. Muestra los últimos 36 meses de historia. (Cada valor representa un mes) <table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>Activo</td></tr><tr><td>2</td><td>Cancelado</td></tr><tr><td>-</td><td>No reportado</td></tr></tbody></table>")
  public String getHistoricoCAN() {
    return historicoCAN;
  }
  public void setHistoricoCAN(String historicoCAN) {
    this.historicoCAN = historicoCAN;
  }
  public CAN fechaMRCAN(String fechaMRCAN) {
    this.fechaMRCAN = fechaMRCAN;
    return this;
  }
   
  @ApiModelProperty(example = "2016-03-16", value = "Fecha más reciente del histórico CAN)")
  public String getFechaMRCAN() {
    return fechaMRCAN;
  }
  public void setFechaMRCAN(String fechaMRCAN) {
    this.fechaMRCAN = fechaMRCAN;
  }
  public CAN fechaMACAN(String fechaMACAN) {
    this.fechaMACAN = fechaMACAN;
    return this;
  }
   
  @ApiModelProperty(example = "2016-03-16", value = "Fecha más antigua del histórico CAN (en que inicio el histórico)")
  public String getFechaMACAN() {
    return fechaMACAN;
  }
  public void setFechaMACAN(String fechaMACAN) {
    this.fechaMACAN = fechaMACAN;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CAN CAN = (CAN) o;
    return Objects.equals(this.identificadorCAN, CAN.identificadorCAN) &&
        Objects.equals(this.prelacionOrigen, CAN.prelacionOrigen) &&
        Objects.equals(this.prelacionActual, CAN.prelacionActual) &&
        Objects.equals(this.fechaAperturaCAN, CAN.fechaAperturaCAN) &&
        Objects.equals(this.fechaCancelacionCAN, CAN.fechaCancelacionCAN) &&
        Objects.equals(this.historicoCAN, CAN.historicoCAN) &&
        Objects.equals(this.fechaMRCAN, CAN.fechaMRCAN) &&
        Objects.equals(this.fechaMACAN, CAN.fechaMACAN);
  }
  @Override
  public int hashCode() {
    return Objects.hash(identificadorCAN, prelacionOrigen, prelacionActual, fechaAperturaCAN, fechaCancelacionCAN, historicoCAN, fechaMRCAN, fechaMACAN);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CAN {\n");
    
    sb.append("    identificadorCAN: ").append(toIndentedString(identificadorCAN)).append("\n");
    sb.append("    prelacionOrigen: ").append(toIndentedString(prelacionOrigen)).append("\n");
    sb.append("    prelacionActual: ").append(toIndentedString(prelacionActual)).append("\n");
    sb.append("    fechaAperturaCAN: ").append(toIndentedString(fechaAperturaCAN)).append("\n");
    sb.append("    fechaCancelacionCAN: ").append(toIndentedString(fechaCancelacionCAN)).append("\n");
    sb.append("    historicoCAN: ").append(toIndentedString(historicoCAN)).append("\n");
    sb.append("    fechaMRCAN: ").append(toIndentedString(fechaMRCAN)).append("\n");
    sb.append("    fechaMACAN: ").append(toIndentedString(fechaMACAN)).append("\n");
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
