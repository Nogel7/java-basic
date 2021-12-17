package structure;

public class Structure03P190 {
    public static void getinfo(Cat c3) {
    	System.out.println(c3.name+"의 정보입니다.");
    	System.out.println("고양이이름 : "+ c3.name + " 고양이나이 : " + c3.age + " 고양이성별 : "+c3.animalsex);
    }
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.age = 2;
		c1.name = "sora";
		c1.animalsex = "male";
		
		Cat c2 = new Cat();
		c2.age =7;
		c2.name = "su";
		c2.animalsex = "female";
		getinfo(c1);
		getinfo(c2);
	}
}
