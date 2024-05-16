import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyApi {
    public double getConversionRate(String baseCurrency, String targetCurrency) throws IOException, InterruptedException {
        ApiKey apiKey = new ApiKey();
        HttpClient httpClient = HttpClient.newHttpClient();
        URI apiUri = URI.create(String.format("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s", apiKey.getApiKey(), baseCurrency, targetCurrency));
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(apiUri)
                .build();
        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(httpResponse.body(), CurrencyConversion.class).conversion_rate();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        CurrencyApi currencyApi = new CurrencyApi();
        ApiKey apiKey = new ApiKey();
        currencyApi.getConversionRate("USD", "BRL");
    }
}