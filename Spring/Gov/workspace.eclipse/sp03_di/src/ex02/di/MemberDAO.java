package ex02.di;

public class MemberDAO {
	private MemberBean vo;
	
	public MemberDAO() {}

	public MemberDAO(MemberBean vo) { //DI
		super();
		this.vo = vo;
	}

	public void setVo(MemberBean vo) { //DI
		this.vo = vo;
	}
	
	public void insert() {
		System.out.println(vo.getName() + " < " + vo.getAge() + " > " + vo.getMessage());
	}
	
	
}
