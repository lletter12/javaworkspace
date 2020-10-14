package p2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new XXXX();
	}

}


class XXXX extends JFrame{
	
	JTextField tf1;
	JTextField tf2;
	
	
	public XXXX() {
		super("계산기????");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(100, 100, 400, 300);
		
		tf1 = new JTextField();
		tf1.setBounds(20, 20, 100, 20);
		this.add(tf1);

		tf2 = new JTextField();
		tf2.setBounds(160, 20, 100, 20);
		this.add(tf2);
		
		JButton btnPlus = new JButton("더하기");
		btnPlus.setBounds(20, 60, 300, 70);
		btnPlus.addActionListener(new PlusCommand(this));
		this.add(btnPlus);
		
		
		this.setVisible(true);
	}
}


class PlusCommand implements ActionListener{
	
	private XXXX xxx;

	public PlusCommand(XXXX xxx) {
		this.xxx = xxx;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String value1 = xxx.tf1.getText();
		String value2 = xxx.tf2.getText();
		
		int v1 = Integer.parseInt(value1);
		int v2 = Integer.parseInt(value2);
		
		int result = v1 + v2;
		
		JOptionPane.showMessageDialog(null, "합 : " + result);
		
		xxx.tf1.setText("");
		xxx.tf2.setText("");
		
		xxx.tf1.grabFocus();
		
	}
	
}










