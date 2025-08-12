package REST_API;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpPostReq {

    // POST REQUEST

        /*
        Concept is that with POST we send data to the server or the API
        We use request body to accomplish this
        And the data to be sent can be in a certain format that is usually described in the headers,
        like "Content-Type", "application/json"
        The data that is sent to the server is handled by BodyPublishers
        */

    // Using this public API below to make out Post requests
    // https://reqres.in/
    // For post requests the endpoint API can be reached at :
    // https://reqres.in/api/users

    // To achieve this we make use of : Http Client, Http Request, and Http Response
    // Http client - makes the connection
    // Http request - stores the request info -- this will make use of the bodypublishers to send the data
    // Http response - stores the response or server reply

    public static void main(String[] args) throws Exception{

        // created the client
        HttpClient client = HttpClient.newHttpClient();

        // creating JSON body to send for the POST request
        String body = "{\n" +
                "    \"name\": \"DXS\",\n" +
                "    \"job\": \"Software Engineer\"\n" +
                "}";
        // created request build
        HttpRequest request = HttpRequest.newBuilder()
                                .uri(URI.create("https://reqres.in/api/users"))
                                .headers("Content-Type","Applicatoin/json")
                                .header("x-api-key", "reqres-free-v1")
                                .POST(HttpRequest.BodyPublishers.ofString(body))
                                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(response.statusCode());
    }
}
