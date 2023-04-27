package tw.org.iii.tutor;

public class text14_九九乘法表 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ROWS= 2;
		//只能給一次變數
		//兩列
		final int START = 2;
		//其始為2
		final int COLS = 3;
		for (int k = 0;k<ROWS;k++) {
			//最後一個才寫代表九九乘法表印出兩列
			for(int j = 0 ; j<=9 ;j++) {
				//j影響的是1
				for(int i = START;i<(START*COLS);i++) {
					//這迴圈先寫
					//i影響的是開頭
					int newi = i+k*COLS;
					int r =newi*j;
				System.out.printf("%d x %d = %d\t",newi,j,r);
				//這句最先打出觀念再做修正
				//\t跳脫字元table鍵
				
				}
				System.out.println();
			}
			System.out.println("-------");
		}
	}

}
