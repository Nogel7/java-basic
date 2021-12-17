package game.inheritance;

// 1.뼈대가 되는 정보를 가진 Commoner 상속
public class Warrior extends Commoner {
	
	private int pDam;
	
    public void getinfo() {
    	System.out.println("아이디 : " + id + ", 레벨 : " + lv + ", 체력 : " + hp + ",마나 :" + mp + ", 물리데미지 : " +  pDam);
  }
    
    public Warrior(String id) {
    	super(id);// 다른 코드에 앞서서 무조건 1순위로 돌와와야함
    	this.pDam = 2; // 물리데미지 설정하기
    }
}	