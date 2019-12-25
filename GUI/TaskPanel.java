package GUI;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.TaskButton.*;

public class TaskPanel{	
	private TaskButton addBtn = new TaskButton_Add();

	private JPanel panel =  new JPanel();
	
	public TaskPanel(){}
	
	public JPanel createNewTask (JTextField task, JButton btn, int spacing){
		panel.add (task);
		panel.add (Box.createHorizontalStrut (spacing));
		panel.add (btn);
		panel.add (Box.createHorizontalStrut (20));
		
		return panel;
	}

	public JPanel getPanel(){
		return panel;
	}

	public JButton getAddBtn(){
		return addBtn.getBtn();
	}
	public int getChildNumber(){
		return addBtn.getOwner();
	}


	
}