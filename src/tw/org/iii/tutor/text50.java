package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class text50 {
	public static void main(String[] args) {
		//讀出file1資料讀出來
		try {
			//會出現Unhandled exception type FileNotFoundException 錯誤=>沒有處理FileNotFoundException
			//開
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			//讀取資料
			int c = fin.read();
//			System.out.println(c);//72
			
			//讀取檔案內容
			while (c!=-1) { //int c ; while ((c = fin.read())!=-1){}
				c = fin.read();
				System.out.print((char)c); //char強制執行 記住不要換行要把ln刪掉
			}			
			
			//關
			fin.close();
			System.out.println("ok"); 
		} catch (FileNotFoundException e) { //FileNotFoundException是IOException的子類別 順序會有差
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);

		}
		
		
	}

}
