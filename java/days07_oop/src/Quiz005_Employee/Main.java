package Quiz005_Employee;
//Enployee <--------------Regular <-------------Sales
//�̸�,����,�μ�,����ó                        �޿�					bonus(double)
//  ^^
//  ||
// partTime �ϼ�*�ð��ܰ�
public class Main {
	public static void main(String[] args) {
		Sales A = new Sales();
		System.out.println(A);
		
		Employee B = new Employee();
		B.setDpart("Sales");
		System.out.println(B);
	}
}
