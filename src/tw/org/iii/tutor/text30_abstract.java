package tw.org.iii.tutor;

public class text30_abstract {

	
	public static void main(String[] args) {
//		text301 obj1 = new text301();
		text301 obj2 = new text302();
		text301 obj3 = new text303();
		obj2.m2();
		obj3.m2();
	}
}
	abstract class text301{
		text301(int a){
			System.out.println("text301()");
		}
		void m1(){System.out.println("text301:m1()");}
		abstract void m2();
		//寫在public 以外的只在問package 可以使用
		//一個檔案/物件 只能有一個public
//		任何一個類別內只要存在抽象方法，一定被宣告抽象類別 無法直接建構出物件實體 間接可以
//		若內沒有抽像方法，也可以被宣告抽象類別，不要讓你做text301 obj1 = new text301();這件事
		//強迫後代繼承
	
	}
	 class text302 extends text301{
		 text302(){
			 super(1);
			 System.out.println("text302()");
		 }
		 void m2() {System.out.println("text302:m2()");}
	}
	 
	 class text303 extends text301{
		 text303(){
			 super(1);
			 System.out.println("text302()");
		 }
		 void m2() {System.out.println("text302:m2()");}
	}

