package ex02_net;

import java.io.*;
import java.net.*;

public class URLEx {
	public static void main(String[] args) throws IOException, MalformedURLException {
		
		URL google = new URL("http://www.google.co.kr");
		URL daum = new URL("http://www.daum.net");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(daum.openStream()));
		
		String inputLine;
		
		while( (inputLine = br.readLine()) != null) {
			System.out.println(inputLine);
		}
		
		br.close();
	}
}
