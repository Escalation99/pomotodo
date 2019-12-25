package Memento;

import java.util.LinkedList;

public class MenuCommand {

	private LinkedList<MenuInterface> commandStack = new LinkedList<MenuInterface>();
	private LinkedList<MenuInterface> redoStack = new LinkedList<MenuInterface>();	  
	//tambahin keybind
	public void execute(MenuInterface command)
	{
		command.execute();
	      commandStack.addFirst(command);
	      redoStack.clear();
	}
	
	
	public void undo()
	{
		if (commandStack.isEmpty())
	         return;
	      MenuInterface command = commandStack.removeFirst();
	      command.undo();
	      redoStack.addFirst(command);
	}
	
	public void redo()
	{
		if (redoStack.isEmpty())
	         return;
	      MenuInterface command = redoStack.removeFirst();
	      command.redo();
	      commandStack.addFirst(command);
	}
		     
}
