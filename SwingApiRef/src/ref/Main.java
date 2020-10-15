package ref;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ApiTestFrame();
	}

}

class ApiTestFrame extends JFrame{
	
	public JLabel lb1;
	public JTextField tf1;
	public JPasswordField pf1;
	public JTextArea ta1;
	
	public JCheckBox cb1;
	public JCheckBox cb2;
	public JRadioButton rb1;
	public JRadioButton rb2;
	
	public JComboBox<String> combo1;
	public JList<String> list1;
	
	//public JFileChooser fc1;
		
	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	
	
	public ApiTestFrame() {
		super("API REF");
		
		MyFrames.apiTestFrame = this;
		
		this.setTitle("안녕하세요"); //제목바뀜...
		this.setLayout(null); //우선은 그냥 필요하다... 컨포넌트 좌표, 크기
		
		// EXIT_ON_CLOSE = 완전 종료  , DISPOSE_ON_CLOSE = 창 종료
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setBounds(100,100,800,600); //위치, 크기지정, 컨포넌트
		
		//컨포넌트 객체 생성 - 세팅(이벤트등록 포함) - 컨테이너(프레임) 등록
		
		lb1 = new JLabel("라벨");
		//lb1.setText("글자");
		lb1.setBounds(10,10,80,30);
		this.add(lb1);
		
		tf1 = new JTextField();
		tf1.setText("");
		//String str = tf1.getText();
		tf1.setBounds(110,10,80,30);
		this.add(tf1);
		
		pf1 = new JPasswordField();
		//String str = new String(pf1.getPassWord());
		pf1.setBounds(230,10,80,30);
		this.add(pf1);
		
		ta1 = new JTextArea();
		//ta1.setText("dddd");
		//String str = ta1.getText();
		//ta1.setEnabled(false); // 수정불가... 출력용...
		JScrollPane textJScrollPane = new JScrollPane(ta1);
		textJScrollPane.setBounds(10,50,300,100);
		this.add(textJScrollPane);
		
		cb1 = new JCheckBox();
		//boolean xx = cb1.isSelected(); 핵심 API
		//cb1.setSelected(true); 체크o. false 체크x
		cb1.setBounds(10,170,20,20);
		this.add(cb1);
		
		cb2 = new JCheckBox();
		cb2.setBounds(40,170,20,20);
		this.add(cb2);
		
		rb1 = new JRadioButton();
		// boolean xx = rb1.isSelected();
		//rb1.setSelected(true);
		rb1.setBounds(10,200,20,20);
		this.add(rb1);
		
		rb2 = new JRadioButton();
		rb2.setBounds(40,200,20,20);
		this.add(rb2);
		
		//라디오 버튼 그룹핑 필수...
		ButtonGroup rbGroup = new ButtonGroup();
		rbGroup.add(rb1);
		rbGroup.add(rb2);
		
		combo1 = new JComboBox<String>();
		combo1.addItem("서울");
		combo1.addItem("경기");
		combo1.addItem("인천");
		combo1.addItem("부산");
		combo1.setBounds(10,250,100,30);
		this.add(combo1);
		
		//int index = combo1.getSelectedIndex();
		//String str = combo1.getItemAt(index);
		
		//combo1.setSelectedIndex(2);
		combo1.removeAllItems();
		combo1.addItem("1");
		combo1.addItem("2");
		combo1.addItem("3");
		combo1.addItem("4");
		
		list1 = new JList<String>();
		String [] arr = {"사과", "배", "아이스크림", "아메키라노", "커피", "coffee"};
		list1.setListData(arr);
		
		JScrollPane listScrollPane = new JScrollPane(list1);
		listScrollPane.setBounds(400,50,200,100);
		this.add(listScrollPane);
		
		//int index = list1.getSelectedIndex();
		
		//fc1 = new JFileChooser();
		//fc1.setBounds(410,300,200,400);
		//this.add(fc1);
		
		btn1 = new JButton("Test1");
		btn1.setBounds(10,300,100,40);
		btn1.addActionListener(new Test1Command());
		this.add(btn1);
		
		btn2 = new JButton("Test2");
		btn2.setBounds(110,300,100,40);
		btn2.addActionListener(new Test2Command());
		this.add(btn2);
		
		btn3 = new JButton("Test3");
		btn3.setBounds(210,300,100,40);
		btn3.addActionListener(new Test3Command());
		this.add(btn3);
		
		
		
		this.setVisible(true); //화면 보이기, false 화면 숨김...
		
		
	}
	
}

class MyFrames{
	public static ApiTestFrame apiTestFrame;
}


class Test1Command implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "안녕하세요.\n 반갑습니다.");
		
		String value1 = JOptionPane.showInputDialog("입력 다이얼로그\n");
		
		int slectValue = JOptionPane.showConfirmDialog(null, "정말 삭제 하시겠습니까?");
			
	}
}

class Test2Command implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String tfValue = MyFrames.apiTestFrame.tf1.getText();
		String pwValue = new String (MyFrames.apiTestFrame.pf1.getPassword());
		String taValue = MyFrames.apiTestFrame.ta1.getText();
		
		MyFrames.apiTestFrame.lb1.setText(tfValue+pwValue+taValue);
		
		if(MyFrames.apiTestFrame.cb1.isSelected()) {
			JOptionPane.showMessageDialog(null, "첫번째. 체크. 선택됨");
		}
		
		if(MyFrames.apiTestFrame.rb1.isSelected()) {
			JOptionPane.showMessageDialog(null, "첫번째. 라디오. 선택됨");
		}
		
	}
}


class Test3Command implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int selectedIndex = MyFrames.apiTestFrame.combo1.getSelectedIndex();
		
		String value = MyFrames.apiTestFrame.combo1.getItemAt(selectedIndex);
		
		JOptionPane.showMessageDialog(null, value + "가 선택됨");
		
		int xxx = MyFrames.apiTestFrame.list1.getSelectedIndex();
		JOptionPane.showMessageDialog(null, xxx + "가 선택됨");
	}
	
}
