package interaction;

public class Seller {

	private int money;// 매출
	private int mango;// 망고재고
	private int kiwi;// 키위재고
	
	// 생성자에서 money는 초기값이 0이고, mango는 입력받도록 해주세요.
	public Seller(int mango,int kiwi) {
		this.money = 0;
		this.mango = mango;
		this.kiwi = kiwi;
	}
	// sellMango(int mango)를 이용해서 망고개수를 입력받으면(doBattle과 유사)
	// 자신의 this.mango 갯수만큼 차감하고, this.money는 망고개숫 *가격만큼 증가합니다.
	public void sellMango(int mango) {
		// 망고가 모자라면 "망고가 모자랍니다." 라고 하고 메서드를 종료합니다.
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
			return;// 메서드 강제종료구문
		}
		this.mango -= mango;
		this.money += mango * 4000;
	    }
	
	public void sellkiwi(int kiwi) {
		
		if(this.kiwi < kiwi) {
			System.out.println("키위가 모자랍니다. 현재 재고 : " + this.kiwi);
			return;
		}
		this.kiwi -= kiwi;
		this.money += kiwi * 3000;
	    }
	
	
	public void showSeller() {
		System.out.println("----------상인정보----------");
		System.out.println("현재소지금 : " + this.money + ", 현재망고재고 : " + this.mango + ", 현재키위재고 + " + this.kiwi );
		System.out.println("---------------------");
	}

	// Buyer에서 망고개수를 확인할 수 있도록 getMango() 게터만 하나 만들어주세요.
	public int getMango() {
		return this.mango;
	}
	
	public int getkiwi() {
		return this.kiwi;
	}
}
