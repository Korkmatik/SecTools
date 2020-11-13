package api.v2;

import java.io.IOException;

import models.v2.IPAddressResponse;

public class IPAddressAPI extends API {

	private static final String URI = "searchApi/v2/ip/report/";
	private static final String PARAMETER = "ip";
	
	public IPAddressAPI() {
		super(URI, PARAMETER);
	}
	
	public IPAddressResponse getIPAddress(String ip) throws IOException, InterruptedException {
		String jsonResponse = getRequest(ip);
		return new IPAddressResponse(jsonResponse);
	}
	
	public static void main(String[] args) {
		IPAddressAPI api = new IPAddressAPI();
		try {
			IPAddressResponse resp = api.getIPAddress("188.40.75.132");
			
			System.out.println(resp.getResponseCode());
			System.out.println(resp.getResolutions());
			System.out.println(resp.getHashes());
			System.out.println(resp.getReferences());
			System.out.println(resp.getVotes());
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
