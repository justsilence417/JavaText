package tw.org.iii.tutor;

public class text09_判斷閏平年 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判斷是否為閏年
		int year = 2024;
		boolean isLeap;
		
		if (year % 4 == 0) {
			if (year %100 == 0) {
				if (year %400 ==0) {
					//閏
					isLeap = true;
				}else {
					isLeap = false;
				}
			}else {
				//閏
				isLeap = true;
			}
		}else {
			//平
			isLeap = false;
		}
		System.out.printf("%d年為%s", year , (isLeap?"閏":"平"));
		//年代入到d,閏或平代入到s
		
		//--------------------
		if (year % 400==0 || (year % 4 ==0 && year %100 !=0) ) {
			//閏
			//400會在前是因為機率最小，最先判斷
		}else {
			//平
		}
	}
}
