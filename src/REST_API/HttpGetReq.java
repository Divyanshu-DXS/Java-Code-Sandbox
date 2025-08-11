package REST_API;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpGetReq {

    // GET REQUEST

        /*  
        Concept is that we ask a website for data 
        All we provide is a URL, no body or nothing as such 
        In repose we expect the website to send us data in JSON format
        JSON - JavaScript Object Notation
        */

        // Using this public API for example - no API key needed
        // https://api.chucknorris.io

        // To achieve this we make use of : Http Client, Http Request, and Http Response 
        // Http client - makes the connection
        // Http request - stores the request info
        // Http response - stores the response or server reply 

    public static void main(String[] args) throws Exception {

        // EXAMPLE 1 - CHUCK NORRIS API
        // Make the client
        HttpClient client = HttpClient.newHttpClient();
        // Building the GET request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.chucknorris.io/jokes/random"))
                .GET()
                .build();
        // Building Http Response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // Printing the raw JSON received in response
        System.out.println(response.statusCode());
        System.out.println(response.body());


    }
}