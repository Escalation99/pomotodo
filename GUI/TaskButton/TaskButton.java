package GUI.TaskButton;

import java.awt.Font;

import javax.swing.JButton;

public abstract class TaskButton{
	JButton btn = new JButton();
	
	public TaskButton (){
		btn.setFont (new Font ("calibri", Font.BOLD, 18));
	}
	
	public abstract void btnListener();
	public abstract void enable();
	public abstract void disable();
	public abstract void visibility();
	public abstract int getOwner();

	public JButton getBtn(){
		return btn;
	}
	
}