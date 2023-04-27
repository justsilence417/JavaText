package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class text61 {
	public static void main(String[] args) {
		text613 obj = new text613();
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("dir1/brad"));
			oout.writeObject(obj);
			oout.flush(); oout.close();
			System.out.println("----上是序列化-下是解(反)序列化----");
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("dir1/brad"));
			oin.readObject();
			oin.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

//若不寫implements Serializable 會出現沒有序列化的錯誤
//寫在哪一代，底下的孩子就會跟著序列化出去
//序列化出去的就不用再初始化
class text611 {
	text611(){System.out.println("text611()");}
}
class text612 extends text611 implements Serializable  {
	text612(){System.out.println("text612()");}
}
class text613 extends text612 {
	text613(){System.out.println("text613()");}
}