package ex06_net_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpClient {
	
	private final static int PACKSIZE = 100;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(args.length !=2) {
			System.out.println("host, port number ");
			return;
		}
		
		DatagramSocket ds = null;
		try {
			InetAddress host = InetAddress.getByName("127.0.0.1");
			int port = sc.nextInt();
			
			ds = new DatagramSocket();
			
			byte[] data = "Hello Server".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length,host,port);
			
			ds.send(dp);
			
			ds.setSoTimeout(2000);
			dp.setData(new byte[PACKSIZE]);
			
			System.out.println(new String(dp.getData()));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ds != null) ds.close();
		}
	}
}
