package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		
		List<Integer> lotto = new ArrayList<>();
		
		int getNum = 0;
		
		while(lotto.size() != 6) {
			getNum = (int)(Math.random() * 45) + 1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		Collections.sort(lotto);
		
		List<Integer> winNum = new ArrayList<>();
		int count = 0;
		int getNum2 = 0;
		// 아래 6개 뽑고 비교하는 부분을 반복문으로 처리해야 합니다.
		// 조건식은 "당첨인 경우 탈출로 해주시면 됩니다.
		while(!lotto.equals(winNum)) {// .equals가 lotto와 winNum이 다르다면 6개를 뽑는다.
			// 6개가 이미 뽑혀있는 상황이라면 당첨번호를 어떻게 해줘야 할지
			winNum.clear();
			
			while(winNum.size() != 6) {
				getNum2 = (int)(Math.random() * 45) + 1;
				if(!winNum.contains(getNum2)) {
					winNum.add(getNum2);
				}
			}
        Collections.sort(winNum);
        System.out.println("" + lotto + winNum);
        // 모든 로직이 끝난 시점이 번호를 1세트 뽑은 시점임
        // 그러므로 모든 로직이 다 끝나고 마지막에 1더해줌
        count++;
        
        }
		// 반복문이 몇 바퀴 돌았는지 카운팅하는 로직을 위에 추가해주세요.
		// 저의경우는 반복문 진입 전에 int count = 0;을 만들어놓고
		// 반복문이 한 바퀴 돌 때마다 count++; 를 이용해 1씩 증가시켜놓고
		// 탈출 후에 콘솔에 최종 횟수만 찍히도록 합니다.
	    System.out.println("구매한 로또복권의 개수 : " + count);
		
		}
        
	
	}
       
    

