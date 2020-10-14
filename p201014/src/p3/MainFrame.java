package p3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{
	
	public JButton btnAddStudent;
	public JButton btnShowStudentInfo;
	public JButton btnDeleteStudent;
	public JButton btnClose;
	public JTextArea taStudentList;
	
	public MainFrame() {
		super("학생 관리 프로그램");
		this.setLayout(null);
		this.setBounds(100,100,420,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnAddStudent = new JButton("입력");
		btnAddStudent.setBounds(20,220,60,20);
		btnAddStudent.addActionListener(new AddStudentCommand());
		this.add(btnAddStudent);
		
		btnShowStudentInfo = new JButton("상세 정보");
		btnShowStudentInfo.setBounds(120,220,60,20);
		this.add(btnShowStudentInfo);
		
		btnDeleteStudent = new JButton("삭제");
		btnDeleteStudent.setBounds(220,220,60,20);
		this.add(btnDeleteStudent);
		
		btnClose = new JButton("종료");
		btnClose.setBounds(320,220,60,20);
		btnClose.addActionListener(new MainCloseCommand());
		this.add(btnClose);
		
		taStudentList = new JTextArea();
		Color c = new Color(0,0,0);
		taStudentList.setBounds(10,20,380,150);
		taStudentList.setEnabled(false);
		this.add(taStudentList);
		
		
		this.setVisible(true);
	}
	
	public void refreshStudentList() {
			
			int count = 1;
			
			String text = "";
			
			for(StudentVo vo : MyFrames.studentlist) {
	
				text += count;
				text += ".";
				text += vo.getName();
				text += "\n";
				
				count++;
			}
			
			this.taStudentList.setText(text);
			
	}
}

class MainCloseCommand implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		MyFrames.mainFrame.dispose();
		
	}
	

}

class AddStudentCommand implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		new AddFrame();
		
	}
	
}



