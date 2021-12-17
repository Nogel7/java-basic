package structure;

public class Cat2 {
     
	public static void getinfo(Cat c) {
	 System.out.println(c.age);
	 System.out.println(c.name);
	 System.out.println(c.sex);
	 System.out.println(c.num);
	    
	}
	
	
	
	public static void main(String[] args) {
		Cat c1 = new Cat();
		
	    c1.age = 7;
	    c1.name = "bora";
	    c1.sex = "boy";
	    c1.num = "01012345678";
	    System.out.println(c1.age);
	    System.out.println(c1.name);
	    System.out.println(c1.sex);
	    System.out.println(c1.num);
	    
	    Cat c2 = new Cat();
	    c2.age = 2;
	    c2.name = "sora";
	    c2.sex = "girl";
	    c2.num = "01098765432";
	    System.out.println(c2.age);
	    System.out.println(c2.name);
	    System.out.println(c2.sex);
	    System.out.println(c2.num);
	    getinfo(c1);
	    getinfo(c2);
	    
	}

}
