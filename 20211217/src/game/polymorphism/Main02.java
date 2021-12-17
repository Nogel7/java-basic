package game.polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Commoner c1 = new Commoner("나는초보");
		Monster s1 = new Slime();
		Monster g1 = new Goblin();
		
		c1.hunt(s1);
		c1.hunt(g1);

	}

}
