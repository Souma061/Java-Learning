// package Http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SimpleGetPost {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        // get
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/2"))
                .GET().build();
        HttpResponse<String> getResponse = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + getResponse.statusCode());
        System.out.println("Body: " + getResponse.body());


        // post
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString("{\"title\":\"foo\",\"body\":\"bar\",\"userId\":2}"))
                .build();
        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + postResponse.statusCode());
        System.out.println("Body: " + postResponse.body());
    }
}
