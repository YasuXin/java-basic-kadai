package kadai_015;

public class Car_Chapter15 {
	private int gear = 1; //1速から5速のギア
	private int speed = 10; //ギアチェンジ後の速度
	
	public void gearChange(final int gear) {
		int oldGear = this.gear;
		this.gear = gear;
		this.speed = switch(gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
		System.out.println("ギア" + oldGear + "から" + gear + "に切り替えました");
	}
	
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}
}
