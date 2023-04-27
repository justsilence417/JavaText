package tw.org.iii.tutor;

import tw.org.iii.myclasses.Scooter;

public class text20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scooter s1 =new Scooter(); //宣告是=之前,宣告一個名稱為s1的變數，其類型為Scooter
		//並用new Scooter()進行初始化，會先使用new這關鍵字創造Scooter物件，然後將其指派給s1變數
		
		s1.changeGear(2); //打二檔
		s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());
		s1.downSpeed();
		System.out.println(s1.getSpeed());
				
		
		
	}

}
