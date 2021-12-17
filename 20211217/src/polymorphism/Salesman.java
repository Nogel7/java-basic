package polymorphism;

public class Salesman extends Person {
	
	private int score;
	
	public Salesman(String name, int age, int score) {
	     super(name, age);
	     this.score = score;

    }
	
	public void showPerson() {
		super.showPerson();// 부모측 조회메서드 호출 접근제한자가 프라이빗이라 슈퍼로 호출한거
		System.out.println("세일즈맨의 판매누적 : " + score);
	}
	
	public void showSalesman() {
		System.out.println("저는 판매원입니다.");
	}
}
