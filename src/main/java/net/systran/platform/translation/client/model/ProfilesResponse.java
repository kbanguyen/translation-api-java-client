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

import net.systran.platform.translation.client.model.Profile;
import java.util.*;
import net.systran.platform.translation.client.model.ErrorResponse;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class ProfilesResponse  {
  
  private ErrorResponse error = null;
  private List<Profile> profiles = new ArrayList<Profile>() ;

  
  /**
   * Error at request level
   **/
  @ApiModelProperty(value = "Error at request level")
  @JsonProperty("error")
  public ErrorResponse getError() {
    return error;
  }
  public void setError(ErrorResponse error) {
    this.error = error;
  }

  
  /**
   * Array of profiles
   **/
  @ApiModelProperty(required = true, value = "Array of profiles")
  @JsonProperty("profiles")
  public List<Profile> getProfiles() {
    return profiles;
  }
  public void setProfiles(List<Profile> profiles) {
    this.profiles = profiles;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilesResponse {\n");
    
    sb.append("  error: ").append(error).append("\n");
    sb.append("  profiles: ").append(profiles).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
