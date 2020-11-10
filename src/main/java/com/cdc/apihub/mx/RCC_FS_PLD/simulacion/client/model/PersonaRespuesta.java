package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoEstadoCivil;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoResidencia;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.CatalogoSexo;
@ApiModel(description = "Datos generales de la persona a consultar.")


public class PersonaRespuesta {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("CURP")
  private String CURP = null;
  @SerializedName("numeroSeguridadSocial")
  private String numeroSeguridadSocial = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private CatalogoResidencia residencia = null;
  @SerializedName("estadoCivil")
  private CatalogoEstadoCivil estadoCivil = null;
  @SerializedName("sexo")
  private CatalogoSexo sexo = null;
  @SerializedName("claveElectorIFE")
  private String claveElectorIFE = null;
  @SerializedName("numeroDependientes")
  private Integer numeroDependientes = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  public PersonaRespuesta apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "SAHAGUN", value = "Apellido paterno de la persona")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public PersonaRespuesta apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "ZARAGOZA", value = "Apellido materno de la persona")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public PersonaRespuesta apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  @ApiModelProperty(value = "Apellido adicional de la persona, si tuviere")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public PersonaRespuesta nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }
   
  @ApiModelProperty(example = "ROBERTO", value = "Primer nombre de la persona")
  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  public PersonaRespuesta fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "2001-01-01", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public PersonaRespuesta RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101", value = "RFC con homoclave de la persona")
  public String getRFC() {
    return RFC;
  }
  public void setRFC(String RFC) {
    this.RFC = RFC;
  }
  public PersonaRespuesta CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }
   
  @ApiModelProperty(example = "SAZR010101HCMLNS09", value = "CURP de la persona, emitida por RENAPO")
  public String getCURP() {
    return CURP;
  }
  public void setCURP(String CURP) {
    this.CURP = CURP;
  }
  public PersonaRespuesta numeroSeguridadSocial(String numeroSeguridadSocial) {
    this.numeroSeguridadSocial = numeroSeguridadSocial;
    return this;
  }
   
  @ApiModelProperty(example = "990099000099", value = "Debe colocar el número con el que el acreditado se encuentra afiliado a una institución de seguro social, el cual se compone por 11 caracteres Solo aplica para INFONAVIT y FOVISSSTE")
  public String getNumeroSeguridadSocial() {
    return numeroSeguridadSocial;
  }
  public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
    this.numeroSeguridadSocial = numeroSeguridadSocial;
  }
  public PersonaRespuesta nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  @ApiModelProperty(example = "MX", value = "Debe contener la clave de la nacionalidad del consumidor los valores posibles son los siguientes: MX = México.")
  public String getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public PersonaRespuesta residencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoResidencia getResidencia() {
    return residencia;
  }
  public void setResidencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
  }
  public PersonaRespuesta estadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoEstadoCivil getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public PersonaRespuesta sexo(CatalogoSexo sexo) {
    this.sexo = sexo;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoSexo getSexo() {
    return sexo;
  }
  public void setSexo(CatalogoSexo sexo) {
    this.sexo = sexo;
  }
  public PersonaRespuesta claveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
    return this;
  }
   
  @ApiModelProperty(example = "000000000000", value = "La clave de elector que se encuentra en el IFE/INE.")
  public String getClaveElectorIFE() {
    return claveElectorIFE;
  }
  public void setClaveElectorIFE(String claveElectorIFE) {
    this.claveElectorIFE = claveElectorIFE;
  }
  public PersonaRespuesta numeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Número de personas que dependen de la persona.")
  public Integer getNumeroDependientes() {
    return numeroDependientes;
  }
  public void setNumeroDependientes(Integer numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }
  public PersonaRespuesta fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }
   
  @ApiModelProperty(example = "9999-01-01", value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaDefuncion() {
    return fechaDefuncion;
  }
  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonaRespuesta personaRespuesta = (PersonaRespuesta) o;
    return Objects.equals(this.apellidoPaterno, personaRespuesta.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, personaRespuesta.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, personaRespuesta.apellidoAdicional) &&
        Objects.equals(this.nombres, personaRespuesta.nombres) &&
        Objects.equals(this.fechaNacimiento, personaRespuesta.fechaNacimiento) &&
        Objects.equals(this.RFC, personaRespuesta.RFC) &&
        Objects.equals(this.CURP, personaRespuesta.CURP) &&
        Objects.equals(this.numeroSeguridadSocial, personaRespuesta.numeroSeguridadSocial) &&
        Objects.equals(this.nacionalidad, personaRespuesta.nacionalidad) &&
        Objects.equals(this.residencia, personaRespuesta.residencia) &&
        Objects.equals(this.estadoCivil, personaRespuesta.estadoCivil) &&
        Objects.equals(this.sexo, personaRespuesta.sexo) &&
        Objects.equals(this.claveElectorIFE, personaRespuesta.claveElectorIFE) &&
        Objects.equals(this.numeroDependientes, personaRespuesta.numeroDependientes) &&
        Objects.equals(this.fechaDefuncion, personaRespuesta.fechaDefuncion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, nombres, fechaNacimiento, RFC, CURP, numeroSeguridadSocial, nacionalidad, residencia, estadoCivil, sexo, claveElectorIFE, numeroDependientes, fechaDefuncion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonaRespuesta {\n");
    
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    numeroSeguridadSocial: ").append(toIndentedString(numeroSeguridadSocial)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    claveElectorIFE: ").append(toIndentedString(claveElectorIFE)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
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
