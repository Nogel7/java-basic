package casting;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name,age);
		}
		public void bark() {
			System.out.println("짖기를 시전합니다.");
		}
	    public void sit() {
	    	System.out.println("강아지가 앉습니다." );
	    }

}
