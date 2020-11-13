package api.v2;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import models.v2.DomainResponse;

public class DomainsAPI extends API {

	private static final String URI = "/searchApi/v2/domain/report/";
	private static final String PARAMETER = "domain";
	
	public DomainsAPI() {
		super(URI, PARAMETER);
	}
	
	public DomainResponse getDomain(String domain) throws IOException, InterruptedException {
		String responseBody = getRequest(domain);
		return new DomainResponse(responseBody);
	}
	
	public static void main(String[] args) {
		DomainsAPI api = new DomainsAPI();
		
		try {
			DomainResponse response = api.getDomain("aoldaily.com");
			
			System.out.println(response.getResponseCode());
			System.out.println(response.getHashes());
			System.out.println(response.getEmails());
			System.out.println(response.getSubdomains());
			System.out.println(response.getReferences());
			System.out.println(response.getVotes());
			System.out.println(response.getPermalink());
			System.out.println(response.getResolutions());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
