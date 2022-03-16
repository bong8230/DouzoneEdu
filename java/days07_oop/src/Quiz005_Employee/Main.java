package Quiz005_Employee;
//Enployee <--------------Regular <-------------Sales
//이름,직급,부서,연락처                        급여					bonus(double)
//  ^^
//  ||
// partTime 일수*시간단가
public class Main {
	public static void main(String[] args) {
		Sales A = new Sales();
		System.out.println(A);
		
		Employee B = new Employee();
		B.setDpart("Sales");
		System.out.println(B);
	}
}
