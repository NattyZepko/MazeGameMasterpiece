import java.util.HashMap;
import java.util.Map;

public class GameStateMachine {

	private GameState startState;
	
	private Map<String, GameState> states;
	
	GameFrameBuffer frameBuffer;
	
	public GameStateMachine(GameFrameBuffer aGameFrameBuffer) {

		frameBuffer = aGameFrameBuffer;
		
		states = new HashMap<String, GameState>();
		
		startState = new GameState();
		
		states.put("Skip", startState);
	}
	
	public void setStartState(GameState aState) {
		startState = aState;
	}
	
	public void installState(String name, GameState aState) {
		states.put(name, aState);
	}
	
	public GameState lookupState(String name) {
		return states.get(name);
	}
	
	public void gameLoop() {
		
		Object memento = null;
		GameState currentState = startState;

		while (true) {			
			String stateName = currentState.tick(memento, frameBuffer);

			memento = currentState.memento();
			
			currentState = lookupState(stateName);
			if (currentState == null) {
				currentState = lookupState("Skip");
				memento = stateName;
			}
		}
		
	}	
}
