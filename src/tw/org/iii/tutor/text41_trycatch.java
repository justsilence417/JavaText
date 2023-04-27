package tw.org.iii.tutor;


public class text41_trycatch {

	public static void main(String[] args) {
		int a = 10 , b = 3 ;
		int [] c = {1,2,3,4};
		//對可能拋出例外 進行try結構
		try {
		System.out.println(a/b);
		System.out.println(c[4]);
		//double 10/0可以除但會出現無限大Infinity
		//若例外是有直系血親關係那順序互調會有關係
		}catch (ArithmeticException ae) //嘗試捕捉
			{
			System.out.println("Ooops!");
			}
		catch (ArrayIndexOutOfBoundsException ee) //嘗試捕捉
		{
		System.out.println("not much!");
		}
		System.out.println("ok");
	}

}
