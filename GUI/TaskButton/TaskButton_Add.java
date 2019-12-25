package GUI.TaskButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import GUI.*;

public class TaskButton_Add extends TaskButton{
	private TaskPanel panel = new TaskPanel();
	private Task newTask;
	
	public TaskButton_Add(){}

	@Override
	public void btnListener(){
		super.btn.addActionListener (new ActionListener(){
			@Override
			public void actionPerformed (ActionEvent arg0){
				if (getOwner() == 1){ // Task Level 1
					newTask = new Task1();
					panel.createNewTask (newTask.getTaskName(), btn, newTask.getSpacing());					
				}else if (getOwner() == 2){ // Task Level 2
					newTask = new Task2();
					panel.createNewTask (newTask.getTaskName(), btn, newTask.getSpacing());				
				}else if (getOwner() == 3){ // Task Level 3
					newTask = new Task3();
					panel.createNewTask (newTask.getTaskName(), btn, newTask.getSpacing());				
				}
			}
		});
	}

	@Override
	public void enable(){
		super.btn.enable();
	}
	@Override
	public void disable(){
		super.btn.disable();
	}
	@Override
	public void visibility(){
		if (super.btn.isVisible()){
			super.btn.setVisible(false);
		}
		
		super.btn.setVisible (true);
	}
	@Override
	public int getOwner(){
		int childNumber = panel.getChildNumber();
		return childNumber;
	}
	
}