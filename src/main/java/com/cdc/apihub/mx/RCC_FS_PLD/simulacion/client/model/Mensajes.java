package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.Mensaje;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Si existen errores, se listarán.")


public class Mensajes {
  @SerializedName("mensajes")
  private List<Mensaje> mensajes = null;
  public Mensajes mensajes(List<Mensaje> mensajes) {
    this.mensajes = mensajes;
    return this;
  }
  public Mensajes addMensajesItem(Mensaje mensajesItem) {
    if (this.mensajes == null) {
      this.mensajes = new ArrayList<Mensaje>();
    }
    this.mensajes.add(mensajesItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Mensaje> getMensajes() {
    return mensajes;
  }
  public void setMensajes(List<Mensaje> mensajes) {
    this.mensajes = mensajes;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mensajes mensajes = (Mensajes) o;
    return Objects.equals(this.mensajes, mensajes.mensajes);
  }
  @Override
  public int hashCode() {
    return Objects.hash(mensajes);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mensajes {\n");
    
    sb.append("    mensajes: ").append(toIndentedString(mensajes)).append("\n");
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
