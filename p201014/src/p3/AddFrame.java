package p3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddFrame extends JFrame{
	
	public JLabel lbName;
	public JTextField tfName;
	public JLabel lbNumber;
	public JTextField tfNumber;
	public JLabel lbScore;
	public JTextField tfScore;
	public JButton btnConfirm;
	public JButton btnCancel;
	
	
	
	public AddFrame(){
		super("학생 정보 입력");
		
		MyFrames.addFrame = this;
		
		this.setLayout(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setBounds(150,150,300,200);
		
		lbName = new JLabel("이름 : ");
		lbName.setBounds(10,10,100,20);
		this.add(lbName);
		
		tfName = new JTextField();
		tfName.setBounds(120,10,150,20);
		this.add(tfName);
		
		lbNumber = new JLabel("전화번호 : ");
		lbNumber.setBounds(10,40,100,20);
		this.add(lbNumber);
		
		tfNumber = new JTextField();
		tfNumber.setBounds(120,40,150,20);
		this.add(tfNumber);
		
		lbScore = new JLabel("점수 : ");
		lbScore.setBounds(10,70,100,20);
		this.add(lbScore);
		
		tfScore = new JTextField();
		tfScore.setBounds(120,70,150,20);
		this.add(tfScore);
		
		btnConfirm = new JButton("확인");
		btnConfirm.setBounds(10,110,120,30);
		btnConfirm.addActionListener(new AddFrameConfirmCommand());
		this.add(btnConfirm);
		
		btnCancel = new JButton("취소");
		btnCancel.setBounds(140,110,120,30);
		btnCancel.addActionListener((e)-> {MyFrames.addFrame.dispose();
		});	
		this.add(btnCancel);
		
		
		this.setVisible(true);	
		
		}
	
	
	
}

class AddFrameConfirmCommand implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name = MyFrames.addFrame.tfName.getText();
		String number = MyFrames.addFrame.tfNumber.getText();
		String tempScore = MyFrames.addFrame.tfScore.getText();
		
		StudentVo vo = new StudentVo(name, number, Integer.parseInt(tempScore));
		
		MyFrames.studentlist.add(vo);
		
		MyFrames.mainFrame.refreshStudentList();
		
		MyFrames.addFrame.dispose();
		
	}
	
}
