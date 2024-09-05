
import java.util.Scanner;

import javax.annotation.Resource;

public class Project_Coding_Practice_mjh {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1 이상 10 미만의 자연수 a,b를 입력하세요.");
		
		System.out.print("첫번째 정수를 입력해 주세요 ===>");
		int a = scan.nextInt();
		System.out.print("두번째 정수를 입력해 주세요 ===>");
		int b = scan.nextInt();
		
		
		
		if (a < 1 || b < 1) {
			System.out.println("a, b 숫자는 0보다 큰 숫자를 입력해 주세요!");
		}else if (a > 9 || b > 9) {
			System.out.println("a, b 숫자는 10보다 작은 숫자를 입력해 주세요!");
		} else {
			System.out.println("a * b 결과값 = " + (a*b) + "입니다!");
		} 
		
		scan.close();
}
}