package ex01_net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain2 {
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress address = InetAddress.getLocalHost();
		
		System.out.println("���� ȣ��Ʈ �̸� : " + address.getHostName());
		System.out.println("���� ȣ��Ʈ IP�ּ� : " + address.getHostAddress());
		
		address = InetAddress.getByName("www.naver.com");
		System.out.println("���� ȣ��Ʈ �̸� : " + address.getHostName());
		System.out.println("���� ȣ��Ʈ IP�ּ� : " + address.getHostAddress());
		
		System.out.println("==============================================");
		byte[] addr = new byte[4]; // 142.251.42.163
		addr[0] = (byte)142;
		addr[1] = (byte)251;
		addr[2] = (byte)42;
		addr[3] = (byte)163;
		
		address = InetAddress.getByAddress(addr);
		System.out.println("google ȣ��Ʈ�̸� : " + address.getCanonicalHostName());
		System.out.println("google ȣ��Ʈ�̸� : " + address.getHostName());
		System.out.println("google ȣ��Ʈ IP �ּ� : " + address.getHostAddress());
		
		System.out.println("==============================================");
		
		InetAddress[] arr;
		arr = InetAddress.getAllByName("www.daum.net");
		for (InetAddress item : arr) {
			System.out.println("daum ȣ��Ʈ �̸� :" + item.getHostName());
			System.out.println("daum ȣ��Ʈ IP �ּ� :" + item.getHostAddress());
		}
	}
}
