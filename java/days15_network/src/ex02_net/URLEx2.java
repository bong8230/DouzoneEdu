package ex02_net;

import java.io.*;
import java.net.*;

public class URLEx2 {
	public static void main(String[] args) throws IOException, MalformedURLException {
		
		URL googleSearch = new URL("https://www.google.com/search?q=youtube&sxsrf=APq-WBvANL9uMpoFbWaYxos6ftawQNi5Kg%3A1644981523178&ei=E20MYsGYCs2i2roP2PeV0Ak&ved=0ahUKEwiB7ubaoYP2AhVNkVYBHdh7BZoQ4dUDCA4&uact=5&oq=youtube&gs_lcp=Cgdnd3Mtd2l6EAMyEQguEIAEELEDEIMBEMcBENEDMgUIABCABDIICAAQgAQQsQMyCAgAEIAEELEDMggIABCABBCxAzIICAAQgAQQsQMyBQgAEIAEMggIABCABBCxAzILCAAQgAQQsQMQgwEyBQgAEIAEOgQIIxAnOg4ILhCABBCxAxDHARDRAzoUCC4QgAQQsQMQgwEQxwEQ0QMQ1AI6CwguEIAEEMcBENEDSgQIQRgASgQIRhgAUABY0wlg6ApoAHABeACAAa0BiAHHCJIBAzAuN5gBAKABAcABAQ&sclient=gws-wiz");
		
		System.out.println("프로토콜 : " + googleSearch.getProtocol());
		System.out.println("호스트와 포트 : " + googleSearch.getAuthority());
		System.out.println("호스트 : " + googleSearch.getHost());
		System.out.println("포트 : " + googleSearch.getPort());
		System.out.println("경로 : " + googleSearch.getPath());
		System.out.println("질의 : " + googleSearch.getQuery());
		System.out.println("파일명 : " + googleSearch.getFile());
		System.out.println("참조: " + googleSearch.getRef());
		
		
		
		
	}
}
