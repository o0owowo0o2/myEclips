// while문을 사용하여, 1부터 Scanner 클래스 활용 입력값까지
// 양의 정수 중에서 다음의 실행 결과와 같이
// 알파벳 소문자를 출력하는 자바 프로그램을 제작해 봅니다.
//  [실행 결과 예시(1) : Scanner 클래스 활용 c를 입력값으로 받을 경우,
//  a, b, c
//  [실행 결과 예시(2) : Scanner 클래스 활용 e를 입력값으로 받을 경우,
//  a, b, c, d, e

// [힌트]
// 사용자로부터 알파벳 소문자 하나를 입력받기
// System.out.println("알파벳 소문자 하나를 입력하세요: ");
// char inputChar = scan.next().charAt(0); // 첫 번째 문자만 읽어옴

import java.util.Scanner;

public class Project_Coding_Practice07_Review_mjh {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);
        
        // 사용자로부터 알파벳 소문자 하나를 입력받기
        System.out.println("알파벳 소문자 하나를 입력하세요: ");
        char inputChar = scan.next().charAt(0); // 첫 번째 문자만 읽어옴
        System.out.println("inputChar 문자 = " + inputChar);
        char i = 'a';
        		
        while (i <= inputChar) {
			System.out.print(i + " ");
			i++;
        	if (i <= inputChar) {
				System.out.print(", ");
			}	
//			if (i <= inputChar) {
//				System.out.print(i + ", ");
//			}
		}




        scan.close(); // Scanner 객체 닫기
    }
}







