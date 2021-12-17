package polymorphism;

public class Police extends Person {
	
    private String position;
	
	public Police(String name, int age, String position) {
	     super(name, age);
	     this.position = position;
    }
	
	public void showPerson() {
		super.showPerson();// 이름과 나이를 콘솔에 찍어주는 구문
		System.out.println("경찰의 계급 : " + position);
	}
	
	public void showPlice() {
		System.out.println("저는 경찰입니다.");
	}

}
