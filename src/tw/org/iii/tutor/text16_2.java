package tw.org.iii.tutor;

public class text16_2 {
	//陣列版 擲骰子

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int p0, p1,p2,p3,p4,p5,p6;
//		p0=p1=p2=p3=p4=p5=p6=0;
		int [] p =new int [7];
		
		for(int i = 0 ; i<10000;i++) {
//				int point = (int)(Math.random()*6+1);//1~6
			int point = (int)(Math.random()*9+1); //加上賠率
			
			if (point >= 1 && point<=9) {
	//		System.out.printf("1點出現%d次\n",p1);
			//三維陣列
				p[point>=7?point-3:point]++;
			
			}else {
				p[0]++;
				//++在[]外面是因為 整個陣列去做++，[]裡放的是位置亦不能作加總
			}
			
		}
		//for-each
//		for(要尋訪的值變數宣告:陣列) {}
		for (int v  : p ) {
			System.out.println(v);			
		}
	}
}
