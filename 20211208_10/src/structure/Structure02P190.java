package structure;

public class Structure02P190 {

    // person 내부의 정보를 쉽게 조화하기 위한 메서드 생성
	public static void getinfo(Person p) {
		System.out.println("이름 : "+ p.name + "나이 : "+ p.age + "연락처 : "+p.PNum+"번호 : "+p.uNum);
	}
	
	public static void main(String[] args) {
		// 사람을 두명 만들어보세요(a,b)
		Person a = new Person();
		a.name = "정상수";
		a.age = 40;
		a.PNum = "01012345678";
		a.uNum = 89;
		
		Person b = new Person();
		b.name = "쟁상수";
		b.age = 35;
		b.PNum = "01067127367";
		b.uNum = 17;
		getinfo(a);// a의 주소값을 getinfo의 p에 전달
		getinfo(b);// b의 주소값을 getinfo의 p에 전달
		
		
		
	    
		
		
	}

}
