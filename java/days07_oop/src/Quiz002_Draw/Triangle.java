package Quiz002_Draw;

import java.util.Scanner;

public class Triangle extends Draw {
	public Triangle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("≥–¿Ã : ");
		this.w = sc.nextInt();
		System.out.print("≥Ù¿Ã : ");
		this.h = sc.nextInt();
	}

	@Override
	public String toString() {
		//System.out.println("Triangle is ");
		result = calc();
		return super.toString();
	}
	
	public double calc() {
		this.result = (w*h)/2.0;
		return result;
	}
}
