package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike; //Bike從哪來

public class text19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike(); //宣告有個物件變數叫做Bike 初始化第一個動作叫new 在記憶體裡規劃一個空間出來
		//查看現在速度多少
		System.out.println(bike.getColor()); 
//		System.out.println(bike.getSpeed()); //0.0為double初始值
		//用使用者角度來寫
		bike.upSpeed();	bike.upSpeed();	bike.upSpeed();	bike.upSpeed();
//		System.out.println(bike.speed); //四個bike.upSpeed();使用者使用加速功能到1.728
//		System.out.println(bike.speed*6); //直接給值不合邏輯
		System.out.println(bike.getSpeed());
		bike.downSpeed();bike.downSpeed();
		System.out.println(bike.getSpeed()); //減速到0.84671
		
	}

}
