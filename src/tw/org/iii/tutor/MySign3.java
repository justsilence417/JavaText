package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.myclasses.MyDrawer3;

public class MySign3 extends JFrame {
	private MyDrawer3 myDrawer;
	private JButton clear,undo,redo,chColor;
						//上一步,還原(上一次)相依於undo 線不能丟掉
	private JButton  saveObj,laodObj;
						private JButton saveJPEG;
	
	public MySign3() {
		super("簽名");
		myDrawer = new  MyDrawer3 ();
		
		setLayout(new BorderLayout());
		add(myDrawer,BorderLayout.CENTER);
		
		//將按鈕顯示到畫面上
		//clear、undo、redo、chColor、saveJPEG 等按鈕的功能與MyDrawer這個類別的繪圖相關
		//因此這些按鈕被放置在 MyDrawer 這個類別中。
		//saveObj 和 laodObj 按鈕的功能與對象的序列化與反序列化相關，因此放在MySign
		
		clear= new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
		saveObj = new JButton("Save Obj");
		laodObj = new JButton("Load Obj");
		saveJPEG = new JButton ("Save JPEG");
		
		JPanel top = new JPanel(new FlowLayout());
		//將按鈕新增道頁首
		top.add(clear);top.add(undo);top.add(redo);
		top.add(chColor);top.add(saveObj);top.add(laodObj);top.add(saveJPEG);
		
		add(top,BorderLayout.NORTH);
		
		//觸發按鈕功能
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		chColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor(); //在MySign裡的就不用加上myDrawer
			}
		});
		
		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//呼叫 ctrl按saveObjrct就會跳到其function
				saveObjrct();
			}
		});
		
		laodObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				laodObjext();
			}
		});
		
		saveJPEG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.saveJPEG();//在MyDrawer3裡所以要加上myDrawer來呼叫
			}
		});
		
		setSize(600,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	



	private void changeColor() {
//		Color newColor = JColorChooser.showDialog(
//			null, "Change Color", myDrawer.getColor());
//		if (newColor != null) {
//			myDrawer.setColor(newColor);
//		}
	}
	
	private void saveObjrct() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			myDrawer.saveLines(file.getAbsolutePath());		
		}
		
	}
	
	private void laodObjext() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			myDrawer.loadLines(file.getAbsolutePath());
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MySign3();
	}
}