package board.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {
	
	private int seq;
	private String title, writer, content;
	private Date regDate;
	private int cnt;
	private String searchCondition;
	private String searchKeyword;
	
	public String toString() {
		return "seq : " + seq + "\t" + "writer : " + writer;
	}
}
