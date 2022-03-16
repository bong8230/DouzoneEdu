package Quiz_ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob5 {
	public static void main(String[] args) throws IOException {
		String fileName = "./src/Quiz_ex01/data.txt";
		makeVariable(fileName);
	}

	private static void makeVariable(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));		
		String str="";
		while((str = br.readLine()) != null) {
			 
			int param = str.indexOf("_");
			if(param>0) {
				str = ( str.substring(0, param).toLowerCase() 
						+ str.substring(param+1,param+2)
						+ str.substring(param+2,str.length()).toLowerCase() );
				System.out.println(str);
			}
			else {
				str = str.toLowerCase();
				System.out.println(str);
			}
		}
	}
}
