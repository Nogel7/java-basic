import java.util.Scanner;

public class ForQ5 {

	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		// ex) 3 입력시
		// ***
		// ***
		// *** 과 같이 출력
		// 가로줄 출력시 System.out.print("*");을
		// 세로줄 출력시 System.out.println("*");을 씁니다.
		
		 // i for문 내부에서 println을 실행하므로 세로 길이를 담당
	     // j print를 이용해 실행하므로 가로 길이를 담당
		 Scanner scan = new Scanner(System.in);
		 System.out.println("한변의 길이를 입력해주세요.");
		 int count = scan.nextInt();
		 
		 for(int i = 0; i < count; i++) {
			 for(int j = 0; j < count; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		
	
		 
		 

	}

}
