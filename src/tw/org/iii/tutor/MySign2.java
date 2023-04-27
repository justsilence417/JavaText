package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.myclasses.MyDrawer2;
import tw.org.iii.myclasses.MyDrawer3;

public class MySign2 extends JFrame {
	private MyDrawer2 myDrawer;
	private JButton clear,undo,redo,chColor;
						//上一步,還原(上一次)相依於undo 線不能丟掉
	private JButton  saveObj,laodObj;
	
	public MySign2() {
		super("簽名");
		myDrawer = new  MyDrawer2 ();
		
		setLayout(new BorderLayout());
		add(myDrawer,BorderLayout.CENTER);
		
		//將按鈕顯示到畫面上
		clear= new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		chColor = new JButton("Color");
//		saveObj = new JButton("Save Obj");
//		laodObj = new JButton("Load Obj");
		
		JPanel top = new JPanel(new FlowLayout());
		//將按鈕新增道頁首
		top.add(clear);top.add(undo);top.add(redo);
		top.add(chColor);
//		top.add(saveObj);top.add(laodObj);
		
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
				changeColor();
			}
		});
		
//		saveObj.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//呼叫 ctrl按saveObjrct就會跳到其function
//				saveObjrct();
//			}
//		});
//		
//		laodObj.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				laodObjext();
//			}
//		});
		
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
//	protected void laodObjext() {
//		// TODO Auto-generated method stub
//		myDrawer.loadLines("dir1/lines");
//	}
//
//	protected void saveObjrct() {
//		// TODO Auto-generated method stub
//		//核心功能
//		myDrawer.saveLines("dir1/lines");
//	}

	private void changeColor() {
		Color newColor = JColorChooser.showDialog(
			null, "Change Color", myDrawer.getColor());
		if (newColor != null) {
			myDrawer.setColor(newColor);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MySign2();
	}
}