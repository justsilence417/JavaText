package tw.org.iii.tutor;

public class Pokerv1 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
//		System.out.println(startTime);
		//用到一維跟二維陣列
		//1.洗牌
		//整數陣列
		//index代表0~51 值代表所在的值
		int count = 52;
		int [] poker = new int [count];
		for (int i = 0 ; i<poker.length;i++) {
//			poker [i] = (int)(Math.random()*count);//會有重複的
			int temp = (int)(Math.random()*count);
		//檢查機制
			boolean isRepeat = false; //在將布林值預設會重複是錯的
			for (int j =0;j<i;j++) {
				if (temp == poker [j]) {
					//跑到這代表重複了
					isRepeat = true; //先預設重複的事會發生的
					break;
				}
			}
			
			if (!isRepeat) {
				poker[i] = temp;
			}else {
				i--; //會有i++ 就先-掉 但不建議此做法，會變成最後一張牌還要跑迴圈
				
			}
		}
			for (int v :poker) {
				System.out.println(v); 
			}
			System.out.println("-------"); 
			System.out.println(System.currentTimeMillis()-startTime);
			
		}

	}


