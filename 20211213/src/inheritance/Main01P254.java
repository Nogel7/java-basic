package inheritance;

public class Main01P254 {

	public static void main(String[] args) {
		// Student 가 Person을 상속했기 때문에
		// Student 는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "이성민";
		s1.age = 26;
		s1.stuNum = 22;
		
		s1.getinfo();
		s1.getStudentInfo();

	}

}
