package Quiz_ex01;

public class Prob3 {
	public static void main(String[] args) {
		String url = "http://localhost:8080/order.do?prdId=PROD-0001&prdName=iPhone5&price=850000&maker=Apple";
		System.out.println("��ǰ ��ȣ : " + getParameter(url, "prdId"));
		System.out.println("��ǰ �̸� : " + getParameter(url, "prdName"));
		System.out.println("��ǰ ���� : " + getParameter(url, "price"));
		System.out.println("���� ȸ�� : " + getParameter(url, "maker"));
	}

	private static String getParameter(String url, String paramName) {
		
		String string1;
		int param =0;
		if(!paramName.equals("maker")) {
			param = url.indexOf(paramName);
			string1 = url.substring(url.substring(param).indexOf("=")+param+1,(url.substring(param).indexOf("&") + param));
		}
		else {
			param = url.indexOf(paramName);
			string1 = url.substring(url.substring(param).indexOf("=")+param+1,url.length());
		}
			
		return string1;
	}	
}
