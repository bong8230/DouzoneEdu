package days5_basic;

public class MultiBreak {
	public static void main(String[] args) {
		boolean flag = true;
		
		first:{
			second:{
				thrid:{
					int k = 100;
					System.out.println("Before the break");
					
					if(flag) break second; //second ∫Ì∑∞¿ª ≈ª√‚
					
					System.out.println("This won't execute");
				}//end thrid
				System.out.println("hihihihi");
			}//end second
		System.out.println("byebyebye");
		}//end first
	}
}
/*
 * 
*/