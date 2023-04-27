package tw.org.iii.tutor;

public class text29 {

	public static void main(String[] args) {
		text292 obj1 = new text292();
		text291 obj2 = new text292();
		text291 obj3 = new text293();
		doThing(obj3);
		
	}
	
	static void doThing (text291 obj) { //這的obj(隨意取的)跟上面的obj1(變數)不一樣
		obj.m1();
	}

}

class text291 { void m1() {System.out.println("text291:m1()");} }
class text292 extends text291 {
	void m1() {System.out.println("text292:m1()");}
	void m2() {System.out.println("text292:m2()");}
}
class text293 extends text292 {
	void m1() {System.out.println("text293:m1()");}
	void m2() {System.out.println("text293:m2()");}
}
	