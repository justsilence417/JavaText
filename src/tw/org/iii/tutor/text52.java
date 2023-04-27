package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class text52 {
	public static void main(String[] args) {
		//讀出file1資料讀出來
		try {
			//開
			File source = new File("dir1/file1.txt");
			FileInputStream fin = new FileInputStream(source);
			//將陣列長度設為檔案長度 用int強制轉型解決亂碼問題 
			//只用byte會有編碼問題
			byte [] buf = new byte[(int)source.length()]; 
			fin.read(buf);
			System.out.println(new String (buf));	
			//關
			fin.close();
		} catch (FileNotFoundException e) { //FileNotFoundException是IOException的子類別 順序會有差
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
