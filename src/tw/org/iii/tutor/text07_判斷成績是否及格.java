package tw.org.iii.tutor;

public class text07_判斷成績是否及格 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//亂數產生成績判斷成績是否及格
		double temp = Math.random();
		System.out.println(temp*101);
		int score = (int)(temp*101);
		System.out.println(score);//強制轉型成整數
			
		if (score >= 60) {
			System.out.println("pass");
		}else {			System.out.println("down");
			}
	}

}
