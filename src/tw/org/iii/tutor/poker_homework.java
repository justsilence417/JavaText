package tw.org.iii.tutor;

public class poker_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//用到一維跟二維陣列
		//整數陣列
		//index代表0~51 值代表所在的值
//		static int [] shuffle(int num){	
//			int count = 52;
//			int [] poker = new int [count];
//			for (int i = 0 ; i<count;i++) {
////				洗牌51次即完成
////				隨取0~51與陣列最後位置交換位置51
////				隨取0~50與陣列最後位置交換位置50
//				poker[i]=i+1;
//									
//		}
		
		//老師課堂解答
		int [] poker = new int [52];
		for (int i = 0 ; i<poker.length;i++) poker[i]=i+1;
//		poker[i]=i+1 第幾個裝第幾張牌
		for (int i =51; i>0;i--) {
			//產生亂用Math.random()
			//rand代表index i+1 => 可會跟自己換
			int rand = (int)(Math.random()*(i+1));
			
			//poker[rand] <=> poker[i] 交換
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] =temp;
		}
		
		for (int v : poker) {
			System.out.println(v);
		}
		
		}
		
		
		
	}



