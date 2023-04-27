package tw.org.iii.tutor;

public class text10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 3;
		if (--a >= 10 && ++b <= 3) {
			//若是一個& 前面判斷之後要判斷&之後
			//若兩個&& 前面判斷之後不用判斷&之後
			System.out.printf("OK: a = %d; b = %d", a, b);
		}else {
			System.out.printf("XX: a = %d; b = %d", a, b);
		}
	}
}
