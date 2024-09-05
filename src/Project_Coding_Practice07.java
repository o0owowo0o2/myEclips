// while문을 사용하여, 1부터 Scanner 클래스 활용 입력값까지
// 양의 정수 중에서 다음의 실행 결과와 같이
// 3의 배수만 출력하는 자바 프로그램을 제작해 봅니다.
//  [실행 결과 예시(1) : Scanner 클래스 활용 20를 입력값으로 받을 경우,
//  3, 6, 9, 12, 15, 18
//  [실행 결과 예시(2) : Scanner 클래스 활용 10를 입력값으로 받을 경우,
//  3, 6, 9

import java.util.Scanner;

public class Project_Coding_Practice07 {

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        System.out.print("3의 배수를 알고 싶은 임의의 양의 정수값을 입력하세요 ==> ");
        int inputNumber = scan.nextInt();
        
        System.out.println("[" + inputNumber + "의 3의 배수]");
        int i = 3;
        while (i <= inputNumber) {
			System.out.print(i); // 3의 배수 출력
			if (i + 3 <= inputNumber) {
				System.out.print(", "); // 다음 3의 배수가 존재한다면 콤마와 공백을 추가해 줌 
			}
			i += 3; // i = i + 3; // 다음 3의 배수로 증가 처리
		}

        scan.close(); // Scanner 객체 닫기
    }
}





