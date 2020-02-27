package io.RCCFicoScorePLDSimulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.RCCFicoScorePLDSimulacion.client.model.DomicilioRespuesta;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Si existen créditos, se listarán.")


public class DomiciliosRespuesta {
  @SerializedName("domicilios")
  private List<DomicilioRespuesta> domicilios = null;
  public DomiciliosRespuesta domicilios(List<DomicilioRespuesta> domicilios) {
    this.domicilios = domicilios;
    return this;
  }
  public DomiciliosRespuesta addDomiciliosItem(DomicilioRespuesta domiciliosItem) {
    if (this.domicilios == null) {
      this.domicilios = new ArrayList<DomicilioRespuesta>();
    }
    this.domicilios.add(domiciliosItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<DomicilioRespuesta> getDomicilios() {
    return domicilios;
  }
  public void setDomicilios(List<DomicilioRespuesta> domicilios) {
    this.domicilios = domicilios;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomiciliosRespuesta domiciliosRespuesta = (DomiciliosRespuesta) o;
    return Objects.equals(this.domicilios, domiciliosRespuesta.domicilios);
  }
  @Override
  public int hashCode() {
    return Objects.hash(domicilios);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomiciliosRespuesta {\n");
    
    sb.append("    domicilios: ").append(toIndentedString(domicilios)).append("\n");
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
