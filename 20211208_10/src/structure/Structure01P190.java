package structure;

public class Structure01P190 {

	public static void main(String[] args) {//실행부
		// 이제부터는 실행(main)코드와 정의(class)코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
        
		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person();// 대입연산자같은경우 오른쪽에 펄슨양식을 힙에생성해주고 왼쪽스택에 p1메인지역에 생성
		// p1내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "이성민";
		System.out.println(p1.name);
		p1.age = 20;
		System.out.println(p1.age);
		p1.PNum = "01062169872";
		System.out.println(p1.PNum);
		p1.uNum = 152873;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 하나 만들어 봅니다.
		Person p2 = new Person();
		// p2에도 name,age,pNum,uNum을 부여해서
		// 콘솔에 찍어주세요.
		p2.name = "이성만";
		System.out.println(p2.name);
		p2.age = 23;
		System.out.println(p2.age);
		p2.PNum = "01062334472";
		System.out.println(p2.PNum);
		p2.uNum = 1523;
		System.out.println(p2.uNum);
			
		Person p3 = new Person();
	
		p3.name = "이승훈";
		System.out.println(p3.name);
		p3.age = 25;
		System.out.println(p3.age);
		p3.PNum = "01047428952";
		System.out.println(p3.PNum);
		p3.uNum = 77;
		System.out.println(p3.uNum);
				
	    System.out.println("사람 1의 정보입니다.");
	    System.out.println();
		
	}

}
