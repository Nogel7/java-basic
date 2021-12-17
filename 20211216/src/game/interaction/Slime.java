package game.interaction;

public class Slime {
	private int hp;
	private int atk;
	private int def;
	
	public Slime() {
		this.hp = 3;
		this.atk = 1;
		this.def = 7;
	}
	
	public void doBattle(int uAtk) {
		this.hp = this.hp + this.def - uAtk;
		if(this.hp <= 0) {
		     this.hp = 0;
		     System.out.println("슬라임이 죽어서 반응하지 않습니다.");
		     return;
	       }
	        System.out.println("슬라임의 체력이 : " + hp);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

}

