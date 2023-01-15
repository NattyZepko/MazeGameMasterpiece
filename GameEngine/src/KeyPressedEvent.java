
public class KeyPressedEvent implements GameInputEvent {

	public KeyPressedEvent(int keyCode) {
		this.keyCode = keyCode;
	}
	
	private int keyCode;

	public void process(GameInputEventProcessor aProcessor) {
		aProcessor.processKeyPressed(keyCode);
		
	}
}
