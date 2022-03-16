package ex02_net;

import java.io.*;
import java.net.*;

public class URLEx2 {
	public static void main(String[] args) throws IOException, MalformedURLException {
		
		URL googleSearch = new URL("https://www.google.com/search?q=youtube&sxsrf=APq-WBvANL9uMpoFbWaYxos6ftawQNi5Kg%3A1644981523178&ei=E20MYsGYCs2i2roP2PeV0Ak&ved=0ahUKEwiB7ubaoYP2AhVNkVYBHdh7BZoQ4dUDCA4&uact=5&oq=youtube&gs_lcp=Cgdnd3Mtd2l6EAMyEQguEIAEELEDEIMBEMcBENEDMgUIABCABDIICAAQgAQQsQMyCAgAEIAEELEDMggIABCABBCxAzIICAAQgAQQsQMyBQgAEIAEMggIABCABBCxAzILCAAQgAQQsQMQgwEyBQgAEIAEOgQIIxAnOg4ILhCABBCxAxDHARDRAzoUCC4QgAQQsQMQgwEQxwEQ0QMQ1AI6CwguEIAEEMcBENEDSgQIQRgASgQIRhgAUABY0wlg6ApoAHABeACAAa0BiAHHCJIBAzAuN5gBAKABAcABAQ&sclient=gws-wiz");
		
		System.out.println("�������� : " + googleSearch.getProtocol());
		System.out.println("ȣ��Ʈ�� ��Ʈ : " + googleSearch.getAuthority());
		System.out.println("ȣ��Ʈ : " + googleSearch.getHost());
		System.out.println("��Ʈ : " + googleSearch.getPort());
		System.out.println("��� : " + googleSearch.getPath());
		System.out.println("���� : " + googleSearch.getQuery());
		System.out.println("���ϸ� : " + googleSearch.getFile());
		System.out.println("����: " + googleSearch.getRef());
		
		
		
		
	}
}
