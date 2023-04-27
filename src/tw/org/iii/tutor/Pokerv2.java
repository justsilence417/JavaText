package tw.org.iii.tutor;

import java.util.Arrays;

public class Pokerv2 {

	public static void main(String[] args) {
	
		
//		// 1. 洗牌
//		int count = 10;
//		int[] poker = new int[count];
//		boolean isRepeat;
//		int temp;
//		for (int i=0; i<poker.length; i++) {
//			do {
//				temp = (int)(Math.random()*count);
//				
//				// 檢查機制
//				isRepeat = false;
//				for (int j=0; j<i; j++) {
//					if (temp == poker[j]) {
//						// 重複了
//						isRepeat = true;
//						break;
//					}
//				}
//			}while (isRepeat);
//			
//			poker[i] = temp;
//		}
		
//		for (int v: poker) {
//			System.out.println(v);
//		}
		
//		System.out.println("---");
//		System.out.println(System.currentTimeMillis()-startTime);
		int[] poker = shuffle(52);
		//發牌
		//先宣告二維陣列 四個玩家 各加13張 一次就初始化
		int [][] players = new int[4][13];
		//用迴圈開始發牌
		for (int i = 0; i<poker.length;i++) { //不用for-each的原因需要i
//			players [家][張]  = poker[i];
			players [i%4][i/4]  = poker[i]; //發牌成功
			
		}
		
		//拿到card(商)除以13 餘0 =黑桃 的概念
		String[] suits = {"黑桃","紅心","方塊","梅花"};
							//各代表0,1,2,3
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ",
				"8 ","9 ","10","J","Q","K"}; //有空格是因為配合10有兩位數

		for (int [] player :players) { 
			
			Arrays.sort(player);//排序
//			reverseArrary(player); //排序數值
			int []cards = pairSort(player);
			for (int card :cards) {
				//方法一 println會直向往下 去掉ln會變成橫向
				System.out.print(suits[card/13]+values[card%13]+ " ");
				//方法二
//				System.out.printf("%s%s",suits[card/13],values[card%13]);//可取代上列字串陣列裡的空個
				
			}
			System.out.println();
			System.out.println("---印出花色與各家的牌---");			
			System.out.println(); //換列
		}
		
				
//		for (int [] player :players) { 
//			for (int card :player) {
//				System.out.println(card + " ");
//			}
//			System.out.println("---玩家分類---");
//			
//			System.out.println(); //換列
//		}
		
	
		
//		players[0] 第零個玩家做驗算
//		for (int v :players[0] ) { //左手邊是抓右手邊的型別(內容)
//			System.out.println(v);
//		} 
		
	}
	
	
	static int [] shuffle(int num){	//傳回陣列型別的東西
		// 1. 洗牌
		int count = num;
		int[] poker = new int[count];
		boolean isRepeat;
		int temp;
		for (int i=0; i<poker.length; i++) {
			do {
				temp = (int)(Math.random()*count);
				
				// 檢查機制
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (temp == poker[j]) {
						// 重複了
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			
			poker[i] = temp;
		}
	
		return poker;
	}
	//實現反轉 讓梅花最先出來且第一個數字是大的
	static void reverseArrary(int[] validData) {
		for(int i = 0; i < validData.length / 2; i++){
		    int temp = validData[i];
		    validData[i] = validData[validData.length - i - 1];
		    validData[validData.length - i - 1] = temp;
		}
		
	}
	
	//找出對子
	static int [] pairSort(int[] mycards) {
		//給臨時性空陣列擺放 new的東西
		int [] temp  = new int [mycards.length];
		int counter = 0;
//		等一下i=0的時候 專門挑這張牌mod13為0
//			i=1的時候 專門挑這張牌mod13為1
		
		for (int i =0;i<13;i++) { //找出A 2等
			for(int j=0;j<mycards.length;j++) {
				if (mycards[j] %13 ==i) {
					temp[counter++] = mycards[j]; //找到A存放位置等第二章相同的A進來到temp
				}
			}
		}
		return temp;
	}
}


