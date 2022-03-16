package ex01_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = null;
		InetAddress[] address;
		
		System.out.print("site address : ");
		
		try {
			str = br.readLine();
			address = InetAddress.getAllByName(str);
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			 e.printStackTrace();
		} catch (IOException e) {
			 e.printStackTrace();
		}
	}
}
