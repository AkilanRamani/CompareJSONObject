package jacksonObject;

import java.io.IOException;
import java.util.Iterator;

import kotlin.Pair;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class TestPostAPIRequest {

	public static void main(String[] args) throws IOException {
		
		
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
			/*	MediaType mediaType = MediaType.parse("application/json");
				@SuppressWarnings("deprecation")
				
				RequestBody body = RequestBody.create(mediaType, "{\r\n    \"name\": \"morpheus\",\r\n    \"job\": \"leader\"\r\n}");
				Request request = new Request.Builder()
				  .url("https://reqres.in/api/users")
				  .method("POST", body)
				  .addHeader("Content-Type", "application/json")
				  .build();
				Response response = client.newCall(request).execute();
				System.out.println(response.message()); */
				
	            String json = "{\"id\":1,\"name\":\"John\"}";

			    
				RequestBody body1 = RequestBody.create(
			      json, MediaType.parse("application/json"));

			    String BASE_URL = "https://reqres.in";
				Request request1 = new Request.Builder()
			      .url(BASE_URL +"/api/users" ).post(body1)
			      .build();
			 
			    Call call = client.newCall(request1);
			    
				Response response1 = call.execute();
			    System.out.println(response1);
			   Headers headers = response1.headers();
			   Iterator<Pair<String, String>> iterator = headers.iterator();
			 while  (iterator.hasNext()) {
				 
				 Pair<String, String> p =  iterator.next();
				
			System.out.println(p);
			 }

	}
}
