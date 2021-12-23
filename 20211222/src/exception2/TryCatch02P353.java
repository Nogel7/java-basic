package exception2;

import java.util.Scanner;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다.
		// / by zero(0으로 나누기)에 대한 처리는 허용하지 않습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("번호를 조회해 주세요");
		int i = scan.nextInt();
		int[] arr = {0, 1, 2};
		
		try {
			for(int a : arr) {// 항샹된 for문은 절대 인덱스를 오버할 수 없음
			System.out.println(arr[a]);
			}System.out.println("모든 번호 목록입니다.");
		}catch(Exception e) {
			System.out.println("번호가 존재하지 않습니다.");
		}finally {
			System.out.println("종료");
		}

	}

}
