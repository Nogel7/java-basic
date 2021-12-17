package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		Salaryman s1 = new Salaryman();
		Student s2 = new Student();
		s1.name = "이성민";
		s1.age = 26;
		s1.salary = 4800;
		
		s2.name = "임재원";
		s2.age = 18;
		s2.stuNum = 7;
		
		s1.getSalaryInfo();
		s1.getinfo();
		s2.getStudentInfo();
		s2.getinfo();
 
	}

}
