/*
 * Copyright © 2015 SYSTRAN Software, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.systran.platform.translation.client.model;

import net.systran.platform.translation.client.model.BatchRequest;
import net.systran.platform.translation.client.model.ErrorResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class BatchStatus  {
  
  private Boolean cancelled = null;
  private Boolean closed = null;
  private Double createdAt = null;
  private Double expireAt = null;
  private Double finishedAt = null;
  private List<BatchRequest> requests = new ArrayList<BatchRequest>() ;
  private ErrorResponse error = null;

  
  /**
   * Is the batch cancelled
   **/
  @ApiModelProperty(required = true, value = "Is the batch cancelled")
  @JsonProperty("cancelled")
  public Boolean getCancelled() {
    return cancelled;
  }
  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  
  /**
   * Is the batch closed
   **/
  @ApiModelProperty(required = true, value = "Is the batch closed")
  @JsonProperty("closed")
  public Boolean getClosed() {
    return closed;
  }
  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  
  /**
   * Creation time of the batch (ms since the Epoch)
   **/
  @ApiModelProperty(required = true, value = "Creation time of the batch (ms since the Epoch)")
  @JsonProperty("createdAt")
  public Double getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Double createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Expiration time of the batch (ms since the Epoch). Is null while there are pending requests
   **/
  @ApiModelProperty(required = true, value = "Expiration time of the batch (ms since the Epoch). Is null while there are pending requests")
  @JsonProperty("expireAt")
  public Double getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Double expireAt) {
    this.expireAt = expireAt;
  }

  
  /**
   * Completion time of the batch (ms since the Epoch)
   **/
  @ApiModelProperty(required = true, value = "Completion time of the batch (ms since the Epoch)")
  @JsonProperty("finishedAt")
  public Double getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(Double finishedAt) {
    this.finishedAt = finishedAt;
  }

  
  /**
   * Array of requests
   **/
  @ApiModelProperty(required = true, value = "Array of requests")
  @JsonProperty("requests")
  public List<BatchRequest> getRequests() {
    return requests;
  }
  public void setRequests(List<BatchRequest> requests) {
    this.requests = requests;
  }

  
  /**
   * Error of the request
   **/
  @ApiModelProperty(value = "Error of the request")
  @JsonProperty("error")
  public ErrorResponse getError() {
    return error;
  }
  public void setError(ErrorResponse error) {
    this.error = error;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchStatus {\n");
    
    sb.append("  cancelled: ").append(cancelled).append("\n");
    sb.append("  closed: ").append(closed).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  expireAt: ").append(expireAt).append("\n");
    sb.append("  finishedAt: ").append(finishedAt).append("\n");
    sb.append("  requests: ").append(requests).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
