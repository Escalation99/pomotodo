package State;

import Decorator.GreenColor;

public class RestState implements State{

	private static final State GreenColor = null;

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		context.setState(GreenColor);
	}

//	RestState restState =  new RestState();
//	restState.doAction(context);
//	
//	System.out.println(context.getState());
}
