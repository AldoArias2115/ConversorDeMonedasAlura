import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    Moneda conversionMonedas(String moneda1, String moneda2){

        URI direccion =  URI.create("https://v6.exchangerate-api.com/v6/94b9ccab379c32d73086b059/pair/"+moneda1+"/"+moneda2);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();


        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No se encontro el tipo de moneda");
        }
    }

}
