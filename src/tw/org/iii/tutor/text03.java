package tw.org.iii.tutor;

import javax.swing.JOptionPane;

public class text03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//api>javax.swing>jOptionPane>showinputDiaog>有static不用new
		//api>java.util代表工具類別
		String strx = JOptionPane.showInputDialog("x = ?");
		System.out.println(strx);
		//在視窗輸入10 這10是字串
		
		//字串變整數
		String stry = JOptionPane.showInputDialog("x = ?");
		int y = Integer.parseInt(stry);
		int x = Integer.parseInt(strx);
		
		int r =x+y;
		//彈出視窗
		JOptionPane.showMessageDialog(null,String.format("%d+%d=%d",x,y,r));
		
	}

}
