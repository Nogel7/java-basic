package practices;

public class Cafe {
	public String name;
	public int flatArea;
	public boolean coffeeMachine;

	
	public Cafe(String n,int f) {
		name = n;
		flatArea = f;
		coffeeMachine = false;
	}
    public void getinfo() {
    	System.out.println("카페이름 : " + name + ", 평수 : " + flatArea + " , 커피머신 : " + coffeeMachine);
	}
  public void coffeeMachine() {
	  coffeeMachine = true;
  }
}
