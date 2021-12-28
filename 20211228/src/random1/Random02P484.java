package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02P484 {

	public static void main(String[] args) {
		// Random객체를 생성한 다음 nextBoolean()기능을 이용해서
		// 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		// 프로그램이 다 끝났을때 앞면 몇 회, 뒷면 몇 회 인지
		// 콘솔에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력받습니다.
		Scanner scan = new Scanner(System.in);
		
		// 동전 던질 횟수 입력받기
		System.out.println("동전 던질 횟수를 알려주세요.");
		int count = scan.nextInt();
		
		
		int head = 0;
		int tail = 0;
		

	    Random coin = new Random();
	    
	   for(int a = 0; a < count; a++) {
		   // random.nextBoolean()이 true면 앞면 1증가
		   // false면 뒷면 1증가하도록 조건식 작성
		   boolean result = coin.nextBoolean();
		   if(result == true) {
			   head++;
		   }else if(result == false) {
			   tail++;
		   }
	    	
	    }
	    // 다 돌고나서돌린 결과값 콘솔찍기
	    System.out.println("--동전을 " + count + "회 던진 결과--");
		System.out.println("앞면: " + head);
		System.out.println("뒷면: " + tail);
		
		}

}
