package tw.org.iii.tutor;

public class text13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for(printBrad();i<10;printLine()) {
			//宣告有個i初始值為0;0有無<10;0++變成1再到第二道繼續判斷
			System.out.println(i++);
		}

	}
	static void printBrad() {
		int lottery = (int)(Math.random()*49+1);
		System.out.println("Brad"+lottery);
	}
	static void printLine() {
		System.out.println("-----");
	}

}
