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

import net.systran.platform.translation.client.model.TranslationOutput;
import java.util.*;
import net.systran.platform.translation.client.model.ErrorResponse;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@ApiModel(description = "By default (synchronous mode), the response will be a JSON object containing the result of the translation.\n\n```\n  {\n    \"warning\": \"\", /* Warning at request level */\n    \"error\": {\n      \"message\": \"\" /* Error at request level */\n      \"info\": {}\n    },\n    \"outputs\": [\n       {\n           \"warning\": \"\", /* Warning at input level */\n           \"error\": \"\", /* Error at input level */\n           \"detectedLanguage\": \"fr\", /* Result of the automatic language detection if selected */\n           \"detectedLanguageConfidence\": 0.73, /* automatic language detection confidence if selected */\n           \"output\": \"translated text 1\", /* Translate text */\n           \"backTranslation\": \"retranslation of output in fr\"\n       },\n       {\n           \"warning\": \"\", /* Warning at input level */\n           \"error\": \"\", /* Error at input level */\n           \"detectedLanguage\": \"fr\", /* Result of the automatic language detection if selected */\n           \"detectedLanguageConfidence\": 0.75, /* automatic language detection confidence if selected */\n           \"output\": \"translated text 2\" /* Translate text */\n           \"backTranslation\": \"retranslation of output in fr\"\n       }\n    ]\n  }\n```\n\nIn asynchronous mode, the response will be a JSON containing a request identifier. This identifier can then be used to poll the request status and its result when completed.\n\n```\n{\n   \"error\": {\n     \"message\": \"\" /* Error at request level */\n     \"info\": {}\n   }\n   \"requestId\": \"54a3d860e62ea467b136eddb\" /* Request identifier to use to get the status, the result of the request and to cancel it */\n}\n```\n")
public class TranslationResponse  {
  
  private String warning = null;
  private ErrorResponse error = null;
  private String requestId = null;
  private List<TranslationOutput> outputs = new ArrayList<TranslationOutput>() ;

  
  /**
   * Warning at request level
   **/
  @ApiModelProperty(value = "Warning at request level")
  @JsonProperty("warning")
  public String getWarning() {
    return warning;
  }
  public void setWarning(String warning) {
    this.warning = warning;
  }

  
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
   * Request identifier to use to get the status, the result of the request and to cancel it in asynchronous mode
   **/
  @ApiModelProperty(value = "Request identifier to use to get the status, the result of the request and to cancel it in asynchronous mode")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  
  /**
   * Outputs of translation
   **/
  @ApiModelProperty(value = "Outputs of translation")
  @JsonProperty("outputs")
  public List<TranslationOutput> getOutputs() {
    return outputs;
  }
  public void setOutputs(List<TranslationOutput> outputs) {
    this.outputs = outputs;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationResponse {\n");
    
    sb.append("  warning: ").append(warning).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  requestId: ").append(requestId).append("\n");
    sb.append("  outputs: ").append(outputs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
