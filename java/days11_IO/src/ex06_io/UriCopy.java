package ex06_io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class UriCopy {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream("google.jpg");
		
		byte[] buffer = new byte[1024 * 8];
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read(buffer);
			if(inputData == -1) break;
			os.write(buffer,0,inputData);;
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		is.close(); os.close();
		System.out.println("¼º°ø");
		
	}
}
