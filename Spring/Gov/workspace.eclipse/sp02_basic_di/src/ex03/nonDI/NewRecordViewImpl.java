package ex03.nonDI;

import java.util.Scanner;

public class NewRecordViewImpl {
	private NewRecordImpl record;
	public void setRecord(NewRecordImpl record) {
		this.record = record;		
	}

	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.println("kor:"); record.setKor(sc.nextInt());
		System.out.println("eng:"); record.setEng(sc.nextInt());
		System.out.println("com:"); record.setCom(sc.nextInt());
		
	}

	public void print() {
		System.out.println("\n\nkor:" + record.getKor());
		System.out.println("eng:" + record.getEng());
		System.out.println("com:" + record.getCom());
		System.out.println("total :" + record.total());
	}

}
