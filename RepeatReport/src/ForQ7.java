
public class ForQ7 {

	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		// ****
		// ***
		// **
		// *
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 줄어드는데, i--와 같이 이번에는
		// 변수 크기를 줄여가면서 진행하셔야 합니다.

        // 4줄이므로 i반복문을 4번 반복하게 해야하는데
		// 별 갯수는 점점 줄어드므로 i for문은 큰 수에서 점점 작아지도록 하고
		// j의 반복횟수는 처음엔 컸다가 점점 작아지는 i변수를 받아서
		// 줄어들게 세팅합니다.
		for(int i=4; i > 0; i--) {
			for(int j =0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}    

}
