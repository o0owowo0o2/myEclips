// for문을 사용하여, 1부터 Scanner 클래스 활용 입력값(예시 : 20)까지
// 양의 정수 중에서 다음의 실행 결과와 같이
// 3의 배수값들을 출력하고, 3의 배수값들의 합을 다음의 실행 결과와 같이 구하는
// 자바 프로그램을 제작해 봅니다.

// [Scanner 클래스 활용 입력값이 10일 경우]
// 3의 배수값을 알고 싶은 입력값을 입력해 주세요 ==> 10
// 3의 배수값 = 3
// 3의 배수값 = 6
// 3의 배수값 = 9
// 1부터 10까지 숫자 중에서 3의 배수값들의 합 = 18

// [Scanner 클래스 활용 입력값이 20일 경우]
// 3의 배수값을 알고 싶은 입력값을 입력해 주세요 ==> 20
// 3의 배수값 = 3
// 3의 배수값 = 6
// 3의 배수값 = 9
// 3의 배수값 = 12
// 3의 배수값 = 15
// 3의 배수값 = 18
// 1부터 20까지 숫자 중에서 3의 배수값들의 합 = 63

import java.util.Scanner;

public class Project_Coding_Practice11_for_mjh_Question{
	public static void main(String[] args) {

		// Scanner 클래스를 활용하여 시스템으로부터 입력 받은 값을 변수 in에 담아서
		// scan 객체 참조 변수에 대입해 줍니다.		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("3의 배수값을 알고 싶은 입력값을 입력해 주세요 ==>");
		int inputInt = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= inputInt; i++) {
			if (i%3 == 0) {
				System.out.println("3의 배수값 = " + i);
				sum = sum+ i;
			}			
		}
		System.out.println("1부터" + inputInt + " 까지 숫자 중에서 3의 배수값들의 합  = " + sum);
	 
		// 모든 처리가 종결되면 객체 참조 변수 scan의 resource 자원 사용을 종결 처리합니다.
		scan.close();
	}
}





