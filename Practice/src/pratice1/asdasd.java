package pratice1;

public class asdasd {

	public static void main(String[] args) {
		
		boolean su01 = true;
		boolean su02 = false;
		int k = 0;
		
		System.out.println(su01 && su02);
		System.out.println(su01 || su02);
		
		System.out.println(!su01);
		System.out.println(!(!su01));
		
		k = (su01 && su02) ? 0 : 3;
		
		k %= 10;
		System.out.println(++k);

	}

}

