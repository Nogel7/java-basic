package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		Map<String,Integer> menu = new HashMap<>();
		
		menu.put("스파게티",10000);
		menu.put("피자",18000);
		menu.put("스테이크",25000);
		menu.put("마늘빵",3000);
		menu.put("음료수",2000);
		System.out.println(menu);
		
		System.out.println("스파게티 가격 : " + menu.get("스파게티"));
		System.out.println("피자 가격 : " + menu.get("피자"));
		System.out.println("음료수 가격 : " + menu.get("음료수"));
		

	}

}
