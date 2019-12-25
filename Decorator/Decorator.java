package Decorator;

public abstract class Decorator extends LabelTimer{

	protected LabelTimer lblTimer;


	public LabelTimer getLblTimer() {
		return lblTimer;
	}
	
	public abstract void ChangeColor();
	
}
