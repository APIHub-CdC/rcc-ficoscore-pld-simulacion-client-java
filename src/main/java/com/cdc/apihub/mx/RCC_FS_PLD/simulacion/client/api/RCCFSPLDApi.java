package com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.api;

import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.ApiClient;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.ApiException;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.ApiResponse;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.Configuration;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.Pair;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.ProgressRequestBody;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.PersonaPeticion;
import com.cdc.apihub.mx.RCC_FS_PLD.simulacion.client.model.Respuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RCCFSPLDApi {
    private ApiClient apiClient;
    public RCCFSPLDApi() {
        this(Configuration.getDefaultApiClient());
    }
    public RCCFSPLDApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public okhttp3.Call getReporteCall(String xApiKey, PersonaPeticion request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
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
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    private okhttp3.Call getReporteValidateBeforeCall(String xApiKey, PersonaPeticion request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getReporte(Async)");
        }
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling getReporte(Async)");
        }
        
        okhttp3.Call call = getReporteCall(xApiKey, request, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta getReporte(String xApiKey, PersonaPeticion request) throws ApiException {
        ApiResponse<Respuesta> resp = getReporteWithHttpInfo(xApiKey, request);
        return resp.getData();
    }
    
    public ApiResponse<Respuesta> getReporteWithHttpInfo(String xApiKey, PersonaPeticion request) throws ApiException {
        okhttp3.Call call = getReporteValidateBeforeCall(xApiKey, request, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

}
