package api;

import java.net.http.*; //gives access to http client that performs request and response;
import java.net.*; //include uri

public class MovieFetcher {
    private static final String API_Key = "7366da39";// private api key;
    private static final String Base_Url = "http://www.omdbapi.com/";// base url;

    public static String fetchMoviesById(String movTitle) {
        try {
            String url = Base_Url + "?t=" + movTitle + "&apikey=" + API_Key;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
