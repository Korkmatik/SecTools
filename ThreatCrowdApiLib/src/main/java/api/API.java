package api;

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
}
