package days06_Quiz;
// class sawn{
//�̸�, ����, �μ� �޿� ����ó
//setter/ getter method
//output method
//}
class Sawn{
	private String name, pos, depart, sal, hp;
	
	//�̸�
	public String getname()	{return name;}
	public void setname(String Name) { name = Name;}
	
	//����
	public String getpos()	{return pos;}
	public void setpos(String Pos) { pos = Pos;}
	
	//�μ�
	public String getdepart()	{return depart;}
	public void setdepart(String DEPART) { depart = DEPART;}
	
	//�޿�
	public String getsal()	{return sal;}
	public void setsal(String SAL) { sal = SAL;}
	
	//�μ�
	public String gethp()	{return hp;}
	public void sethp(String HP) { hp = HP;}
	
	public void output() {
		System.out.println(name+ "\n" + pos+ "\n" + depart+ "\n" + sal+ "\n" + hp);
	}
}

public class Quiz5_Sawn {
	public static void main(String[] args) {
		Sawn A = new Sawn();
		A.setname("��������");
		A.setpos("�丮��");
		A.setdepart("�ֹ�");
		A.setsal("30���޼�");
		A.sethp("�׸�׸�������");
		A.output();
	}
}
