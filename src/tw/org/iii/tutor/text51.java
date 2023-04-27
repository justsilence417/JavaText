package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class text51 {
	public static void main(String[] args) {
		//讀出file1資料讀出來
		try {
			//開
			FileInputStream fin = new FileInputStream("dir1/file1.txt");
			byte [] buf = new byte[3]; //buf的大小自訂
			int len;
			//讀取多少長度
			while ((len = fin.read(buf))!=-1){
				System.out.print(new String (buf,0,len)); 
			}			
			
			//關
			fin.close();
		} catch (FileNotFoundException e) { //FileNotFoundException是IOException的子類別 順序會有差
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
