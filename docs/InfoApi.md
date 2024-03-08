# InfoApi

All URIs are relative to *http://xkcd.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getById**](InfoApi.md#getById) | **GET** /{comicId}/info.0.json |  |
| [**getComicMetadata**](InfoApi.md#getComicMetadata) | **GET** /info.0.json |  |


<a name="getById"></a>
# **getById**
> Comic getById(comicId).execute();



Fetch comics and metadata  by comic id. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xkcd;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://xkcd.com";
    Xkcd client = new Xkcd(configuration);
    Double comicId = 3.4D;
    try {
      Comic result = client
              .info
              .getById(comicId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlt());
      System.out.println(result.getDay());
      System.out.println(result.getImg());
      System.out.println(result.getLink());
      System.out.println(result.getMonth());
      System.out.println(result.getNews());
      System.out.println(result.getNum());
      System.out.println(result.getSafeTitle());
      System.out.println(result.getTranscript());
      System.out.println(result.getYear());
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comic> response = client
              .info
              .getById(comicId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **comicId** | **Double**|  | |

### Return type

[**Comic**](Comic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getComicMetadata"></a>
# **getComicMetadata**
> Comic getComicMetadata().execute();



Fetch current comic and metadata. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Xkcd;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.InfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "http://xkcd.com";
    Xkcd client = new Xkcd(configuration);
    try {
      Comic result = client
              .info
              .getComicMetadata()
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getAlt());
      System.out.println(result.getDay());
      System.out.println(result.getImg());
      System.out.println(result.getLink());
      System.out.println(result.getMonth());
      System.out.println(result.getNews());
      System.out.println(result.getNum());
      System.out.println(result.getSafeTitle());
      System.out.println(result.getTranscript());
      System.out.println(result.getYear());
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#getComicMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Comic> response = client
              .info
              .getComicMetadata()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling InfoApi#getComicMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Comic**](Comic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

