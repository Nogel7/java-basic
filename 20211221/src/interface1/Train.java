package interface1;

public class Train implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = TRAIN_MAX_GAS;
	}
	
	@Override
	public void accel() {
		
		if(speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD ) {
			speed = TRAIN_MAX_SPD;
		}else {
			speed += TRAIN_INCREASE_SPD;
		}
		
		gas -= TRAIN_DECREASE_GAS ;
	}

	@Override
	public void breakspeed() {
		
		if(speed - TRAIN_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		}else {
			speed -= TRAIN_DECREASE_SPD;
		}
		
	}

	@Override
	public void reFuel() {
		
		if(gas + TRAIN_INCREASE_GAS > TRAIN_MAX_GAS) {
			gas = TRAIN_MAX_GAS;
		}else {
			gas += TRAIN_INCREASE_GAS;
		}
		
	}

	@Override
	public void showStatus() {
		
		System.out.println("현재속도 : " + speed);
		System.out.println("현재연료량 : " + gas);
		System.out.println("기관사명 : " + name);
		System.out.println("---------------------");
		
		
	}

}
