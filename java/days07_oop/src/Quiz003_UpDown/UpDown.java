package Quiz003_UpDown;

import java.util.Scanner;

//난수이용
//1~100숫자중에서 임의의 난수 추출
// 사용자는 5번의 기회를 줘서 입력
// 그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성;
public class UpDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("@@@@@@@ Up & Down @@@@@@@");
		int r = (int)(Math.random()*100)+1;
		int cnt=0;
		System.out.println("임의의 숫자가 정해졌습니다!");
		System.out.println("1~100의 임의의 숫자를 5번의 기회동안 맞춰보세요!");
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요 : "); int answer = sc.nextInt();
			if(r == answer) { 
				System.out.println();
				System.out.println("정답은 " + r +"이 맞습니다~!! ㅊㅋㅊㅋ!!");
				break;//승리
			}
			else if(r>answer) { System.out.println("UPUP!!"); cnt++; } 
			else if(r<answer) { System.out.println("DownDown!!"); cnt++; }
		}
		//패배
		if(cnt==5) System.out.println("정답은 " + r + "이였습니다 ㅠㅠ");
	}
}
