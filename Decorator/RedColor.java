package Decorator;
import java.awt.Color;

public class RedColor extends Decorator{

	

	@Override
	public void ChangeColor() {
		// TODO Auto-generated method stub
		lblTimer.setForeground(Color.red);
	}

}
