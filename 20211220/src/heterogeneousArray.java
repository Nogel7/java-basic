
public class heterogeneousArray {
     
	public static void main(String[] args) {
		// int[] 에는 정수만 넣을 수있음
		int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		// int[] intArr = { "a", "b", 1, 2};문자열이 있어서 에러발생
		
		// iArr 를 항상된 for문으로 출력해보세요.
		for(int value : iArr) {
			System.out.println("," + value);
		}
        System.out.println();
        
        // 여러 자료형을 받을 수 있도록 모든 클래스의 부모인 Object로 배열 생성
        // object는 다형성의 원리에 의해 모든 자료를 지정받을수 있다.
        Object[] oArr = {"a", "b", 1,2, 3.0, 5.1};
        for(Object value : oArr) {
        	System.out.println("," + value);
        }
	}

}
