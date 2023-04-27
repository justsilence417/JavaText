package tw.org.iii.tutor;

import javax.swing.JFrame;

public class text21_window2 {
	
	public static void main(String [] ags) {
		JFrame f1 = new JFrame("F1");
		f1.setVisible(true);
		f1.setSize(200,200);
//		setDefaultCloseOperation(EXIT_ON_CLOSE); 要在建構式裡 
//		或改寫成 
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //就可以在這裡面執行關閉
		
		
		JFrame f2 = new JFrame("F2");
		f2.setVisible(true);
		f2.setSize(400,200);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}


}
