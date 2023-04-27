package tw.org.iii.tutor;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class text32_FlowLayout extends JFrame implements ActionListener{
	private JButton b1,b2,b3;
	
	public text32_FlowLayout() {
	b1 =new JButton("B1");b2 =new JButton("B2");b3 =new JButton("B3");
	setLayout(new FlowLayout());
	add(b1);add(b2);add(b3); //新增按鈕
	
//	MyListener myListener = new MyListener();
	
	//委託類別做出來的同一個物件所做的事
//	b1.addActionListener(new MyListenter("b1"));
//	b1.addActionListener(this);
//	b2.addActionListener(this);
//	b3.addActionListener(this);

	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("B11");
		}
	});
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("B21");
		}
	});
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("B31");
		}
	});
	
	//設定視窗大小與關閉功能
	setSize(640,500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new text32_FlowLayout();
	}

	@Override //區分三個按鈕是不同的
	public void actionPerformed(ActionEvent e) {
		//源頭在e事件的來源=>e.getSource()
		if (e.getSource() == b1) {
			System.out.println("B1");			
		}else if(e.getSource() == b2) {
			System.out.println("B2");
		} else if(e.getSource() == b3) {
			System.out.println("B3");
		} 			
	}
}

//相同package存在相同類別名稱 因此會遇到類別名稱衝突到
class MyListener implements ActionListener{
	private String who;
	public MyListener(String who) {
		this.who = who;
	}
	
	@Override //專門在聽按鈕按下去要聽的事
	//ActionEvent這是動作事件 也是個物件 帶了一個e參數
	public void actionPerformed(ActionEvent e) {
	
		System.out.println("A"+e.getActionCommand());
	}
	
}