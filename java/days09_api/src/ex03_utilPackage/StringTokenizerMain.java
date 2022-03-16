package ex03_utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {
	
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer("»ç°ú=10|ÃÊÄÚ·¿=3|¼¤ÆäÀÎ=1","=|",true);
								//	new StringTokenizer("a.b.c.d",".");
								//	new StringTokenizer("a b c d");	
		
		while(token.hasMoreTokens()) {
			//System.out.println(token.nextToken());
			String str = token.nextToken();
			if(str.equals("=")) System.out.print("\t");
			else if (str.contentEquals("|")) System.out.println();
			else System.out.println(str);
		}
	}
}
