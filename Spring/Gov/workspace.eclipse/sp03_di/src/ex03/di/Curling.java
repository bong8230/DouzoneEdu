package ex03.di;

public class Curling implements Player {
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

	@Override
	public void info() {
		System.out.println("\n -- 선수정보 --");
		System.out.println("선수이름 : " + this.name);
		System.out.println("포지션 : " + this.position);
		System.out.println("종목이름 : " + this.sport);
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}

}
