package api.v2;

import java.io.IOException;

import models.v2.ReportResponse;

public class ReportAPI extends API {

	private final static String URI = "searchApi/v2/file/report/";
	private final static String PARAMETER = "resource";
	
	public ReportAPI() {
		super(URI, PARAMETER);
	}
	
	public ReportResponse getReport(String id) throws IOException, InterruptedException {
		String jsonResponse = getRequest(id);
		return new ReportResponse(jsonResponse);
	}
	
	public static void main(String[] args) {
		ReportAPI api = new ReportAPI();
		try {
			ReportResponse resp = api.getReport("ec8c89aa5e521572c74e2dd02a4daf78");
			
			System.out.println(resp.getResponseCode());
			System.out.println(resp.getMd5());
			System.out.println(resp.getSha1());
			System.out.println(resp.getScans());
			System.out.println(resp.getIps());
			System.out.println(resp.getDomains());
			System.out.println(resp.getReferences());
			System.out.println(resp.getPermalink());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
