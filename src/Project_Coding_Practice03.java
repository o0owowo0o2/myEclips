// Q3. 두 정수를 입력 받아서, 두 수중에서 큰 값을 구하는
//       자바 프로그램을 제작하시기 바랍니다.
//       결과 화면은 다음과 같이 구현하시기 바랍니다.
// 결과 화면
// 첫 번째 수를 입력해 주세요 ==> 
// 10
// 두 번째 수를 입력해 주세요 ==> 
// 20
// 두 번째 입력값 20이 더 큽니다.

import java.util.Comparator;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Project_Coding_Practice03 {
	public static void main(String[] args) {
		
		// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
		// scan 객체 참조 변수에 대입해 줍니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 수를 입력해 주세요 ==> ");
		int A = scan.nextInt();
		System.out.println("두 번째 수를 입력해 주세요 ==> ");
		int B = scan.nextInt();
		
		int result = Integer.max(A, B);
		System.out.println("두번쨰 입력값 " + result + "이 더 큽니다.");
		if (A > B){
			System.out.println("첫번째 입력값 " + A +"이 더큽니다.");
		}else if (A < B) {
			System.out.println("두번째 입력값 " + B +"이 더큽니다.");
		}
			else {
			System.out.println("입력하신 두 수의 값은 같습니다!");
		}

		// 객체 참조 변수 scan의 resource 자원 사용을 종결 처리합니다.
		scan.close();		
	}
}


