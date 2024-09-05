import java.util.Scanner;

// 임의의 입력값을 입력 받아서 다음의 [실행 결과값]과 같이 출력되도록
// if문과 break, continue, for문을 이용해서 자바 프로그램을 제작하시기 바랍니다.
//[실행 결과값(1) : 10을 입력했을 경우]
//0, 2, 4, 6, 8, 10
//[실행 결과값(2) : 14를 입력했을 경우]
//0, 2, 4, 6, 8, 10, 12, 14

public class Project_Coding_Practice05_Review_mjh {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 => ");
		int num = scan.nextInt();
		
			for (int i = 0; i < 100; i++) {
				if (i%2 == 1) continue; {
//					System.out.println(i);
				}if (i > num)  {
					break;
				}if (i < num) {
					System.out.print(i + ", ");	
				}else {
					System.out.println(i);
				}
		}
	}
}
