package ex06_net_UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class UdpServer {
	
	private final static int PACKSIZE = 100;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(args.length !=1) {
			System.out.println("포트번호 입력 제대로하세요 ");
			return;
		}
		
		try {
			int port = sc.nextInt();
			DatagramSocket ds = new DatagramSocket(port);
			System.out.println("서버 대기중~~~~~~~~");
			
			for (int i = 0; i < args.length; i++) {
				DatagramPacket dp = new DatagramPacket(new byte[PACKSIZE], PACKSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress() + " " + dp.getPort() + " " + new String(dp.getData()));
				//ds.send(dp);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
