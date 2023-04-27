package tw.org.iii.tutor;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.org.iii.myclasses.Student;
//進行物件序列化
public class text59_ObjectInOutput {

	public static void main(String[] args) {
		
		Student s1 = new Student("Amy",52,43,64);
		System.out.println(s1.sum()+":"+s1.avg()); //輸出總成績與平均
		
		Student s2 = new Student("Tom",60,53,64);
		System.out.println(s2.sum()+":"+s2.avg());
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/s1");
			//將物件輸出
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(s1);//將s1物件輸出
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
