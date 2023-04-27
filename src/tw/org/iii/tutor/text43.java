package tw.org.iii.tutor;

import java.awt.FontFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class text43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new text441().m1();
		}catch(Exception e) {
			
		}
		
		//new Brad441().m1();
	
	}

}
//拋出例外要比父類別少且小
class text441{
	//4.等於第三步
	void m1() throws Exception{
		m2();
	}
	//3.呼叫的方法 有可能拋出例外 如果不處理 也要宣告
	void m2() throws Exception{
		m3(3);
	}
	//2.可能跳出例外就要宣告涵蓋會跳出的例外
	void m3(int a) throws FileNotFoundException,FontFormatException,IOException{
		if (a > 0) {
		throw new FontFormatException(null);
		}else {
		throw new FileNotFoundException();
		}
	}	
}

class text442 extends text441{
	//宣告拋出
	void m3(int b) {
		
	}
}
