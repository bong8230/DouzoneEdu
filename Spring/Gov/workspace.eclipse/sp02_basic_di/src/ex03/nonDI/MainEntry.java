package ex03.nonDI;

public class MainEntry {
	public static void main(String[] args) {
		//IRecord record = new NewRecordImpl();
		NewRecordImpl record = new NewRecordImpl();
		NewRecordViewImpl view = new NewRecordViewImpl();
		
		view.setRecord(record);
		view.input();
		view.print();
	}
}
