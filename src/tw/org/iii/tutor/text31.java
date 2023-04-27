package tw.org.iii.tutor;

public class text31 {

	public static void main(String[] args) {
		RecShape s1 = new RecShape(10,3);
		Circle s2 = new Circle(4);
		System.out.println(m1(s1));
		System.out.println(m1(s2));
	}
	//呼叫方法
	static String m1(Shape Shape) {
		//instanceof:左邊物件是不是右邊物件的實體
		if (Shape instanceof RecShape) {
			//強制轉型 打回原形 父類別轉回子類別
			System.out.println(((RecShape)Shape).isSquare()?"ok":"xx");
			//是否為矩形
			
		}else if(Shape instanceof Circle) {
			System.out.println(((Circle)Shape).getDiameter());
		}
		//總長度加上面積
		return Shape.length()+":"+Shape.area();
	}

}
//interface介面 Shape幾何形狀:都有計算邊長總和
//介面裡全abstract抽象
interface Shape{
	//介面是功能實作，方法不寫是正常的
	double length(); //長 隱含public 且抽象abstract
	double area(); //面積
	
}
//矩形 implements Shape這個類別要能執行形狀這件事
//介面功能是對外公開因此用public
class RecShape implements Shape{
	int w,h;
	public RecShape (int w,int h) {
		this.w = w;this.h = h;
	}
	public double length() {return (w+h)*2;}
	public double area() {return w*h;}
	public boolean isSquare() {return w == h;}
}
//圓形
class Circle implements Shape{
	double r;
	Circle (double r){this.r =r;}
	public double length() {return r*2*Math.PI;}
	public double area() {return r*r*Math.PI;}
	//直徑
	public double getDiameter() {return 2*r;} 
}