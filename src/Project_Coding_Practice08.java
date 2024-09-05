// for문과 continue문을 사용하여
// 2부터 9까지의 구구단 중에서 짝수 단만 출력하는
// 자바 프로그램을 제작해 봅니다.

public class Project_Coding_Practice08 {

	public static void main(String[] args) {

		int dan;
		int times;
		
		for (dan = 2;  dan<=9; dan++) {
			if(dan%2 != 0) {
				continue;
			}
			System.out.println(dan + "단");
			for (times = 1;  times <= 9; times++) {
				System.out.println(dan + " X " + times + " = " + (dan*times));
			}			
		}
	}
}
