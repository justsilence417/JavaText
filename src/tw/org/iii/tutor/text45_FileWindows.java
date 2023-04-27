package tw.org.iii.tutor;

import java.io.File;

public class text45_FileWindows {
//	Windows會出現的錯誤
	public static void main(String[] args) {
		File file1 = new File("D:/text1");
		//實體檔案是否存在
		if(file1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX"); //將\\畫兩根就有存在檔案或者畫一條/
		}
	}

}
