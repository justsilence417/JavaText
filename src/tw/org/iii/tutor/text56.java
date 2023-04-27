package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class text56 {

	public static void main(String[] args) {
	//讀圖檔
		//檔案大讀取速度會越慢
		try {
			long start = System.currentTimeMillis();//計算開始時間
			FileOutputStream fout = new FileOutputStream("dir2/樹林2.jpg");
			FileInputStream fin = new FileInputStream("dir1/樹林.jpg");
		int len;
		byte [] buf = new byte[4*1024]; //[4*1024]依需求調整
			while ((len = fin.read(buf))!=-1) {
			fout.write(buf,0,len);
		}
		fin.close();
		fout.flush(); //建議加這個在close之前 會清空緩存
		fout.close();
		//結束時間減掉開始時間 為執行這段的期間
		System.out.println("finish2:" + (System.currentTimeMillis()-start));

	}catch(Exception e) {
		System.out.println(e);
	}
	}
}

