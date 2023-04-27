package tw.org.iii.tutor;

import java.io.File;
import java.io.IOException;

public class text48_mkdirs {
	public static void main(String[] args) {
	
		//打算在dir1底下建一個子目錄
		File dir11 = new File ("dir1/dir11") ;
		if (!dir11.exists()) {
			dir11.mkdir();				
			//在dir1按下右鍵Refresh就可以新增dir11
		}
		System.out.println("----");
		File dir2345 = new File("dir2/dir3/dir4/dir5");
		dir2345.mkdirs();
		System.out.println("----");
		File f1 = new File("dir1/file1.txt");
		try {
			f1.createNewFile();//沒有try包之前出現Unhandled exception type IOException 拋出例外
			System.out.println("ok"); //創建成功
		} catch (IOException e) {
			System.out.println(e);
		} 
		
	}

}
