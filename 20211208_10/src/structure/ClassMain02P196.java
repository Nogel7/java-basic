package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "아반떼";
		c1.owner = "이성민";
		c1.price = 2000;
        c1.getinfo();
        
		Car c2 = new Car();
		c2.model = "쏘나타";
		c2.owner = "이승훈";
		c2.price = 3000;
		c2.getinfo();
	}

}
