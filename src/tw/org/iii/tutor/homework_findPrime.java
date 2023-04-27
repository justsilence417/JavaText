package tw.org.iii.tutor;

public class homework_findPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		從1~100 找出質數並圈起來
		//顯示1~100
		//判斷質數；除了1和該數自身外，無法被其他自然數整除的數
		//利用開根號可以更有效率找出質數，例如15開根號會介於3~4之間，那就從1~4去除以15，會發現15會被3整除，違反質數定義，因此15不是質數
		
		//一個二維整數陣列 poker，它有 10 列和 10 行，總共可以存放 100 個整數。每個元素都是一個整數，它們的預設值都是 0。
		int [][] poker = new int [10][10];
		
		//i是十位數，j是個位數
		for (int i = 0; i<10; i++) {
			for(int j = 0;j<10;j++) {
				poker[i][j] = i * 10 + j + 1; //poker 陣列就被初始化為 1 到 100 的整數序列。
				
			}
		}
		
		
		//執行上方for迴圈結果
		for (int i = 0; i<10; i++) {
			for(int j = 0;j<10;j++) {
				//poker[j][i])會無法10*10 會變成一行，要將ij互調 print不會換行 println會換行
				if(isPrime(poker[i][j])) {					
					System.out.print(String.format("\u001B[31m%3d",poker[i][j]));
					// String.format 方法是為了格式化輸出的字串，將顏色、空格等格式控制字元與輸出的資料合併成一個完整的字串，以便更好地呈現結果。
					//\u001B[31m 是控制字元，表示在終端機上以紅色顯示文字； %3d 則是格式化字串，表示輸出一個佔 3 個位置的十進位整數。
				} else {
					System.out.print(String.format("\u001B[30m%3d" ,poker[i][j]));
				}
				
			}
			System.out.println();
		}		
	}
	
	//判斷質數
	public static boolean isPrime(int n) {
		if(n<2) { //若n<2 則不是質數 因為要找其他質數所以要讓質數找2以上的
			return false;			
		}
		//從 2 開始遍歷到 n 的平方根，如果 n 可以被其中任何一個數整除，則 n 不是質數，返回 false。
		//舉例15=> 從2開始遍歷到 15 的平方根，即遍歷到 3，在這個範圍內可以發現 15 可以被 3 整除，因此 15 不是質數。
		for (int i =2;i<=Math.sqrt(n);i++) { 
			if(n%i == 0) {
				return false;
			}			
		}
		return true;
	}
}
