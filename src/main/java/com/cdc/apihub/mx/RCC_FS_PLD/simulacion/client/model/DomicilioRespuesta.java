package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoEstados;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoTipoAsentamiento;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoTipoDomicilio;
@ApiModel(description = "Datos del domicilio de la persona a consultar")


public class DomicilioRespuesta {
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("coloniaPoblacion")
  private String coloniaPoblacion = null;
  @SerializedName("delegacionMunicipio")
  private String delegacionMunicipio = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("estado")
  private CatalogoEstados estado = null;
  @SerializedName("CP")
  private String CP = null;
  @SerializedName("fechaResidencia")
  private String fechaResidencia = null;
  @SerializedName("numeroTelefono")
  private String numeroTelefono = null;
  @SerializedName("tipoDomicilio")
  private CatalogoTipoDomicilio tipoDomicilio = null;
  @SerializedName("tipoAsentamiento")
  private CatalogoTipoAsentamiento tipoAsentamiento = null;
  @SerializedName("fechaRegistroDomicilio")
  private String fechaRegistroDomicilio = null;
  @SerializedName("tipoAltaDomicilio")
  private Integer tipoAltaDomicilio = null;
  @SerializedName("numeroOtorgantesCarga")
  private Integer numeroOtorgantesCarga = null;
  @SerializedName("numeroOtorgantesConsulta")
  private Integer numeroOtorgantesConsulta = null;
  @SerializedName("idDomicilio")
  private String idDomicilio = null;
  public DomicilioRespuesta direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "HIDALGO 32", value = "Reportar el nombre de la calle, número exterior, número interior. Deben considerarse avenida,cerrada, manzana, lote, edificio,departamento etc. Debe contener por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public DomicilioRespuesta coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }
   
