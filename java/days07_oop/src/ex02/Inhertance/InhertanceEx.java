package ex02.Inhertance;

/*Inhertance(상속)
- extends
- 단일 상속만 지원
- super
- 재사용
- 확장
*/

/*Constructor(생성자) 함수
- 클래스명과 동일하다
- 리턴타입 없음(void 조차 사용하지 않음)
- 중복정의 가능함(overload가능 - 중복함수)
- default constructor 가지고있음
- 떠노는 멤버변수 초기화
*/
/*
 * this : 객체자신의 변수
 * this() : 메소드 --> 반드시 첫줄에 위치해야함
 * super : 부모객체의 변수
 * super():부모 메서드 참조 --> 반드시 첫줄에 위치해야함
 */


public class InhertanceEx {
	public static void main(String[] args) {
		Circle c = new Circle();
		//c.disp();
		c.toString();
		
		Rect r = new Rect();
		//r.disp();
		r.toString();
		Point pt = new Point();
		pt.toString();
//		pt.disp();System.out.println();
//		Point pt2 = new Point(1,2);
//		pt2.disp();
//		Point pt3 = new Point(300);
//		pt3.disp();
	}
}
