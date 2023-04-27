package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class text58_BufferedReader {
//其中有一個好用的ReaderLine功能 就不用用byte Line速度更快
	public static void main(String[] args) {
		//串接
		try {
			FileInputStream fin = new FileInputStream("dir1/Fstdata.csv");
			InputStreamReader ir = new InputStreamReader(fin);
			BufferedReader br =new BufferedReader(ir); //故意接了三個
			
			String line;
			while ((line = br.readLine() )!=null){
				//line等於資料中橫向資料
				
				//切出字串陣列 直向切
				String[] row = line.split(",");
				System.out.println(row[1]+":"+row[5]+":"+row[7]);	
			}
			
			//找其中一個關閉
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
