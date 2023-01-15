
public class KeyReleasedEvent implements GameInputEvent {
	
	public KeyReleasedEvent(int keyCode) {
		this.keyCode = keyCode;
	}
	
	private int keyCode;

	public void process(GameInputEventProcessor aProcessor) {
		aProcessor.processKeyReleased(keyCode);
		
	}

}
