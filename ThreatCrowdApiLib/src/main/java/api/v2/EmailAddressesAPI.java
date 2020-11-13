package api.v2;

import java.io.IOException;

import models.v2.EmailResponse;

public class EmailAddressesAPI extends API {
	
	private static final String URI = "searchApi/v2/email/report/";
	private static final String PARAMETER = "email";
	
	public EmailAddressesAPI() {
		super(URI, PARAMETER);
	}
	
	public EmailResponse getEmail(String email) throws IOException, InterruptedException {
		String body = getRequest(email);
		return new EmailResponse(body);
	}
	
	public static void main(String[] args) {
		EmailAddressesAPI api = new EmailAddressesAPI();
		EmailResponse resp;
		try {
			resp = api.getEmail("william19770319@yahoo.com");
			System.out.println(resp.getResponseCode());
			System.out.println(resp.getDomains());
			System.out.println(resp.getReferences());
			System.out.println(resp.getPermalink());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
