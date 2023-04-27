package tw.org.iii.tutor;

import java.io.File;

public class text49 {

	public static void main(String[] args) {
		File dir1 = new File("dir1");
		if (dir1.exists()&& dir1.isDirectory()) {
			//利用listFiles將dir1裡的文件夾中所有文件和子文件夾 並處存在files中
			File[] files = dir1.listFiles();
			//印出名稱、大小和類型
			for (File file : files) {
//				System.out.println(file.getName()); //撈出底下得檔名
//				System.out.println(file.getAbsolutePath()); //撈出底下檔名的絕對路徑
				String fname = file.getName();
				long size = file.length(); //文件大小
				String type = file.isDirectory()?"dir":"file"; //isDirectory判別文件是"dir"（顯示目錄）或"file"（顯示文件）
				System.out.println(fname+":" +size+":"+type); //印出檔名 大小 類型
			}
		}

	}

}
