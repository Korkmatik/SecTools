package api.v2;

import java.io.IOException;

import models.v2.AntivirusResponse;

public class AntivirusAPI extends API {

	private static final String URI = "searchApi/v2/antivirus/report/";
	private static final String PARAMETER = "antivirus";
	
	public AntivirusAPI() {
		super(URI, PARAMETER);
	}
	
	public AntivirusResponse getAntivirus(String antivirus) throws IOException, InterruptedException {
		String jsonData = getRequest(antivirus);
		return new AntivirusResponse(jsonData);
	}
	
	public static void main(String[] args) {
		AntivirusAPI api = new AntivirusAPI();
		
		try {
			AntivirusResponse resp = api.getAntivirus("plugx");
			
			System.out.println(resp.getResponseCode());
			System.out.println(resp.getHashes());
			System.out.println(resp.getReferences());
			System.out.println(resp.getPermalink());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
