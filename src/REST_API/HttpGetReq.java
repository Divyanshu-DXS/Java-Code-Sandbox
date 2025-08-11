package REST_API;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

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

        // EXAMPLE 2 - CAT FACT API
        HttpClient client1 = HttpClient.newHttpClient();
        // When adding request headers, if the api does not support any other formats then it will only return response in the supported format
        // for instance in vase of CAT FACT API it only supports JSON
        // changing request header to application/xml or text/plain would not change the format of the output
        HttpRequest request1 = HttpRequest.newBuilder()
                                .uri(new URI("https://catfact.ninja/fact"))
                                .headers("Accept","text/plain")
                                .GET()
                                .build();
        HttpResponse<String> response1 = client1.send(request1, HttpResponse.BodyHandlers.ofString());

        System.out.println(response1.statusCode());
        System.out.println(response1.body());
        System.out.println(response1.headers());

        // writing the response in a file
        HttpResponse<Path> response2 = client1.send(request1, HttpResponse.BodyHandlers.ofFile(Paths.get("demofile.txt")));
        // This overwrites a file if it is already present. if not it will create a new file and then write to it.

    }
}