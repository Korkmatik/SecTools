package api.v2;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public abstract class API {

	private static final String BASE = "https://www.threatcrowd.org/";
	
	private String url;
	
	public API(String URI, String parameterName) {
		if (URI.startsWith("/")) {
			URI = URI.substring(1);
		}
		
		if (!URI.endsWith("/")) {
			URI = URI + "/";
		}
		
		url = BASE + URI + "?" + parameterName + "=";
	}
	
	public String getURL(String parameter) {
		return url + parameter;
	}
	
	protected String getRequest(String parameterValue) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
				
		String url = getURL(parameterValue);
		System.out.println("URL: " + url);
		HttpRequest request = HttpRequest.newBuilder().uri(java.net.URI.create(url)).build();
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		
		String responseBody = response.body();
		return responseBody;
	}
}
