package tw.org.iii.tutor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//50~52讀byte陣列 54檔讀純文字
public class text53_fresh {

	public static void main(String[] args) {
		String data = "I want sleep now\n";
		
		try {
			//FileOutputStream 新建一個檔案會覆蓋先前檔案，若不要覆蓋 就傳遞true則會添加在檔案末尾
			FileOutputStream fout =
					new FileOutputStream("dir1/file2.txt",true);
			fout.write(data.getBytes());//字串變成byte陣列
			fout.close();
			System.out.println("ok");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
