package tw.org.iii.tutor;

import tw.org.iii.myclasses.Car;

public class text_Car {

	public static void main(String[] args) {
		//宣告有個物件變數叫做car 初始化第一個動作叫new 在記憶體裡規劃一個空間出來
		Car car =new Car();
		System.out.println(car.getColor()); 

		car.upSpeed();car.upSpeed();car.upSpeed();car.upSpeed();
		System.out.println(car.speed);
		
	}

}
