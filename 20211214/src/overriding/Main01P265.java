package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 개와 고양이를 생성해 보겠습니다.
		Dog d1 = new Dog();
		d1.name = "나서스";
		d1.height = 27;
		d1.weight = 10;
		d1.color = "검정";
		d1.howl();
		d1.getinfo();
		
		Cat c1 = new Cat();
		c1.name = "유미";
		c1.height = 23;
		c1.weight = 6;
		c1.species = "뱅골";
		c1.howl();
		c1.getinfo();
		

	}

}
