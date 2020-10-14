package p1;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new XXXX();
	}

}

class XXXX extends JFrame{
	
	public XXXX() {
		super("안녕하세요"); // 타이틀... 세팅...
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(null);
		
		this.setBounds(100, 100, 600, 400);
		
		//버튼 생성
		JButton btn1 = new JButton("하하하");
		btn1.setBounds(50, 20, 100, 50);
		this.add(btn1);
		
		//텍스트 박스 생성 및 세팅
		JTextField tf1 = new JTextField();
		tf1.setBounds(50, 100, 100 , 100);
		this.add(tf1);
		
		JLabel lb1 = new JLabel();
		lb1.setText("아이디 : ");
		lb1.setBounds(10,100,80,50);
		this.add(lb1);
		
		//패스워드
		JPasswordField pf1 = new JPasswordField();
		pf1.setBounds(50,200,100,50);		
		this.add(pf1);
		
		//콤보박스
		JComboBox<String> cb1 = new JComboBox<String>();
		cb1.addItem("안녕하세요");
		cb1.addItem("안녕하세요");
		cb1.addItem("안녕하세요");
		cb1.setBounds(50,300,100,50);
		this.add(cb1);
		
		//텍스트 공간
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(200,20,100,150);
		this.add(ta1);
		
		
		
		
		this.setVisible(true);
	}
	
}
