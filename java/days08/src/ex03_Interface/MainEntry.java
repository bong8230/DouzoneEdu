package ex03_Interface;

interface A { // abstract method, final field 만 갖는다
	int x = 9;
	final int y= 1111;
	char ch = 'A';
	
	//추상메소드, abstract 생략가능함 - 무조건 추상메소드
	
	public void show();
	
} // A end

interface B{
	void bView();
}

public class MainEntry {

}
