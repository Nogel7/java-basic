package overriding;

public class Animal {
     public String name;
     public int height;
     public int weight;
     
     public void howl() {
    	 System.out.println("동물이 웁니다.");
     }
     
     public void getinfo() {
    	 System.out.println("이름 : " + name + ", 키 : " + height + ", 몸무게 : " + weight);
     }
}
