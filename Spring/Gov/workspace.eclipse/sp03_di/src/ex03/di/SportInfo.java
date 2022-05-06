package ex03.di;

import java.util.Scanner;

public class SportInfo implements Player {
	private String name, position, sport;

	public void setName(String name) {
		this.name = name;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}
    
	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String getSport() {
		return sport;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("선수이름 : "); setName(sc.next());
		System.out.print("포지션 : "); setPosition(sc.next());
		System.out.print("종목이름 : "); setSport(sc.next());
	}

	@Override
	public void info() {
		System.out.println("\n -- 선수정보 --");
		System.out.println("선수이름 : " + this.name);
		System.out.println("포지션 : " + this.position);
		System.out.println("종목이름 : " + this.sport);
	}
}
