package tw.org.iii.tutor;

public class text33 {

	public static void main(String[] args) {
		int a =10;
		//版本9開始被禁用 但現在版本17還可以用
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		int d = Integer.parseInt("10");
		
		//將10自動封箱 變成物件
		Integer e =22; //auto-boxing
		System.out.println(e.doubleValue());
		
		//物件與基本型別的整數差異: 物件不能相加?
		//b,c物件直接解封箱 將其數字相加
//		Bike b1= new Bike();
//		Bike b2= new Bike();
		System.out.println(b+e); //b,c=>auto-unboxing
		
	

	}

}
