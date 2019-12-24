package GUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;

import GUI.TaskButton.TaskButton;
import GUI.TaskButton.TaskButton_Add;

public class Task{
	private TaskButton addBtn = new TaskButton_Add();
	
	JTextField taskName = new JTextField (30);
	
	private int childNumber = 0;
	private int spacing = 0;

	public Task(){
		taskName.setFont (new Font ("calibri", Font.PLAIN, 20));	
	}

	public int getChildNumber(){
		return childNumber;
	}
	public JTextField getTaskName(){
		return taskName;
	}
	public void setTaskName (JTextField taskName){
		this.taskName = taskName;
	}
	public void setChildNumber (int childNumber){
		this.childNumber = childNumber;
	}
	public int getSpacing(){
		return spacing;
	}
	public void setSpacing (int spacing){
		this.spacing = spacing;
	}

	public JButton getAddBtn() {
		return addBtn.getBtn();
	}
	
	
}