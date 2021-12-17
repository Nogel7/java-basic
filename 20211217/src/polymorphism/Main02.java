package polymorphism;

public class Main02 {

	public static void main(String[] args) {
		// 생성 및 정보조회, Person으로 받음
		Person p1 = new Person("이성민",26);
		Person sm1 = new Salesman("임재원",26,20);
		Person pc1 = new Police("나경찰", 29,"순경");
		
		p1.showPerson();
		sm1.showPerson();
		pc1.showPerson();

	}

}
