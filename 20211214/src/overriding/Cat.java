package overriding;

public class Cat extends Animal {
	
	public String species;
	
	public void howl() {
		System.out.println("야옹");
	}
	public void getinfo() {
		System.out.println("이름 : " + name + ", 키 : " + height + ", 몸무게 : " + weight + "종 : " + species);
	}
	
}
