package days06_Quiz;
// class sawn{
//이름, 직급, 부서 급여 연락처
//setter/ getter method
//output method
//}
class Sawn{
	private String name, pos, depart, sal, hp;
	
	//이름
	public String getname()	{return name;}
	public void setname(String Name) { name = Name;}
	
	//직급
	public String getpos()	{return pos;}
	public void setpos(String Pos) { pos = Pos;}
	
	//부서
	public String getdepart()	{return depart;}
	public void setdepart(String DEPART) { depart = DEPART;}
	
	//급여
	public String getsal()	{return sal;}
	public void setsal(String SAL) { sal = SAL;}
	
	//부서
	public String gethp()	{return hp;}
	public void sethp(String HP) { hp = HP;}
	
	public void output() {
		System.out.println(name+ "\n" + pos+ "\n" + depart+ "\n" + sal+ "\n" + hp);
	}
}

public class Quiz5_Sawn {
	public static void main(String[] args) {
		Sawn A = new Sawn();
		A.setname("스펀지밥");
		A.setpos("요리사");
		A.setdepart("주방");
		A.setsal("30만메소");
		A.sethp("네모네모스펀지밥");
		A.output();
	}
}
