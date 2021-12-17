package game.interaction;

public class Troll {
	private int hp;
    private int atk;
    private int def;


    public Troll() {
        this.hp = 7;
        this.atk = 2;
        this.def = 1;
    }
    
    public void doBattle(int uAtk) {
    	this.hp = (this.hp + this.def) - uAtk;
    	if(hp <= 0) {
    		this.hp = 0;// 필수는 아님, 죽음 몬스터 체력은 0으로 보정
    		System.out.println("트롤이 죽어서 반응하지 않습니다.");
    		return;// 두가지로 활용 배달/메서드를 강제로 종료 여기선 후자
    	}
    	System.out.println("트롤의 체력이 : " + hp);//트롤이 안 죽어야 실행됨
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