package structure;

public class ClassMain01P196 {
     // PersonClass의 메서드는 작성할 필요가 없습니다.
	 // 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		PersonClass p1 = new PersonClass();
		p1.age = 21;
		p1.name = "이성민";
		p1.pNum = "01012345678";
		p1.uNum = 23;
		p1.address = "서울";
		p1.getinfo();// method 찍을때도 같이 생긴다
		
		PersonClass p2 = new PersonClass();
		p2.age = 26;
		p2.name = "이지성";
		p2.pNum = "01044447777";
		p2.uNum = 39;
		p2.address = "부산";
        p2.getinfo();
	}

}
