package days5_basic;

public class ArrayExample {
	public static void main(String[] args) {
		//1.
		char[] ch;//�迭����
		ch = new char[4];//�迭����, �޸𸮿� �Ҵ�
		
		//2.
		char[] ch2 = new char[4];//���� �� ����
		//�迭�ʱ�ȭ
		ch2[0] = 'A';
		ch2[1] = 'B';
		ch2[2] = 'C';
		ch2[3] = 'D';
		
		//3. 
		char[] ch3 = {'a','k','P','D','Y','R','7','u'};
		for(int i=0;i<ch3.length;i++){
			System.out.println(ch3[i]);
		}
	}
}
