package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.Score;
import java.util.ArrayList;
import java.util.List;
@ApiModel(description = "Si existen errores, se listarán.")


public class Scores {
  @SerializedName("scores")
  private List<Score> scores = null;
  public Scores scores(List<Score> scores) {
    this.scores = scores;
    return this;
  }
  public Scores addScoresItem(Score scoresItem) {
    if (this.scores == null) {
      this.scores = new ArrayList<Score>();
    }
    this.scores.add(scoresItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Score> getScores() {
    return scores;
  }
  public void setScores(List<Score> scores) {
    this.scores = scores;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scores scores = (Scores) o;
    return Objects.equals(this.scores, scores.scores);
  }
  @Override
  public int hashCode() {
    return Objects.hash(scores);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scores {\n");
    
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
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
