package tw.org.iii.tutor;

public class text04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float 2^64; double 2^64
		float var1 = 123;
		float var2 = 12.3f;
		//小數點直接視為放在double,若放在float,會放不進去
		//除非改成12.3f,意思是放在float底下
		double var3 = 345;
		double var4 = 34.5;
		double var5 = 10/3;
		double var6 = 10/3.0;
		System.out.println(var6);
		float var7 = 10/3.0f;
		// 若10/3.0 int/double
		System.out.println(var7);
		
		
		
	}

}
