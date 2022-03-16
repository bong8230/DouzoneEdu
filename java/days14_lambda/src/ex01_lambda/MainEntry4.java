package ex01_lambda;
// 불필요한 클래스의 정의도 없다.
// 메소드의 리턴 타입도 없고, 이름도 없다
// Anonymous Function(익명함수) ==> 익명클래스
/*
ex))
	public int sum (int x, int y) { return x+y;}
	(x,y) -> {x+y}
*/

//parameter 예제

interface Message{
	public void something(int x,int y);
}

interface Talk{
	public void something(String x,String y);
}

class Person{
	public void greeting(Message msg) {
		msg.something(88,99);
	}
	public void greeting(Talk msg) {
		msg.something("hihihihihihihihihihi","byebyebyebyebyebye");
	}
}

public class MainEntry4 {
	public static void main(String[] args) {
		Person p = new Person();
		
		
		//람다를 이용하지 않은 평소스타일(parameter 예제)
		p.greeting(new Message() {
			@Override
			public void something(int x,int y) {
				System.out.println("parameter 예제");
				System.out.println("parameter : " + x +","+y);
			}
		});
		
		System.out.println("=============================================");
		
		//람다 적용(parameter 예제)
		p.greeting( (String x, String y)->{ // 같은이름의 메소드, 같은수의 파라미터일경우 자료형(타입) 표시
			System.out.println("parameter : " + x +","+y);
		});
		
		p.greeting( (int x, int y)->{ // 같은이름의 메소드, 같은수의 파라미터일경우 자료형(타입) 표시
			System.out.println("parameter : " + x +","+y);
		});
	}
}

