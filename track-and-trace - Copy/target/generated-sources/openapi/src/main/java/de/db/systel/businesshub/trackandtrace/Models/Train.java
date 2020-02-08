package de.db.systel.businesshub.trackandtrace.Models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Train
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-08T10:26:06.622+05:30[Asia/Calcutta]")

public class Train   {
  @JsonProperty("trainId")
  private String trainId = null;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  public Train trainId(String trainId) {
    this.trainId = trainId;
    return this;
  }

  /**
   * Train ID; internationally unique identifier of a train according to TAF TSI
   * @return trainId
  **/
  @ApiModelProperty(example = "TR218047111-------012019", value = "Train ID; internationally unique identifier of a train according to TAF TSI")


  public String getTrainId() {
    return trainId;
  }

  public void setTrainId(String trainId) {
    this.trainId = trainId;
  }

  public Train startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date, i.e., date of first departure in first country
   * @return startDate
  **/
  @ApiModelProperty(value = "Start date, i.e., date of first departure in first country")

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Train train = (Train) o;
    return Objects.equals(this.trainId, train.trainId) &&
        Objects.equals(this.startDate, train.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trainId, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Train {\n");
    
    sb.append("    trainId: ").append(toIndentedString(trainId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

