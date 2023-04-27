package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class text55 {

	public static void main(String[] args) {
	//讀圖檔
		try {
			long start = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("dir2/樹林2.jpg");
			FileInputStream fin = new FileInputStream("dir1/樹林.jpg");
		int b;
			while ((b = fin.read())!=-1) {
			fout.write(b);
		}
		fin.close();
		fout.flush();
		fout.close();
		System.out.println("finish:" + (System.currentTimeMillis()-start));
		//finish:22523
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}

