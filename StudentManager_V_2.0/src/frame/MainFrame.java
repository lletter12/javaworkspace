package frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

import Vo.StudentVo;
import command.AddCommand;
import commons.CommansData;
import commons.FileSave;
import commons.Frames;

public class MainFrame extends JFrame{

	//리스트 왼쪽
	public JList<String> ltStudent;
	
	//학생 추가 입력 관련
	public JLabel lbName;
	public JTextField tfName;
	public JLabel lbsexual;
	public JLabel lbMan;
	public JLabel lbWoman;
	public JRadioButton rbMan;
	public JRadioButton rbWoman;
	public JLabel lbArea;
	public JComboBox<String> ComboArea;
	public JLabel lbScore;
	public JTextField tfScore;
	public JButton btnAdd;
	
	//상세정보
	public JLabel lbInfo;
	public JTextArea taInfo;
	
	//하단버튼
	public JButton btnDelete;
	public JButton btnUpdate;
	
	
	public MainFrame() {
		super("학생관리 프로그램 ver 2.0");
		
		Frames.mainFrame = this;
		
		this.addWindowListener(new ClosingCommand());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(100,100,600,400);
		
		Font font = new Font("돋움", Font.BOLD, 12);
		
		//리스트 부분
		ltStudent = new JList<String>();
		JScrollPane listPane = new JScrollPane(ltStudent);
		listPane.setBounds(50,50,180,140);
		this.add(listPane);
		
		//학생 추가 UI
		lbName = new JLabel("이름 :");
		lbName.setBounds(310,50,50,20);
		lbName.setFont(font);
		this.add(lbName);
		
		tfName = new JTextField();
		tfName.setBounds(370,50,150,20);
		this.add(tfName);
		
		lbsexual = new JLabel("성별 :");
		lbsexual.setBounds(310,80,36,20);
		lbsexual.setFont(font);
		this.add(lbsexual);
		
		lbMan = new JLabel("남");
		lbMan.setBounds(375,80,20,20);
		lbMan.setFont(font);
		this.add(lbMan);
		
		rbMan = new JRadioButton();
		rbMan.setBounds(395,80,20,20);
		this.add(rbMan);
		
		lbWoman = new JLabel("여");
		lbWoman.setBounds(460,80,20,20);
		lbWoman.setFont(font);
		this.add(lbWoman);
		
		
		rbWoman = new JRadioButton();
		rbWoman.setBounds(480,80,20,20);
		this.add(rbWoman);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rbMan);
		group.add(rbWoman);
		
		lbArea = new JLabel("사는 곳 :");
		lbArea.setBounds(310,110,70,20);
		lbArea.setFont(font);
		this.add(lbArea);
		
		ComboArea = new JComboBox<String>();
		ComboArea.addItem("서울");
		ComboArea.addItem("대전");
		ComboArea.addItem("대구");
		ComboArea.addItem("부산");
		ComboArea.setBounds(400,110,100,20);
		ComboArea.setFont(font);
		this.add(ComboArea);
		
		lbScore = new JLabel("점수 :");
		lbScore.setBounds(310,140,50,20);
		lbScore.setFont(font);
		this.add(lbScore);
		
		tfScore = new JTextField();
		tfScore.setBounds(370,140,70,20);
		this.add(tfScore);
		
		btnAdd = new JButton("입력 :");
		btnAdd.setBounds(310,170,210,20);
		btnAdd.setFont(font);
		btnAdd.addActionListener(new AddCommand()); //리스너 연결
		this.add(btnAdd);
		
		//상세정보
		lbInfo = new JLabel("학생 정보 분석 :");
		lbInfo.setBounds(10,200,100,20);
		lbInfo.setFont(font);
		this.add(lbInfo);
		
		taInfo = new JTextArea();
		taInfo.setEnabled(false);
		JScrollPane infoscJScrollPane = new JScrollPane(taInfo);
		infoscJScrollPane.setBounds(10,230,565,70);
		this.add(infoscJScrollPane);
		
		btnDelete = new JButton("삭 제");
		btnDelete.setBounds(10,320,80,30);
		btnDelete.setFont(font);
		this.add(btnDelete);
		
		btnUpdate = new JButton("수 정");
		btnUpdate.setBounds(110,320,80,30);
		btnUpdate.setFont(font);
		this.add(btnUpdate);
		
		//FileSave.loadFile();
		//refreshList();
		
		
		this.setVisible(true);
	}
	
	public void refreshList() {
		String [] datas = new String[CommansData.StudentList.size()];
	
		int count = 0;
		
		for(StudentVo Vo : CommansData.StudentList) {
			String value = count + ":" + Vo.getName();
			datas[count] = value;
			count++;
					
		}
		
		this.ltStudent.setListData(datas);
	}
	
}


class ClosingCommand extends WindowAdapter{
	
	public void windowOpened(WindowEvent e) {
		FileSave.loadFile();
		Frames.mainFrame.refreshList();
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
			FileSave.saveFile();
	}
	
	
}
