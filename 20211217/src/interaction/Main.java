package interaction;

public class Main {

	public static void main(String[] args) {
		Seller s1 = new Seller(30,10);
		Seller s2 = new Seller(20,20);
		
		Buyer b1 = new Buyer(200000);
		
		s1.showSeller();
        s2.showSeller();
        b1.showBuyer();
        
        System.out.println("========s1에게 구매===========");
        b1.buykiwi(s1, 5);
        s1.showSeller();
        s2.showSeller();
        b1.showBuyer();
        
     
       
        
        

	}

}
