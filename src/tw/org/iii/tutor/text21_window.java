package tw.org.iii.tutor;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class text21_window extends JFrame{
//視窗程式 api>javax.swing>JFrame>Fields屬性
	//直接讓這隻程式附屬在有視窗功能的JFrame
	
	//想擁有三顆按鈕 宣告屬性在外面，因如果想在多個方法中使用相同的按鈕變數，最好將它們作為類的成員變數進行宣告
	//public text21_window() {} 內部宣告按鈕變數是可以的，但您必須確保變數在其他方法中也可以訪問。
	//b1,b2,b3在這句尚未初始化 若要初始化通常會在建構式裡
	private JButton b1,b2,b3; 
	
	public text21_window() { //建構式 一開始想看到的事在建構事處理
		super("我的視窗程式"); 	 //要放在第一句才會出現錯誤
		System.out.println("text21()"); //到此一遊，代表有在執行，雖然還未看到視窗
			//設定視窗相關條件=給初始化，給底下程式輸入點裡的物件，順序也有差
			b1 = new JButton("B1");
			b2 = new JButton("B2");
			b3 = new JButton("B3");
			
			//擁有按鈕 但呈現出來是另一件事，先擁有完成初始化再來做顯現
			setLayout(new FlowLayout()); //請到室內設計師
			add(b1);add(b2);add(b3); //將按鈕放到版面上
			
			
		
		//set開頭:設定 get開頭:取值			
			setSize(640,480); //預設看不到視窗，雖然已設置寬高在記憶體裡
			setVisible(true); //Visible意思是看的到或看不，true則彈出視窗 關閉視窗時紅色燈不會暗，還在記憶體中
			setDefaultCloseOperation(EXIT_ON_CLOSE); //設定預設關閉行為 為on close離開，這樣紅色按鈕會亮燈再關閉
			
			
	}
	
	//main方法通常是把一個物件叫出來，通常不超過十行
	public static void main(String[] args) {
		new text21_window(); //這句代表有物件，只想要有個物件存取因此不需要給變數
		

	}

}
