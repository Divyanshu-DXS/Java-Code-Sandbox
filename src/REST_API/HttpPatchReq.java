package REST_API;
import java.net.http.*;
import java.net.URI;

public class HttpPatchReq {
    public static void main(String[] args) throws Exception{
        HttpClient client = HttpClient.newHttpClient();

        String json = "{ \"title\": \"Updated Title via PATCH\" }";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .method("PATCH", HttpRequest.BodyPublishers.ofString(json))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    }
}
