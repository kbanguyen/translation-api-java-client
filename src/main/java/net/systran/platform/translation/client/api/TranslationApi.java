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

package net.systran.platform.translation.client.api;

import net.systran.platform.translation.client.ApiException;
import net.systran.platform.translation.client.ApiClient;
import net.systran.platform.translation.client.Configuration;

import net.systran.platform.translation.client.model.*;

import java.util.*;

import net.systran.platform.translation.client.model.BatchCancel;
import net.systran.platform.translation.client.model.BatchClose;
import net.systran.platform.translation.client.model.BatchCreate;
import net.systran.platform.translation.client.model.BatchStatus;
import net.systran.platform.translation.client.model.ProfilesResponse;
import net.systran.platform.translation.client.model.SupportedLanguageResponse;
import net.systran.platform.translation.client.model.TranslationResponse;
import net.systran.platform.translation.client.model.TranslationCancel;
import net.systran.platform.translation.client.model.TranslationFileResponse;
import java.io.File;
import net.systran.platform.translation.client.model.TranslationStatus;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class TranslationApi {
  private ApiClient apiClient;

  public TranslationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TranslationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Batch Cancel
   * Cancel a translation batch\n
   * @param batchId Batch Identifier\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return BatchCancel
   */
  public BatchCancel translationBatchCancelGet (String batchId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'batchId' is set
    if (batchId == null) {
       throw new ApiException(400, "Missing the required parameter 'batchId' when calling translationBatchCancelGet");
    }
    

    // create path and map variables
    String path = "/translation/batch/cancel".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (batchId != null)
      queryParams.put("batchId", apiClient.parameterToString(batchId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (BatchCancel) apiClient.deserialize(response, "", BatchCancel.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Batch Close
   * Close a translation batch\n
   * @param batchId Batch Identifier\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return BatchClose
   */
  public BatchClose translationBatchCloseGet (String batchId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'batchId' is set
    if (batchId == null) {
       throw new ApiException(400, "Missing the required parameter 'batchId' when calling translationBatchCloseGet");
    }
    

    // create path and map variables
    String path = "/translation/batch/close".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (batchId != null)
      queryParams.put("batchId", apiClient.parameterToString(batchId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (BatchClose) apiClient.deserialize(response, "", BatchClose.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Batch Create
   * Create a new translation batch\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return BatchCreate
   */
  public BatchCreate translationBatchCreateGet (String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/translation/batch/create".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (BatchCreate) apiClient.deserialize(response, "", BatchCreate.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Batch Status
   * Get the status of a translation batch\n
   * @param batchId Batch Identifier\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return BatchStatus
   */
  public BatchStatus translationBatchStatusGet (String batchId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'batchId' is set
    if (batchId == null) {
       throw new ApiException(400, "Missing the required parameter 'batchId' when calling translationBatchStatusGet");
    }
    

    // create path and map variables
    String path = "/translation/batch/status".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (batchId != null)
      queryParams.put("batchId", apiClient.parameterToString(batchId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (BatchStatus) apiClient.deserialize(response, "", BatchStatus.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List of profiles
   * List of profiles available for translation.\n
   * @param source Source language code of the profile
   * @param target Target Language code of the profile\n
   * @param id Identifier of the profile\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return ProfilesResponse
   */
  public ProfilesResponse translationProfileGet (String source, String target, List<Integer> id, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/translation/profile".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
    if (id != null)
      queryParams.put("id", apiClient.parameterToString(id));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (ProfilesResponse) apiClient.deserialize(response, "", ProfilesResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Supported Languages
   * List of language pairs in which translation is supported.\n\nThis list can be limited to a specific source language or target language.\n
   * @param source Language code of the source text\n
   * @param target Language code into which to translate the source text\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return SupportedLanguageResponse
   */
  public SupportedLanguageResponse translationSupportedLanguagesGet (List<String> source, List<String> target, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/translation/supportedLanguages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (SupportedLanguageResponse) apiClient.deserialize(response, "", SupportedLanguageResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Translate
   * Translate text from source language to target language\n
   * @param input Input text (this parameter can be repeated)\n
   * @param source Source language code ([details](#description_langage_code_values)) or `auto`.\n\nWhen the value is set to `auto`, the language will be automatically detected, used to enhance the translation, and returned in output.\n
   * @param target Target language code ([details](#description_langage_code_values))
   * @param format Format of the source text.\n\nValid values are `text` for plain text, `html` for HTML pages, and `auto` for automatic detection. The MIME type of file format supported by SYSTRAN can also be used (application/vnd.openxmlformats, application/vnd.oasis.opendocument, ...)\n
   * @param profile Profile id\n
   * @param withSource If `true`, the source will also be sent back in the response message. It can be useful when used with the withAnnotations option to align the source document with the translated document\n
   * @param withAnnotations If `true`, different annotations will be provided in the translated document. If the option &#39;withSource&#39; is used, the annotations will also be provided in the source document. It will provide segments, tokens, not found words,...\n
   * @param withDictionary User Dictionary or/and Normalization Dictionary ids to be applied to the translation result. Each dictionary &#39;id&#39; has to be separate by a comma.\n
   * @param withCorpus Corpus to be applied to the translation result. Each corpus &#39;id&#39; has to be separate by a comma.\n
   * @param backTranslation If `true`, the translated text will be translated back in source language\n
   * @param options Additional options.\n\nAn option can be a JSON object containing a set of key/value generic options supported by the translator. It can also be a string with the syntax &#39;&lt;key&gt;:&lt;value&gt;&#39; to pass a key/value generic option to the translator.\n
   * @param encoding Encoding. `base64` can be useful to send binary documents in the JSON body. Please note that another alternative is to use translateFile\n
   * @param async If `true`, the translation is performed asynchronously.\n\nThe \&quot;/translate/status\&quot; service must be used to wait for the completion of the request and the \&quot;translate/result\&quot; service must be used to get the final result. The \&quot;/translate/cancel\&quot; can be used to cancel the request.\n
   * @param batchId Batch Identifier\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return TranslationResponse
   */
  public TranslationResponse translationTranslateGet (List<String> input, String source, String target, String format, Integer profile, Boolean withSource, Boolean withAnnotations, String withDictionary, String withCorpus, Boolean backTranslation, List<String> options, String encoding, Boolean async, String batchId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling translationTranslateGet");
    }
    
    // verify the required parameter 'target' is set
    if (target == null) {
       throw new ApiException(400, "Missing the required parameter 'target' when calling translationTranslateGet");
    }
    

    // create path and map variables
    String path = "/translation/translate".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
    if (format != null)
      queryParams.put("format", apiClient.parameterToString(format));
    if (profile != null)
      queryParams.put("profile", apiClient.parameterToString(profile));
    if (withSource != null)
      queryParams.put("withSource", apiClient.parameterToString(withSource));
    if (withAnnotations != null)
      queryParams.put("withAnnotations", apiClient.parameterToString(withAnnotations));
    if (withDictionary != null)
      queryParams.put("withDictionary", apiClient.parameterToString(withDictionary));
    if (withCorpus != null)
      queryParams.put("withCorpus", apiClient.parameterToString(withCorpus));
    if (backTranslation != null)
      queryParams.put("backTranslation", apiClient.parameterToString(backTranslation));
    if (options != null)
      queryParams.put("options", apiClient.parameterToString(options));
    if (encoding != null)
      queryParams.put("encoding", apiClient.parameterToString(encoding));
    if (async != null)
      queryParams.put("async", apiClient.parameterToString(async));
    if (batchId != null)
      queryParams.put("batchId", apiClient.parameterToString(batchId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (TranslationResponse) apiClient.deserialize(response, "", TranslationResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Translate Cancel
   * Cancel an asynchronous translation request\n
   * @param requestId Request Identifier\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return TranslationCancel
   */
  public TranslationCancel translationTranslateCancelGet (String requestId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
       throw new ApiException(400, "Missing the required parameter 'requestId' when calling translationTranslateCancelGet");
    }
    

    // create path and map variables
    String path = "/translation/translate/cancel".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (requestId != null)
      queryParams.put("requestId", apiClient.parameterToString(requestId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (TranslationCancel) apiClient.deserialize(response, "", TranslationCancel.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Translate file
   * Translate a file from source language to target language\n\n\n* In asynchronous mode (async=true), the response will be a JSON containing a request identifier. This identifier can then be used to poll the request status and its result when completed.\n\n  ```\n  {\n     \&quot;requestId\&quot;: \&quot;54a3d860e62ea467b136eddb\&quot; /* Request identifier to use to get the status,\n                                                the result of the request and to cancel it *\n     \&quot;error\&quot;: \&quot;\&quot;, /* Error at request level *\n  }\n  ```\n\n* In synchronous mode, the response will be either:\n\n  * The **translated document**, directly, if `source` parameters was not `auto` and `withSource` was not true\n  * A `multipart/mixed` document with the following parts:\n\n    1. **Detected language**, if request was done with `auto` source language\n\n      * Header:\n\n        `part-name: detectedLanguage`\n\n      * Body: JSON document\n        ```\n        {\n          detectedLanguage: \&quot;string\&quot;\n          detectedLanguageConfidence : number\n        }\n        ```\n\n    2. **Source document**, if request was done with `withSource`:\n\n      * Header: `part-name: source`\n      * Body: Source document\n\n    3. **Translated document**\n\n      * Header: `part-name: output`\n\n      * Body: Translated document\n
   * @param input Input file\n
   * @param source Source language code ([details](#description_langage_code_values)) or `auto`.\n\nWhen the value is set to `auto`, the language will be automatically detected, used to enhance the translation, and returned in output.\n
   * @param target Target language code ([details](#description_langage_code_values))
   * @param format Format of the source text.\n\nValid values are `text` for plain text, `html` for HTML pages, and `auto` for automatic detection. The MIME type of file format supported by SYSTRAN can also be used (application/vnd.openxmlformats, application/vnd.oasis.opendocument, ...)\n
   * @param profile Profile id\n
   * @param withSource If `true`, the source will also be sent back in the response message. It can be useful when used with the withAnnotations option to align the source document with the translated document\n
   * @param withAnnotations If `true`, different annotations will be provided in the translated document. If the option &#39;withSource&#39; is used, the annotations will also be provided in the source document. It will provide segments, tokens, not found words,...\n
   * @param withDictionary User Dictionary or/and Normalization Dictionary ids to be applied to the translation result. Each dictionary &#39;id&#39; has to be separate by a comma.\n
   * @param withCorpus Corpus to be applied to the translation result. Each corpus &#39;id&#39; has to be separate by a comma.\n
   * @param options Additional options.\n\nAn option can be a JSON object containing a set of key/value generic options supported by the translator. It can also be a string with the syntax &#39;&lt;key&gt;:&lt;value&gt;&#39; to pass a key/value generic option to the translator.\n
   * @param encoding Encoding. `base64` can be useful to send binary documents in the JSON body. Please note that another alternative is to use translateFile\n
   * @param async If `true`, the translation is performed asynchronously.\n\nThe \&quot;/translate/status\&quot; service must be used to wait for the completion of the request and the \&quot;translate/result\&quot; service must be used to get the final result. The \&quot;/translate/cancel\&quot; can be used to cancel the request.\n
   * @param batchId Batch Identifier\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return TranslationFileResponse
   */
  public TranslationFileResponse translationTranslateFileGet (File input, String source, String target, String format, Integer profile, Boolean withSource, Boolean withAnnotations, String withDictionary, String withCorpus, List<String> options, String encoding, Boolean async, String batchId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'input' is set
    if (input == null) {
       throw new ApiException(400, "Missing the required parameter 'input' when calling translationTranslateFileGet");
    }
    
    // verify the required parameter 'target' is set
    if (target == null) {
       throw new ApiException(400, "Missing the required parameter 'target' when calling translationTranslateFileGet");
    }
    

    // create path and map variables
    String path = "/translation/translate/file".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
    if (format != null)
      queryParams.put("format", apiClient.parameterToString(format));
    if (profile != null)
      queryParams.put("profile", apiClient.parameterToString(profile));
    if (withSource != null)
      queryParams.put("withSource", apiClient.parameterToString(withSource));
    if (withAnnotations != null)
      queryParams.put("withAnnotations", apiClient.parameterToString(withAnnotations));
    if (withDictionary != null)
      queryParams.put("withDictionary", apiClient.parameterToString(withDictionary));
    if (withCorpus != null)
      queryParams.put("withCorpus", apiClient.parameterToString(withCorpus));
    if (options != null)
      queryParams.put("options", apiClient.parameterToString(options));
    if (encoding != null)
      queryParams.put("encoding", apiClient.parameterToString(encoding));
    if (async != null)
      queryParams.put("async", apiClient.parameterToString(async));
    if (batchId != null)
      queryParams.put("batchId", apiClient.parameterToString(batchId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json", "multipart/mixed", "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "multipart/form-data", "application/x-www-form-urlencoded", "*/*"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if (input != null) {
        hasFields = true;
        mp.field("input", input.getName());
        mp.bodyPart(new FileDataBodyPart("input", input, MediaType.MULTIPART_FORM_DATA_TYPE));
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        Object res = apiClient.deserialize(response, "", TranslationFileResponse.class);

        if(res instanceof TranslationFileResponse) {
          return (TranslationFileResponse) res;
        }

        TranslationFileResponse obj = new TranslationFileResponse();
        if(res instanceof InputStream) {
          obj.setOutput((InputStream)res);
        } else if(res instanceof MultipartResponse) {
          MultipartResponse multipart = (MultipartResponse) res;
          obj.setDetectedLanguage(multipart.getDetectedLanguage());
          obj.setDetectedLanguageConfidence(multipart.getDetectedLanguageConfidence());
          obj.setSource(multipart.getSource());
          obj.setOutput(multipart.getOutput());
        }
        return obj;
        
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Translate Result
   * Get the result of an asynchronous translation request\n\nDepending on the initial request, the response can have multiple formats:\n* `/translation/translate` initiated request\n\n    &amp;#x2192; the response will be a JSON document (model below)\n\n* `/translation/translate/file` initiated request\n\n   &amp;#x2192; the response will be either:\n\n  * The **translated document**, directly, if `source` parameters was not `auto` and `withSource` was not true\n  * A `multipart/mixed` document with the following parts:\n\n    1. **Detected language**, if request was done with `auto` source language\n\n      * Header:\n\n        `part-name: detectedLanguage`\n\n      * Body: JSON document\n        ```\n        {\n          detectedLanguage: \&quot;string\&quot;\n          detectedLanguageConfidence : number\n        }\n        ```\n\n    2. **Source document**, if request was done with `withSource`:\n\n      * Header: `part-name: source`\n      * Body: Source document\n\n    3. **Translated document**\n\n      * Header: `part-name: output`\n\n      * Body: Translated document\n\nAn error can occur in the following cases:\n* Invalid request ID\n* No result available (see request status for more information)\n* Unable to retrieve the result\n* ...\n
   * @param requestId Request Identifier\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return TranslationResponse
   */
  public TranslationResponse translationTranslateResultGet (String requestId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
       throw new ApiException(400, "Missing the required parameter 'requestId' when calling translationTranslateResultGet");
    }
    

    // create path and map variables
    String path = "/translation/translate/result".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (requestId != null)
      queryParams.put("requestId", apiClient.parameterToString(requestId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json", "multipart/mixed", "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        Object res = apiClient.deserialize(response, "", TranslationResponse.class);

        if(res instanceof TranslationResponse) {
          return (TranslationResponse) res;
        }

        TranslationResponse obj = new TranslationResponse();
        if(res instanceof InputStream) {
          obj.setOutput((InputStream)res);
        } else if(res instanceof MultipartResponse) {
          MultipartResponse multipart = (MultipartResponse) res;
          obj.setDetectedLanguage(multipart.getDetectedLanguage());
          obj.setDetectedLanguageConfidence(multipart.getDetectedLanguageConfidence());
          obj.setSource(multipart.getSource());
          obj.setOutput(multipart.getOutput());
        }
        return obj;
        
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Translate Status
   * Get the status of an asynchronous translation request\n\nThe translation result is available when the value of the status field is `finished`.\n\nThe translation request is unsuccessful when the value of the status field is `error`.\n
   * @param requestId Request Identifier\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return TranslationStatus
   */
  public TranslationStatus translationTranslateStatusGet (String requestId, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
       throw new ApiException(400, "Missing the required parameter 'requestId' when calling translationTranslateStatusGet");
    }
    

    // create path and map variables
    String path = "/translation/translate/status".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (requestId != null)
      queryParams.put("requestId", apiClient.parameterToString(requestId));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (TranslationStatus) apiClient.deserialize(response, "", TranslationStatus.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
