package overriding;

public class Dog extends Animal {
	
	 public String color;
	 
	 // 오버라이딩 요건
	 // 이름과 리턴자료형 등이
	 // 같은 부모쪽 메서드를
	 // 중복해서 작성함
	 public void howl() {
		 System.out.println("왈왈");
	 }
	 public void getinfo() {
		 System.out.println("이름 : " + name + ", 키 : " + height + ", 몸무게 : " + weight + "색깔 : " + color);
	 }
}
