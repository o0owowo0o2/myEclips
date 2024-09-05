// 임의의 정수를 입력 받아서
// 양수, 음수, 0을 구분해서 보여주는
// 자바 프로그램을 제작하고 다음 결과 화면을 구현하시기 바랍니다.
// [실행 결과 화면]
// 임의의 정수를 입력해 주세요 ==> -10
// -10은 음수입니다.

import java.util.Scanner;

public class Project_Coding_Practice04 {

	public static void main(String[] args) {
		// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
		// scan 객체 참조 변수에 대입해 줍니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력해 주세요 ==> ");
		int num = scan.nextInt();
		
		if (num == 0) {
			System.out.println( num + " 입니다.");
		}else if (num > 0) {
			System.out.println(num +"은 양수 입니다.");
		}else {
			System.out.println(num + "은 음수입니다.");
		} 
			
		






		// 객체 참조 변수 scan의 resource 자원 사용을 종결 처리합니다.
		scan.close();
	}

}
