// while문을 사용하여, 1부터 Scanner 클래스 활용 입력값까지
// 양의 정수 중에서 다음의 실행 결과와 같이
// 3의 배수만 출력하는 자바 프로그램을 제작해 봅니다.
//  [실행 결과 예시(1) : Scanner 클래스 활용 20를 입력값으로 받을 경우,
//  3, 6, 9, 12, 15, 18
//  [실행 결과 예시(2) : Scanner 클래스 활용 10를 입력값으로 받을 경우,
//  3, 6, 9

import java.util.Scanner;

public class Project_Coding_Practice07_mjh {

    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        System.out.print("양의 정수를 입력하세요 ==>");
        int inputNum = scan.nextInt();
		int i = 0;
		
//		if (inputNum < 1) {
//			System.out.println("양의 정수가 아닙니다. 재실행 해주세요.");
//		} scan.close(); // Scanner 객체 닫기
//		
        while(i <= inputNum) {
        	i++;
			if (i%3 ==0)  {
				System.out.print(i+", ");		
		} 
        scan.close(); // Scanner 객체 닫기
    }
   }
 }









