package tw.org.iii.tutor;

public class text12_幾月有幾天 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month =(int)(Math.random()*12+1);
		int days = 0;
		//switch()裡面的值 只能是byte short int char String(字串是物件所以開頭大寫) enum(列舉)
		switch (month) {
		case 1,3,5,7,8,10,12:
			days = 31;
			break; //可省略 但效果不一樣 省略代表判斷後要銜接下一句判斷
		case 2:
			days = 28;
			break;
		case 4,6,9,11:
			days = 30;
			break;
	
		default:
			System.out.println("XX");
			break;
		}
		System.out.printf("%d月有%d天",month,days);
	}
	
}
