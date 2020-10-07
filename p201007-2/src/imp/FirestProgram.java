package imp;

import java.awt.event.*;


import javax.swing.*;

public class FirestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();		
		
		
	}
}
class MainFrame extends JFrame{
	
	public MainFrame() {
		super("안녕하세요");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(100, 100, 400, 300);
		this.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 10, 50, 30);
		this.add(btn1);
		ActionListener p1 = new Process1();
		btn1.addActionListener(p1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(70, 10, 50, 30);
		this.add(btn2);
		ActionListener p2 = new process2();
		btn2.addActionListener(p2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(140, 10, 50, 30);
		this.add(btn3);
		btn3.addActionListener((e)->{
			JOptionPane.showInputDialog("3입니다");
		});
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(200, 10, 50, 30);
		this.add(btn4);
		btn4.addActionListener((e)->{
			int sum = 0;
			for(int x =2 ; x <= 9 ; x++) {
				sum += x;
			}
			JOptionPane.showMessageDialog(null, "1~9 합 : " + sum);
		});
		
		this.setVisible(true);
		
		
	}
	
}

class Process1 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "1입니다");
	}
}

class process2 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "2입니다");
	}
	
}

