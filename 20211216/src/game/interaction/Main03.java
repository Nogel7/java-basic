package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		Thief t1 = new Thief();
		Orc o2 = new Orc();
		Troll t2 = new Troll();
		Troll t3 = new Troll();
		w1.huntTroll(t2);
		w1.huntTroll(t2);
		System.out.println("-----------------------");
		t1.huntTroll(t3);
		t1.huntTroll(t3);

	}

}
