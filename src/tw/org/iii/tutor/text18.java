package tw.org.iii.tutor;

public class text18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		do {
			System.out.println(a--);
		}while(a > 0);
		
		System.out.println("------");
		while(a < 10) {
			System.out.println(a++);
		}
		System.out.println("------");
		a = 0;
		
		//與上面的while迴圈一樣意思的寫法
		for (;a<10;) {
			System.out.println(a++);
		}
	}

}
