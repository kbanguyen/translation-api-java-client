package net.systran.platform.translation.client;


import net.systran.platform.translation.client.api.TranslationApi;
import net.systran.platform.translation.client.auth.ApiKeyAuth;
import net.systran.platform.translation.client.model.*;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static junit.framework.TestCase.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestTranslation {
    public static TranslationApi getTranslationApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new TranslationApi(apc);
    }

    @Test
    public void testTranslationSupportedLanguagesGet() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        SupportedLanguageResponse supportedLanguageResponse = api.translationSupportedLanguagesGet(null, null, null);
        System.out.println(supportedLanguageResponse.toString());
    }

    @Test
    public void testTranslationSupportedLanguagesGetWithSourceAndTarget() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> sources = new ArrayList<String>();
        sources.add("en");
        List<String> targets = new ArrayList<String>();
        targets.add("fr");

        SupportedLanguageResponse supportedLanguageResponse = api.translationSupportedLanguagesGet(sources, targets, null);
        System.out.println(supportedLanguageResponse.toString());
    }

    @Test
    public void testTranslationProfileGet() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        ProfilesResponse profilesResponse = api.translationProfileGet(null, null, null, null);
        System.out.println(profilesResponse.toString());
    }

    @Test
    public void testTranslationProfileGetWithSourceAndTarget() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        String source = "en";
        String target = "fr";
        ProfilesResponse profilesResponse = api.translationProfileGet(source, target, null, null);
        System.out.println(profilesResponse.toString());
    }

    @Test
    public void testTranslationTranslateGet() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> inputs = new ArrayList<String>();
        inputs.add("This is a test");
        String source = "en";
        String target = "fr";
        TranslationResponse translationResponse = api.translationTextTranslateGet(inputs, source, target, null, null, null, null, null, null, null, null, null, null);
        System.out.println(translationResponse.toString());
    }

    @Test
    public void testTranslationTranslateGetAutoFr() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> inputs = new ArrayList<String>();
        inputs.add("This is a test");
        String target = "fr";
        TranslationResponse translationResponse = api.translationTextTranslateGet(inputs, null, target, null, null, null, null, null, null, null, null, null, null);
        System.out.println(translationResponse.toString());
    }

    @Test
    public void testTranslationTranslateGetAutoFrWithSeveralInputs() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> inputs = new ArrayList<String>();
        inputs.add("This is a test");
        inputs.add("I like playing football");
        String target = "fr";
        TranslationResponse translationResponse = api.translationTextTranslateGet(inputs, null, target, null, null, null, null, null, null, null, null, null, null);
        System.out.println(translationResponse.toString());
    }

    @Test
    public void testTranslationTranslateGetAutoFrWithSeveralInputsAndWithSource() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> inputs = new ArrayList<String>();
        inputs.add("This is a test");
        inputs.add("I like playing football");
        String target = "fr";
        Boolean withSource = true;
        TranslationResponse translationResponse = api.translationTextTranslateGet(inputs, null, target, null, null, withSource, null, null, null, null, null, null, null);
        System.out.println(translationResponse.toString());
    }

    @Test
    public void testTranslationTranslateGetAutoFrHtml() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> inputs = new ArrayList<String>();
        inputs.add("<html>this is <b>black</b> dog");
        String target = "fr";
        TranslationResponse translationResponse = api.translationTextTranslateGet(inputs, null, target, null, null, null, null, null, null, null, null, null, null);
        System.out.println(translationResponse.toString());
    }

    @Test
    public void testTranslationTranslateGetAutoFrHtmlWithFormat() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> inputs = new ArrayList<String>();
        inputs.add("<html>this is <b>black</b> dog");
        String target = "fr";
        String format = "text/html";
        TranslationResponse translationResponse = api.translationTextTranslateGet(inputs, null, target, format, null, null, null, null, null, null, null, null, null);
        System.out.println(translationResponse.toString());
    }

    @Test
    public void testTranslationTranslateGetAutoFrHtmlWithFormatSourceAnnotations() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> inputs = new ArrayList<String>();
        inputs.add("<html>this is <b>black</b> dog");
        String target = "fr";
        String format = "text/html";
        Boolean withSource = true;
        Boolean withAnnotations = true;
        TranslationResponse translationResponse = api.translationTextTranslateGet(inputs, null, target, format, null, withSource, withAnnotations, null, null, null, null, null, null);
        System.out.println(translationResponse.toString());
    }

    @Test
    public void testTranslationTranslateGetAutoFrHtmlWithSeveralInputsWithFormatSourceAnnotations() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        List<String> inputs = new ArrayList<String>();
        inputs.add("<html>this is <b>black</b> dog");
        inputs.add("<html>this is <b>white</b> cat");
        String target = "fr";
        String format = "text/html";
        Boolean withSource = true;
        Boolean withAnnotations = true;
        TranslationResponse translationResponse = api.translationTextTranslateGet(inputs, null, target, format, null, withSource, withAnnotations, null, null, null, null, null, null);
        System.out.println(translationResponse.toString());
    }

    // Translate file
    @Test
    public void testTranslationTranslateFileGet() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        File inputFile = new File(".//src//test//java//net//systran//platform//translation//client//test.html");
        String source = "en";
        String target = "fr";
        TranslationFileResponse translationFileResponse = api.translationFileTranslateGet(inputFile, source, target, null, null, null, null, null, null, null, null, null, null, null);
        File out = new File (".//src//test//java//net//systran//platform//translation//client//translation_output.html");
        FileUtils.copyInputStreamToFile(translationFileResponse.getOutput(), out);
        System.out.println("Translated file saved in : " + out.getAbsolutePath());
    }

    @Test
    public void testTranslationTranslateFileGetAutoFr() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        File inputFile = new File(".//src//test//java//net//systran//platform//translation//client//test.html");
        String target = "fr";
        TranslationFileResponse translationFileResponse = api.translationFileTranslateGet(inputFile, null, target, null, null, null, null, null, null, null, null, null, null, null);
        System.out.println("DetectedLanguage : " + translationFileResponse.getDetectedLanguage() + "\n" + "DetectedLanguageConfidence : " + translationFileResponse.getDetectedLanguageConfidence());
        File out = new File (".//src//test//java//net//systran//platform//translation//client//translation_output.html");
        FileUtils.copyInputStreamToFile(translationFileResponse.getOutput(), out);
        System.out.println("Translated file saved in : " + out.getAbsolutePath());
    }

    @Test
    public void testTranslationTranslateFileGetEnFrWithSource() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        File inputFile = new File(".//src//test//java//net//systran//platform//translation//client//test.html");
        String source = "en";
        String target = "fr";
        Boolean withSource = true;
        TranslationFileResponse translationFileResponse = api.translationFileTranslateGet(inputFile, source, target, null, null, withSource, null, null, null, null, null, null, null, null);
        File sourceFile = new File (".//src//test//java//net//systran//platform//translation//client//translation_source.html");
        FileUtils.copyInputStreamToFile(translationFileResponse.getSource(), sourceFile);
        System.out.println("Source file saved in : " + sourceFile.getAbsolutePath());

        File out = new File (".//src//test//java//net//systran//platform//translation//client//translation_output.html");
        FileUtils.copyInputStreamToFile(translationFileResponse.getOutput(), out);
        System.out.println("Translated file saved in : " + out.getAbsolutePath());
    }

    @Test
    public void testTranslationTranslateFileGetEnFrWithSourceAnnotations() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        File inputFile = new File(".//src//test//java//net//systran//platform//translation//client//test.html");
        String source = "en";
        String target = "fr";
        Boolean withSource = true;
        Boolean withAnnotations = true;
        TranslationFileResponse translationFileResponse = api.translationFileTranslateGet(inputFile, source, target, null, null, withSource, withAnnotations, null, null, null, null, null, null, null);
        File sourceFile = new File (".//src//test//java//net//systran//platform//translation//client//translation_source.html");
        FileUtils.copyInputStreamToFile(translationFileResponse.getSource(), sourceFile);
        System.out.println("Source file saved in : " + sourceFile.getAbsolutePath());

        File out = new File (".//src//test//java//net//systran//platform//translation//client//translation_output.html");
        FileUtils.copyInputStreamToFile(translationFileResponse.getOutput(), out);
        System.out.println("Translated file saved in : " + out.getAbsolutePath());
    }

    @Test
    public void testTranslationTranslateFileGetAutoFrWithSourceAnnotations() throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        File inputFile = new File(".//src//test//java//net//systran//platform//translation//client//test.html");
        String target = "fr";
        Boolean withSource = true;
        Boolean withAnnotations = true;
        TranslationFileResponse translationFileResponse = api.translationFileTranslateGet(inputFile, null, target, null, null, withSource, withAnnotations, null, null, null, null, null, null, null);
        System.out.println("DetectedLanguage : " + translationFileResponse.getDetectedLanguage() + "\n" + "DetectedLanguageConfidence : " + translationFileResponse.getDetectedLanguageConfidence());

        File sourceFile = new File (".//src//test//java//net//systran//platform//translation//client//translation_source.html");
        FileUtils.copyInputStreamToFile(translationFileResponse.getSource(), sourceFile);
        System.out.println("Source file saved in : " + sourceFile.getAbsolutePath());

        File out = new File (".//src//test//java//net//systran//platform//translation//client//translation_output.html");
        FileUtils.copyInputStreamToFile(translationFileResponse.getOutput(), out);
        System.out.println("Translated file saved in : " + out.getAbsolutePath());
    }

    // Translate file async
    public int getTranslationStatus(String requestId) throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        TranslationStatus translationStatus = api.translationFileStatusGet(requestId, null);
        System.out.println(translationStatus.toString());
        if (translationStatus.getStatus().equals(TranslationStatus.StatusEnum.finished))
            return 1;
        if (translationStatus.getStatus().equals(TranslationStatus.StatusEnum.error))
            return -1;
        return 0;
    }

    public void getTranslateResult(String requestId) throws ApiException, IOException {
        TranslationApi api = getTranslationApi();
        TranslationFileResponse translationFileResponse = api.translationFileResultGet(requestId, null);
        System.out.println(translationFileResponse.toString());
        if (translationFileResponse.getDetectedLanguage() != null)
            System.out.println("DetectedLanguage : " + translationFileResponse.getDetectedLanguage() + "\n" + "DetectedLanguageConfidence : " + translationFileResponse.getDetectedLanguageConfidence());

        if (translationFileResponse.getSource() != null) {
            File sourceFile = new File (".//src//test//java//net//systran//platform//translation//client//translation_source.html");
            FileUtils.copyInputStreamToFile(translationFileResponse.getSource(), sourceFile);
            System.out.println("Source file saved in : " + sourceFile.getAbsolutePath());
        }

        if (translationFileResponse.getOutput() != null) {
            File out = new File (".//src//test//java//net//systran//platform//translation//client//translation_output.html");
            FileUtils.copyInputStreamToFile(translationFileResponse.getOutput(), out);
            System.out.println("Translated file saved in : " + out.getAbsolutePath());
        }
    }

    @Test
    public void testTranslationTranslateFileGetAsync() throws ApiException, IOException, InterruptedException {
        TranslationApi api = getTranslationApi();
        File inputFile = new File(".//src//test//java//net//systran//platform//translation//client//test.html");
        String source = "en";
        String target = "fr";
        Boolean async = true;
        TranslationFileResponse translationFileResponse = api.translationFileTranslateGet(inputFile, source, target, null, null, null, null, null, null, null, null, async, null, null);
        System.out.println(translationFileResponse.toString());
        String requestId = translationFileResponse.getRequestId();
        assertNotNull(requestId);
        int finish = 0;
        while (finish == 0) {
            Thread.sleep(5 * 1000);
            finish = getTranslationStatus(requestId);
        }

        assertTrue(finish == 1);
        getTranslateResult(requestId);
    }

    @Test
    public void testTranslationTranslateFileGetAsyncAutoFrWithSourceAnnotation() throws ApiException, IOException, InterruptedException {
        TranslationApi api = getTranslationApi();
        File inputFile = new File(".//src//test//java//net//systran//platform//translation//client//test.html");
        String target = "fr";
        Boolean withSource = true;
        Boolean withAnnotations = true;
        Boolean async = true;
        TranslationFileResponse translationFileResponse = api.translationFileTranslateGet(inputFile, null, target, null, null, withSource, withAnnotations, null, null, null, null, async, null, null);
        System.out.println(translationFileResponse.toString());
        String requestId = translationFileResponse.getRequestId();
        assertNotNull(requestId);
        int finish = 0;
        while (finish == 0) {
            Thread.sleep(5 * 1000);
            finish = getTranslationStatus(requestId);
        }

        assertTrue(finish == 1);
        getTranslateResult(requestId);
    }

    // translation with batch
    @Test
    public void testBatchTranslationComplete() throws ApiException, IOException, InterruptedException {
        TranslationApi api = getTranslationApi();

        // create a batch to do some translations
        BatchCreate batchCreate = api.translationFileBatchCreateGet(null);
        System.out.println("batchCreate response : " + batchCreate.toString());
        assertNotNull(batchCreate.getBatchId());
        String batchId = batchCreate.getBatchId();

        // get status for new created batch
        BatchStatus batchStatus = api.translationFileBatchStatusGet(batchId, null);
        System.out.println("batchStatus response : " + batchStatus.toString());

        // add a translation to the batch
        File inputFile = new File(".//src//test//java//net//systran//platform//translation//client//test.html");
        String source = "en";
        String target = "fr";
        Boolean withSource = true;
        Boolean withAnnotations = true;
        Boolean async = true;
        TranslationFileResponse translationFileResponse = api.translationFileTranslateGet(inputFile, source, target, null, null, withSource, withAnnotations, null, null, null, null, async, batchId, null);
        System.out.println("translationFileResponse : " + translationFileResponse.toString());
        String requestId = translationFileResponse.getRequestId();
        assertNotNull(requestId);

        // get status after adding a translation request
        BatchStatus batchStatusWithRequest = api.translationFileBatchStatusGet(batchId, null);
        System.out.println("batchStatus with a translation request : " + batchStatusWithRequest.toString());

        int finish = 0;
        while (finish == 0) {
            Thread.sleep(5 * 1000);
            finish = getTranslationStatus(requestId);
        }

        assertTrue(finish == 1);
        getTranslateResult(requestId);

        // close the batch after getting result of translation
        BatchClose batchClose = api.translationFileBatchCloseGet(batchId, null);
        System.out.println("Close the batch after getting translation result : " + batchClose.toString());
    }
}
