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


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ErrorResponse  {
  
  private String message = null;

  
  /**
   * Readable description of the error
   **/
  @ApiModelProperty(required = true, value = "Readable description of the error")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  @JsonProperty("domain")
  public String getDomain(){
      return domain;
  }
  public void setDomain(String domain){
      this.domain = domain;
  }
  @JsonProperty("statusCode")
  public String getStatusCode(){
      return statusCode;
  }
  public void setStatusCode(String statusCode){
      this.statusCode = statusCode;
  }
  @JsonProperty("details")
  public String getDetails(){
      return this.details;
  }
  public void setDetails(String details){
      this.details = details;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("  domain: ").append(domain).append("\n");
    sb.append("  statusCode: ").append(statusCode).append("\n");
    sb.append("  details: ").append(details).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
