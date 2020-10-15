package command;

import java.awt.event.*;

import javax.swing.JOptionPane;

import Vo.StudentVo;
import commons.CommansData;
import commons.Frames;

public class AddCommand implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {

		String name = Frames.mainFrame.tfName.getText();
		
		if(name.equals("")) {
			JOptionPane.showMessageDialog(null, "이름 값이 비어 있습니다.");
			Frames.mainFrame.tfName.grabFocus();
			return;
		}
		
		
		String sex = "여";
		
		if(Frames.mainFrame.rbMan.isSelected()) {
			sex = "남";
		}
		
		int index = Frames.mainFrame.ComboArea.getSelectedIndex();
		String area = Frames.mainFrame.ComboArea.getItemAt(index);
		String tempScore = Frames.mainFrame.tfScore.getText();
		int score = Integer.parseInt(tempScore);
		
		StudentVo vo = new StudentVo(name, sex, area, score);
		
		CommansData.StudentList.add(vo);
		
		//...화면 리스트 출력...
		Frames.mainFrame.refreshList();
		
		//초기화
		Frames.mainFrame.tfName.setText("");
		Frames.mainFrame.rbMan.setSelected(true);
		Frames.mainFrame.ComboArea.setSelectedIndex(0);
		Frames.mainFrame.tfScore.setText("");
		
		Frames.mainFrame.tfName.grabFocus();
		
	}

}
