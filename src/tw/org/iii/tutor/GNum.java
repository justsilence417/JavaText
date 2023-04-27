package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


//猜數字遊戲
//數字與位置對了=>A 數字對位置錯=>B

//本身是視窗 同時也會聽
public class GNum extends JFrame implements ActionListener{
	private	JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	private int counter;
	
	//建構式
	public GNum() {
		super("猜數字遊戲"); 

		//讓上面宣告擁有的東西實體化
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout()); //一整個視窗
		JPanel top  = new JPanel(new BorderLayout());
		//最上面再切兩塊
		top.add(guess,BorderLayout.EAST); //將按鈕放在東邊 top只是虛擬東西
		top.add(input,BorderLayout.CENTER);
		
		//JFrame要add 將按鈕跟輸入框加到整個視窗
		add(top,BorderLayout.NORTH);
		add(log,BorderLayout.CENTER);
		
		
		//處理guess
		//新增一個動作請聽者 要當請聽者要考證照 證照為interface ActionListener
//		guess.addActionListener(new MyListenter());
		guess.addActionListener(this); //自己委託自己 所以this 出現ok2
		
		//視窗運作原理
		setSize(640,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		newGame();
	}
	
	public static void main(String[] args) {
		new GNum(); 
	}
	
	private void initView() {
		input.setFont(new Font(null,Font.BOLD,24));
		log.setFont(new Font(null, Font.BOLD|Font.ITALIC,20));
	}
	
	//開新局會做的事
	public void newGame () {
		answer = createAnswer(3); //設定三位數
		System.out.println("answer = " + answer);//偷看密碼
		log.setText("");//清除log
		input.setText("");//清除input
		counter = 0;//每次新局歸零
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("OK2");
//		String strInpit = input.getText(); //取得文字
//		log.setText(strInpit); //輸入整個字都換掉
		//strInpit輸入文字會依序呈現 不會後蓋前
//		log.append(strInpit + "\n");  
		String strInput = input.getText();
		if  (isValid(strInput)){
			counter++;
			//比對 檢查完得回來比對
			
			String result = checkAB(strInput);
	//		log.append(strInput +"=>" + result + "\n");
			log.append(String.format("%d.%s=>%s \n",counter,strInput,result ));
			input.setText("");
			
			if (result.equals("3A0B")) {
				JOptionPane.showMessageDialog(null, "恭喜答對");
			}else if (counter == 3) { //第3次設定輸了
				JOptionPane.showMessageDialog(null, "答錯:answer="+answer);
				newGame();
			}
		}
	}
	
		private boolean isValid(String g) {
				
				return true;
			}
			
		//將g檢查
	private String checkAB(String g) {
		//格式		
			int A,B ; A = B =0 ;
			for (int i = 0; i<g.length();i++) {
				//charAt方法用於返回指定索引處的字符。索引範圍從0到length()- 1。
				char c = g.charAt(i);
				if (c  == answer.charAt(i)) {
					A++;
				}else if (answer.indexOf(c)>=0) { //else if (answer.indexOf(c)!=-1)
					//indexOf() 方法是用來檢查使用者輸入的字串 g 是否存在於答案字串 answer 中，且不在與答案字串相同的位置。
					B++;
				}
			}
			
		return String.format("%dA%dB", A,B);
		// String.format() 方法是用來格式化輸出字串，它會將傳入的參數按照指定的格式轉換成字串，並將其返回。
		//讓它顯示幾A幾B
	}	
	
	private String createAnswer(int n) {
		//猜三個數字且不能重複 
	
			int num = 10;
			int [] poker = new int [num];
			for (int i = 0 ; i<poker.length;i++) poker[i]=i+1;
//			poker[i]=i+1 第幾個裝第幾張牌
			for (int i =num-1; i>0;i--) {
				//產生亂用Math.random()
				//rand代表index i+1 => 可會跟自己換
				int rand = (int)(Math.random()*(i+1));
				
				//poker[rand] <=> poker[i] 交換
				int temp = poker[rand];
				poker[rand] = poker[i];
				poker[i] =temp;
			}
			
			StringBuffer sb = new StringBuffer();
			for (int i=0; i<n; i++) {
				sb.append(poker[i]);
			}
			
			return sb.toString();
			
			
	}	

}

//我MyListenter 要實作(繼承)ActionListener
class MyListenter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
		
	}
	
}
