import java.io.IOException;

import java.util.Scanner;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.DefaultHttpClient;

public class Main {
   public static void main(String[] args) throws IOException {
      //IPGrabber.getIp();
      String ip = "localhost";
      String username = "newdeveloper";
      
      String url = "http://" + ip + "/api/" + username + "/";
      HttpClient client = new DefaultHttpClient();
      HttpGet get = new HttpGet(url);
      HttpPut put = new HttpPut(url);
      HttpPost post = new HttpPost(url);
      
      HttpResponse getResponse = client.execute(get);
      BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuilder responseJSON = new StringBuilder();
		String line = null;
		while ((line = rd.readLine()) != null) {
			responseJSON.append(line);
		}
   }
}  