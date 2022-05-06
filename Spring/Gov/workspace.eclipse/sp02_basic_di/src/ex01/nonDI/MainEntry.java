package ex01.nonDI;

public class MainEntry {
	
	public static void main(String[] args) {
		
		NewRecordView view = new NewRecordView(1, 2, 3, 4);
		
		view.print();
	}
}
