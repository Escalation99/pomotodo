package Memento;

import java.util.List;

public class Memento 
{
	private List<MenuCommand> state;

	public Memento(List<MenuCommand> state) {
		super();
		this.state = state;
	}

	public List<MenuCommand> getState() {
		return state;
	}	
	
}
