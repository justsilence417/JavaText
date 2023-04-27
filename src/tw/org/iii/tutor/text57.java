package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class text57 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
	File source = new File("dir1/樹林.jpg");
	
	File target = new File("dir1/樹林3.jpg"); //新檔
	try {
	FileInputStream fin = new FileInputStream(source);
	byte [] buf = new byte[(int)source.length()]; //這的buf大小為檔案大小
	fin.read(buf);
	fin.close();
	
	FileOutputStream fout = new FileOutputStream(target);
	fout.write(buf);
	fout.flush(); 
	fout.close();
	System.out.println("finish3:" + (System.currentTimeMillis()-start));
	//finish3:13
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}