  @ApiModelProperty(example = "CENTRO", value = "Reportar la colonia a la cual pertenece la dirección contenida en el elemento dirección.")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }
  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }
  public DomicilioRespuesta delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }
   
  @ApiModelProperty(example = "LA BARCA", value = "Reportar la delegación o municipio a la cual pertenece la dirección contenida en el elemento Dirección.")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }
  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }
  public DomicilioRespuesta ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  @ApiModelProperty(example = "BENITO JUAREZ", value = "Reportar la ciudad a la cual pertenece la dirección contenida en el elemento Dirección.")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public DomicilioRespuesta estado(CatalogoEstados estado) {
    this.estado = estado;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoEstados getEstado() {
    return estado;
  }
  public void setEstado(CatalogoEstados estado) {
    this.estado = estado;
  }
  public DomicilioRespuesta CP(String CP) {
    this.CP = CP;
    return this;
  }
   
  @ApiModelProperty(example = "47917", value = "El código postal reportado debeestar compuesto por 5 dígitos. Para que el código postal sea válido deberá corresponder al estado reportado.")
  public String getCP() {
    return CP;
  }
  public void setCP(String CP) {
    this.CP = CP;
  }
  public DomicilioRespuesta fechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
    return this;
  }
   
  @ApiModelProperty(example = "2018-12-21", value = "Debe de reportarse la fecha desde cuando el consumidor vive en la  dirección reportada.")
  public String getFechaResidencia() {
    return fechaResidencia;
  }
  public void setFechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
  }
  public DomicilioRespuesta numeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
    return this;
  }
   
  @ApiModelProperty(value = "Debe de contener una longitud mínima de 5 caracteres. Cada carácter debe ser un número de 0-9, si se ingresa cualquier otro carácter el registro será rechazado.")
  public String getNumeroTelefono() {
    return numeroTelefono;
  }
  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }
  public DomicilioRespuesta tipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoTipoDomicilio getTipoDomicilio() {
    return tipoDomicilio;
  }
  public void setTipoDomicilio(CatalogoTipoDomicilio tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
  }
  public DomicilioRespuesta tipoAsentamiento(CatalogoTipoAsentamiento tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoTipoAsentamiento getTipoAsentamiento() {
    return tipoAsentamiento;
  }
  public void setTipoAsentamiento(CatalogoTipoAsentamiento tipoAsentamiento) {
    this.tipoAsentamiento = tipoAsentamiento;
  }
  public DomicilioRespuesta fechaRegistroDomicilio(String fechaRegistroDomicilio) {
    this.fechaRegistroDomicilio = fechaRegistroDomicilio;
    return this;
  }
   
  @ApiModelProperty(example = "2018-12-20", value = "Fecha en la cual se registró el domicilio.")
  public String getFechaRegistroDomicilio() {
    return fechaRegistroDomicilio;
  }
  public void setFechaRegistroDomicilio(String fechaRegistroDomicilio) {
    this.fechaRegistroDomicilio = fechaRegistroDomicilio;
  }
  public DomicilioRespuesta tipoAltaDomicilio(Integer tipoAltaDomicilio) {
    this.tipoAltaDomicilio = tipoAltaDomicilio;
    return this;
  }
   
  @ApiModelProperty(value = "Los valores posibles: 0 = Alta de crédito 1 = Consulta expediente")
  public Integer getTipoAltaDomicilio() {
    return tipoAltaDomicilio;
  }
  public void setTipoAltaDomicilio(Integer tipoAltaDomicilio) {
    this.tipoAltaDomicilio = tipoAltaDomicilio;
  }
  public DomicilioRespuesta numeroOtorgantesCarga(Integer numeroOtorgantesCarga) {
    this.numeroOtorgantesCarga = numeroOtorgantesCarga;
    return this;
  }
   
  @ApiModelProperty(value = "Los valores posibles: 0 = Alta de crédito 1 = Consulta expediente")
  public Integer getNumeroOtorgantesCarga() {
    return numeroOtorgantesCarga;
  }
  public void setNumeroOtorgantesCarga(Integer numeroOtorgantesCarga) {
    this.numeroOtorgantesCarga = numeroOtorgantesCarga;
  }
  public DomicilioRespuesta numeroOtorgantesConsulta(Integer numeroOtorgantesConsulta) {
    this.numeroOtorgantesConsulta = numeroOtorgantesConsulta;
    return this;
  }
   
  @ApiModelProperty(value = "Los valores posibles: 0 = Alta de crédito 1 = Consulta expediente")
  public Integer getNumeroOtorgantesConsulta() {
    return numeroOtorgantesConsulta;
  }
  public void setNumeroOtorgantesConsulta(Integer numeroOtorgantesConsulta) {
    this.numeroOtorgantesConsulta = numeroOtorgantesConsulta;
  }
  public DomicilioRespuesta idDomicilio(String idDomicilio) {
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
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomicilioRespuesta domicilioRespuesta = (DomicilioRespuesta) o;
    return Objects.equals(this.direccion, domicilioRespuesta.direccion) &&
        Objects.equals(this.coloniaPoblacion, domicilioRespuesta.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, domicilioRespuesta.delegacionMunicipio) &&
        Objects.equals(this.ciudad, domicilioRespuesta.ciudad) &&
        Objects.equals(this.estado, domicilioRespuesta.estado) &&
        Objects.equals(this.CP, domicilioRespuesta.CP) &&
        Objects.equals(this.fechaResidencia, domicilioRespuesta.fechaResidencia) &&
        Objects.equals(this.numeroTelefono, domicilioRespuesta.numeroTelefono) &&
        Objects.equals(this.tipoDomicilio, domicilioRespuesta.tipoDomicilio) &&
        Objects.equals(this.tipoAsentamiento, domicilioRespuesta.tipoAsentamiento) &&
        Objects.equals(this.fechaRegistroDomicilio, domicilioRespuesta.fechaRegistroDomicilio) &&
        Objects.equals(this.tipoAltaDomicilio, domicilioRespuesta.tipoAltaDomicilio) &&
        Objects.equals(this.numeroOtorgantesCarga, domicilioRespuesta.numeroOtorgantesCarga) &&
        Objects.equals(this.numeroOtorgantesConsulta, domicilioRespuesta.numeroOtorgantesConsulta) &&
        Objects.equals(this.idDomicilio, domicilioRespuesta.idDomicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, fechaResidencia, numeroTelefono, tipoDomicilio, tipoAsentamiento, fechaRegistroDomicilio, tipoAltaDomicilio, numeroOtorgantesCarga, numeroOtorgantesConsulta, idDomicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomicilioRespuesta {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
    sb.append("    tipoAsentamiento: ").append(toIndentedString(tipoAsentamiento)).append("\n");
    sb.append("    fechaRegistroDomicilio: ").append(toIndentedString(fechaRegistroDomicilio)).append("\n");
    sb.append("    tipoAltaDomicilio: ").append(toIndentedString(tipoAltaDomicilio)).append("\n");
    sb.append("    numeroOtorgantesCarga: ").append(toIndentedString(numeroOtorgantesCarga)).append("\n");
    sb.append("    numeroOtorgantesConsulta: ").append(toIndentedString(numeroOtorgantesConsulta)).append("\n");
    sb.append("    idDomicilio: ").append(toIndentedString(idDomicilio)).append("\n");
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
