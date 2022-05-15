package edu.kosa.view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.kosa.dao_xml.UserDAO;
import edu.kosa.model.UserVO;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		UserDAO dao = ctx.getBean("dao",UserDAO.class);
		System.out.println("확인하고싶은 id?");
		String id = sc.next();
		UserVO vo =	dao.selectById(id);
		System.out.println(vo.getId() + " " + vo.getName() + " " + vo.getPassword());
		
		/*UserDAO dao = new OracleUserDAOImpl();

		Scanner sc = new Scanner(System.in);
		dao.menu();
		switch (sc.nextInt()) {
		case 1:
			UserVO user = new UserVO();
			System.out.print("user id = "); user.setId(sc.next());
			System.out.print("user name = "); user.setName(sc.next());
			System.out.print("user password = "); user.setPassword(sc.next());
			dao.insert(user);
			System.out.println(user.getId() + " 추가 성공 !!!");
			System.out.println("=========================");
			break;
		case 2:
			UserVO user1 = new UserVO();
			dao.selectAll(user1);
			break;
		case 3:
			UserVO user2 = new UserVO();
			System.out.print("ID = "); user2.setId(sc.next());
			dao.selectById(user2);
			System.out.println("selectByID 성공");
			System.out.println("=========================");
			break;
		case 4:
			UserVO user3 = new UserVO();
			System.out.print("ID :"); user3.setId(sc.next());
			System.out.print("수정할 Password :"); user3.setPassword(sc.next());
			dao.Update(user3);
			System.out.println(user3.getPassword() + "로 변경완료!");
			System.out.println("=========================");
			break;
		}
		System.out.println("");*/
	}
}
