package days5_Quiz;
// 배열안에서 7의 개수
public class Array1Quiz001 {
	public static void main(String[] args) {
		int[] arr = {1,7,5,7,2,8,9,7,12,5,7,99};
		int cnt=0,seek = 7;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==seek) cnt++;
		}
		System.out.println(cnt);
	}
}
