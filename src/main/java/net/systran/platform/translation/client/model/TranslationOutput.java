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
public class TranslationOutput  {
  
  private String warning = null;
  private String error = null;
  private String detectedLanguage = null;
  private Double detectedLanguageConfidence = null;
  private String output = null;
  private String backTranslation = null;
  private String source = null;

  
  /**
   * Warning at output level
   **/
  @ApiModelProperty(value = "Warning at output level")
  @JsonProperty("warning")
  public String getWarning() {
    return warning;
  }
  public void setWarning(String warning) {
    this.warning = warning;
  }

  
  /**
   * Error at output level
   **/
  @ApiModelProperty(value = "Error at output level")
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   * Result of the automatic language detection if `auto` was specified as source language
   **/
  @ApiModelProperty(value = "Result of the automatic language detection if `auto` was specified as source language")
  @JsonProperty("detectedLanguage")
  public String getDetectedLanguage() {
    return detectedLanguage;
  }
  public void setDetectedLanguage(String detectedLanguage) {
    this.detectedLanguage = detectedLanguage;
  }

  
  /**
   * Automatic language detection confidence
   **/
  @ApiModelProperty(value = "Automatic language detection confidence")
  @JsonProperty("detectedLanguageConfidence")
  public Double getDetectedLanguageConfidence() {
    return detectedLanguageConfidence;
  }
  public void setDetectedLanguageConfidence(Double detectedLanguageConfidence) {
    this.detectedLanguageConfidence = detectedLanguageConfidence;
  }

  
  /**
   * Translated text
   **/
  @ApiModelProperty(value = "Translated text")
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }
  public void setOutput(String output) {
    this.output = output;
  }

  
  /**
   * Retranslation of output in source language, if backTranslation was specified
   **/
  @ApiModelProperty(value = "Retranslation of output in source language, if backTranslation was specified")
  @JsonProperty("backTranslation")
  public String getBackTranslation() {
    return backTranslation;
  }
  public void setBackTranslation(String backTranslation) {
    this.backTranslation = backTranslation;
  }

  
  /**
   * Source text, if withSource was specified
   **/
  @ApiModelProperty(value = "Source text, if withSource was specified")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslationOutput {\n");
    
    sb.append("  warning: ").append(warning).append("\n");
    sb.append("  error: ").append(error).append("\n");
    sb.append("  detectedLanguage: ").append(detectedLanguage).append("\n");
    sb.append("  detectedLanguageConfidence: ").append(detectedLanguageConfidence).append("\n");
    sb.append("  output: ").append(output).append("\n");
    sb.append("  backTranslation: ").append(backTranslation).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
