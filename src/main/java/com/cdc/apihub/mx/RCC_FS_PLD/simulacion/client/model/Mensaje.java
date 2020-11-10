package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description = "El elemento de Mensaje contiene información acerca de los mensajes emitidos por Círculo de Crédito, este elemento se repite dependiendo del número de mensajes.")


public class Mensaje {
  @SerializedName("tipoMensaje")
  private Integer tipoMensaje = null;
  @SerializedName("leyenda")
  private String leyenda = null;
  public Mensaje tipoMensaje(Integer tipoMensaje) {
    this.tipoMensaje = tipoMensaje;
    return this;
  }
   
  @ApiModelProperty(example = "2", value = "Descripción del contenido en este campo: <br>1 = Expediente Bloqueado <br>2 = Respuesta otras SIC's")
  public Integer getTipoMensaje() {
    return tipoMensaje;
  }
  public void setTipoMensaje(Integer tipoMensaje) {
    this.tipoMensaje = tipoMensaje;
  }
  public Mensaje leyenda(String leyenda) {
    this.leyenda = leyenda;
    return this;
  }
   
  @ApiModelProperty(example = "No se obtuvo respuesta de otras SIC's", value = "Contiene la descripción del mensaje. Para la respuesta de otras SIC’s ver descripciones en Tabla : Respuestas SIC <br><table><thead><tr><th>Leyenda</th></tr></thead><tbody><tr><td>Respuesta exitosa de otras SIC's</td></tr><tr><td>No se obtuvo respuesta de otras SIC's</td></tr><tr><td>Error en la respuesta otras SIC's</td></tr><tr><td>Sistema no disponible en otras SIC's</td></tr></tbody></table>")
  public String getLeyenda() {
    return leyenda;
  }
  public void setLeyenda(String leyenda) {
    this.leyenda = leyenda;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mensaje mensaje = (Mensaje) o;
    return Objects.equals(this.tipoMensaje, mensaje.tipoMensaje) &&
        Objects.equals(this.leyenda, mensaje.leyenda);
  }
  @Override
  public int hashCode() {
    return Objects.hash(tipoMensaje, leyenda);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mensaje {\n");
    
    sb.append("    tipoMensaje: ").append(toIndentedString(tipoMensaje)).append("\n");
    sb.append("    leyenda: ").append(toIndentedString(leyenda)).append("\n");
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
