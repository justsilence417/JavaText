package tw.org.iii.tutor;

public class text26 {

	public static void main(String[] args) {
		byte b1 = 123;
		int i1 = b1;
		int i2 = 128;
		//為何要強制轉型
		byte b2 = (byte)i2;
		System.out.println(b2); //-128喪失其精度
		System.out.println("----");
		byte b3 = 127;
//		b3 = b3+1;
		b3++;
		System.out.println(b3);//-128喪失其精度
		b3 += 1; // b3 = b3+1
		System.out.println(b3); //-127
		
		
	}

}
