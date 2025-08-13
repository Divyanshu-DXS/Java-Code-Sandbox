package REST_API;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpPutReq {
    // PUT REQUEST

        /*
        Concept is that PUT is used to update an existing resource completely.
        Unlike POST (which usually creates a new resource)
        PUT replaces the resource at the given URL with the data you send.
        */

    // Using this public API below to make out Post requests
    // https://restful-api.dev/
    // For PUT requests the endpoint API can be reached at :
    // https://api.restful-api.dev/objects/7

    // To achieve this we make use of : Http Client, Http Request, and Http Response
    // Http client - makes the connection
    // Http request - stores the request info -- this will make use of the bodypublishers to send the data
    // Http response - stores the response or server reply
    public static void main(String[] args) throws Exception{
        // created a client
        HttpClient client = HttpClient.newHttpClient();
        String postStr = "{\"name\": \"Test Device\", \"data\": {\"price\": 200, \"color\": \"Red\"}}";
        // this put request seems to work only on objects that have been created via a POST request
        // so doing a post request before we proceed with a PUT reqeust on https://api.restful-api.dev/objects
        // Http Request
        HttpRequest request = HttpRequest.newBuilder()
                               .uri(URI.create("https://api.restful-api.dev/objects"))
                                .header("content-type","Application/JSON")
                                .POST(HttpRequest.BodyPublishers.ofString(postStr)).build();
        // Http Response
        HttpResponse <String> PostResponse = client.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(PostResponse.body());
        // ID received - ff8081819782e69e0198a20507f000d9

        // Doing a PUT request now
        String putStr = "{\"name\": \"DXS Device\", \"data\": {\"price\": 9999, \"color\": \"Skull Grey\"}}";
        HttpRequest putRequest = HttpRequest.newBuilder()
                                .uri(URI.create("https://api.restful-api.dev/objects/ff8081819782e69e0198a20a05890101"))
                                .header("content-type","Application/JSON")
                                .POST(HttpRequest.BodyPublishers.ofString(putStr)).build();
        HttpResponse<String> putResponse = client.send(putRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(putResponse.body());


    }
}
