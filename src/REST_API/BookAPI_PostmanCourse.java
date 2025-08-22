package REST_API;
/*
For this project here, we will be making use of the simple book api created for practicing requests on 'Postman'
Github : https://github.com/vdespa/introduction-to-postman-course/tree/main
This repo has a simple book api that we can interact with
This API allows you to reserve a book.
The API is available at https://simple-books-api.click
 */

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BookAPI_PostmanCourse {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        // GET Request endpoints
        // GET /status - Returns the status of the API
        // GET /books - Returns a list of books.
        // GET /books/:bookId - Retrieve detailed information about a book.
        // GET /orders - Allows you to view all orders. Requires authentication.
        // GET /orders/:orderId - Allows you to view an existing order. Requires authentication.
        // *********************************************
        // POST request endpoints
        // POST /orders - Allows you to submit a new order. Requires authentication.
        // *********************************************
        // PATCH /orders/:orderId - Update an existing order. Requires authentication.
        // *********************************************
        // DELETE /orders/:orderId - Delete an existing order. Requires authentication.

        // token needed for authentication
        String token = "f376fd3b62b4e5b213c1a0119a08d3d8e094fda45e69dd6ef3c976a24ad17767";

        System.out.println("API STATUS : ");
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/status")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println();
        // Gets list of all the books already present that the order can be placed for
        System.out.println("Get list of all books : ");
        request = HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/books")).build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println();
        // Getting detailed info on a book - lets say {"id":2,"name":"Just as I Am"}
        System.out.println("Getting info on the book with ID = 2 / Title : Just as I Am");
        int bookId=2;
        request= HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/books/2")).build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println();
        // Posting a new order
        // The request body needs to be in JSON format and include the following properties:
        // bookId - Integer - Required
        // customerName - String - Required
        System.out.println("Placing an order : ");
        String reqBody = "{\"bookId\":\"1\",\n\"customerName\":\"DevDXS\" }";
        request= HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/orders"))
                .POST(HttpRequest.BodyPublishers.ofString(reqBody))
                .headers("Authorization", "Bearer " +token)
                .build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println();
        // This has now created an order and in response returned an order ID
        // Getting all orders -- requires authentication
        System.out.println("Getting All Orders : ");
        request= HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/orders"))
                .headers("Authorization", "Bearer " +token)
                .GET()
                .build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println();
        // Patch order - changing customer name for order #9GzOQUlQrnJaK6SDax0KL
        System.out.println("Patching order with id #9GzOQUlQrnJaK6SDax0KL. Changing Customer Name to Customer009");
        String custName="{\"customerName\":\"Customer009\"}";
        request= HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/orders/9GzOQUlQrnJaK6SDax0KL"))
                .method("PATCH", HttpRequest.BodyPublishers.ofString(custName))
                .headers("Authorization", "Bearer " +token)
                .build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println();
        // Lets check on whats the status of the order list now.
        System.out.println("Getting All Orders : ");
        request= HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/orders"))
                .headers("Authorization", "Bearer " +token)
                .GET()
                .build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println();
        // Lets delete all orders and only keep the one with modified customer name
        System.out.println("Deleting orders : ");
        // Since I had run the code and tested multiple times, there had been few extra orders created
        // Saving all orders in a String Array and then running delete request while iterating through the array
        // Id order is not present, response just informs us of that.
        // Order ids are going to be completely separate for anyone else trying this out on their end
        // please review and then run.
        String[]orderIds = {"Q1tu2BJHVmr5Hd4JwmNOA","cK-m8l_ntsFHYkbf4mFQZ","hd8AivweAYR4ezYdJdryf","wx8qRNILxrypbtG2EeMah","m9pwAMyrF_0G-3hXq3ZQs"};
        for(String orders: orderIds){
        request= HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/orders/"+orders))
                .DELETE()
                .headers("Authorization","Bearer " +token).build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        }
        // Checking on list of all orders remaining
        System.out.println("Getting All Orders : ");
        request= HttpRequest.newBuilder().uri(URI.create("https://simple-books-api.click/orders"))
                .headers("Authorization", "Bearer " +token)
                .GET()
                .build();
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println();

    }
}
