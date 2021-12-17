package constructor;

public class Main02P204 {

	public static void main(String[] args) {
		// 성공사례
		BaketballPlayer b1 = new BaketballPlayer(220,100);// 키,점프력 순으로 전달
        b1.dunkShoot();
        // 실패사례
        BaketballPlayer b2 = new BaketballPlayer(200,90);
        b2.dunkShoot();
      }

}
