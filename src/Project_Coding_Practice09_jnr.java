// for문을 사용하여
// 2부터 9까지의 구구단 중에서 입력값의 단만 출력하는
// 자바 프로그램을 제작해 봅니다.
//  [실행 결과 예시(1) : Scanner 클래스 활용 5를 입력값으로 받을 경우,
// 2부터 9까지의 구구단 중에서 알고 싶은 단을 입력해 주세요 ==> 5
// [5단을 보여드리겠습니다]
// 5 X 1 = 5
// 5 X 2 = 10
// 5 X 3 = 15
// 5 X 4 = 20
// 5 X 5 = 25
// 5 X 6 = 30
// 5 X 7 = 35
// 5 X 8 = 40
// 5 X 9 = 45

import java.util.Scanner;

public class Project_Coding_Practice09_jnr {

    public static void main(String[] args) {

	// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
	// scan 객체 참조 변수에 대입해 줍니다.
	Scanner scan = new Scanner(System.in);

	System.out.print("2부터 9까지의 구구단 중에서 알고 싶은 단을 입력해 주세요 ==> ");
	int input = scan.nextInt();
//	System.out.println("input = " + input);
	
	if (input < 2 || input > 9) {
		System.out.println("입력값이 2부터 9사이의 값이 아닙니다!");
		System.out.println("프로그램이 종료 되었습니다!");
		return;
	}

	System.out.println("[" + input + "단을 보여드리겠습니다]");

	for (int i = 1; i <= 9; i++) {
		System.out.println(input + " X " + i + " = " + (input * i));
	}

	// scan 객체 참조 변수 활용이 끝나면 자원(Resource)을 닫아줍니다.
             scan.close(); 
    }
}

