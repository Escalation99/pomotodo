package State;

import Decorator.RedColor;

public class WorkState implements State{

	private static final State RedColor = null;

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		context.setState(RedColor);
	}

//	WorkState workState =  new WorkState();
//	workState.doAction(context);
//	
//	System.out.println(context.getState());
//	
//	
}
