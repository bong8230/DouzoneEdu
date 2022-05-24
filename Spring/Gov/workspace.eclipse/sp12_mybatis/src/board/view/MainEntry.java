package board.view;

import java.util.List;

import board.controller.BoardDAO;
import board.model.BoardVO;

public class MainEntry {
	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
//		vo.setTitle("test");
//		vo.setWriter("test");
//		vo.setContent("test...");
//		dao.insertBoard(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = dao.getBoardList(vo);
		
		for (BoardVO boardVO : boardList) {
			System.out.println("===>" + boardVO.toString());
		}
		
	}
}
