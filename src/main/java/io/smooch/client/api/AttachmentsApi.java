/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.15
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.api;

import io.smooch.client.ApiCallback;
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.ApiResponse;
import io.smooch.client.Configuration;
import io.smooch.client.Pair;
import io.smooch.client.ProgressRequestBody;
import io.smooch.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.smooch.client.model.AttachmentRemove;
import io.smooch.client.model.AttachmentResponse;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AttachmentsApi {
    private ApiClient apiClient;

    public AttachmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AttachmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for removeAttachment
     * @param appId Identifies the app. (required)
     * @param attachmentRemoveBody Body for a removeAttachment request.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeAttachmentCall(String appId, AttachmentRemove attachmentRemoveBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = attachmentRemoveBody;
        
        // create path and map variables
        String localVarPath = "/v1/apps/{appId}/attachments/remove"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeAttachmentValidateBeforeCall(String appId, AttachmentRemove attachmentRemoveBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling removeAttachment(Async)");
        }
        
        // verify the required parameter 'attachmentRemoveBody' is set
        if (attachmentRemoveBody == null) {
            throw new ApiException("Missing the required parameter 'attachmentRemoveBody' when calling removeAttachment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = removeAttachmentCall(appId, attachmentRemoveBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Remove an attachment uploaded to Smooch.
     * @param appId Identifies the app. (required)
     * @param attachmentRemoveBody Body for a removeAttachment request.  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void removeAttachment(String appId, AttachmentRemove attachmentRemoveBody) throws ApiException {
        removeAttachmentWithHttpInfo(appId, attachmentRemoveBody);
    }

    /**
     * 
     * Remove an attachment uploaded to Smooch.
     * @param appId Identifies the app. (required)
     * @param attachmentRemoveBody Body for a removeAttachment request.  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> removeAttachmentWithHttpInfo(String appId, AttachmentRemove attachmentRemoveBody) throws ApiException {
        com.squareup.okhttp.Call call = removeAttachmentValidateBeforeCall(appId, attachmentRemoveBody, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Remove an attachment uploaded to Smooch.
     * @param appId Identifies the app. (required)
     * @param attachmentRemoveBody Body for a removeAttachment request.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeAttachmentAsync(String appId, AttachmentRemove attachmentRemoveBody, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = removeAttachmentValidateBeforeCall(appId, attachmentRemoveBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for uploadAttachment
     * @param appId Identifies the app. (required)
     * @param source File to be uploaded (required)
     * @param access Access level for the resulting file (required)
     * @param _for The intended container for the attachment (optional)
     * @param appUserId The appUserId of the user that will receive the attachment Used in attachments for messages  (optional)
     * @param userId The userId of the user that will receive the attachment Used in attachments for messages  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadAttachmentCall(String appId, File source, String access, String _for, String appUserId, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/apps/{appId}/attachments"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (access != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "access", access));
        if (_for != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "for", _for));
        if (appUserId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "appUserId", appUserId));
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (source != null)
        localVarFormParams.put("source", source);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadAttachmentValidateBeforeCall(String appId, File source, String access, String _for, String appUserId, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling uploadAttachment(Async)");
        }
        
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new ApiException("Missing the required parameter 'source' when calling uploadAttachment(Async)");
        }
        
        // verify the required parameter 'access' is set
        if (access == null) {
            throw new ApiException("Missing the required parameter 'access' when calling uploadAttachment(Async)");
        }
        
        
        com.squareup.okhttp.Call call = uploadAttachmentCall(appId, source, access, _for, appUserId, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Upload an attachment to Smooch to use in future messages.
     * @param appId Identifies the app. (required)
     * @param source File to be uploaded (required)
     * @param access Access level for the resulting file (required)
     * @param _for The intended container for the attachment (optional)
     * @param appUserId The appUserId of the user that will receive the attachment Used in attachments for messages  (optional)
     * @param userId The userId of the user that will receive the attachment Used in attachments for messages  (optional)
     * @return AttachmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentResponse uploadAttachment(String appId, File source, String access, String _for, String appUserId, String userId) throws ApiException {
        ApiResponse<AttachmentResponse> resp = uploadAttachmentWithHttpInfo(appId, source, access, _for, appUserId, userId);
        return resp.getData();
    }

    /**
     * 
     * Upload an attachment to Smooch to use in future messages.
     * @param appId Identifies the app. (required)
     * @param source File to be uploaded (required)
     * @param access Access level for the resulting file (required)
     * @param _for The intended container for the attachment (optional)
     * @param appUserId The appUserId of the user that will receive the attachment Used in attachments for messages  (optional)
     * @param userId The userId of the user that will receive the attachment Used in attachments for messages  (optional)
     * @return ApiResponse&lt;AttachmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AttachmentResponse> uploadAttachmentWithHttpInfo(String appId, File source, String access, String _for, String appUserId, String userId) throws ApiException {
        com.squareup.okhttp.Call call = uploadAttachmentValidateBeforeCall(appId, source, access, _for, appUserId, userId, null, null);
        Type localVarReturnType = new TypeToken<AttachmentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Upload an attachment to Smooch to use in future messages.
     * @param appId Identifies the app. (required)
     * @param source File to be uploaded (required)
     * @param access Access level for the resulting file (required)
     * @param _for The intended container for the attachment (optional)
     * @param appUserId The appUserId of the user that will receive the attachment Used in attachments for messages  (optional)
     * @param userId The userId of the user that will receive the attachment Used in attachments for messages  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call uploadAttachmentAsync(String appId, File source, String access, String _for, String appUserId, String userId, final ApiCallback<AttachmentResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = uploadAttachmentValidateBeforeCall(appId, source, access, _for, appUserId, userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AttachmentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
