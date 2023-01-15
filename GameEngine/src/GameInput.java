import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Queue;

public class GameInput implements KeyListener {
        
  private Queue<GameInputEvent> events;
  
  private static final int  QUEUE_SIZE = 16; // maximal number of input events to remember.
  
  private static GameInput theGameInput = new GameInput();
  
  public static GameInput instance() {
	  return theGameInput;
  }
  
  public GameInput() {
	  
	events = new LinkedList<GameInputEvent>();
	
  }
        
  public synchronized void processInput(GameInputEventProcessor aProcessor) {
	  while (!events.isEmpty()) {
		  GameInputEvent anEvent = events.remove();
		  anEvent.process(aProcessor);
	  }
  }
        
        
  public synchronized void keyPressed( KeyEvent e ) {
    add(new KeyPressedEvent(e.getKeyCode()));
  }

  public synchronized void keyReleased( KeyEvent e ) {
	add(new KeyReleasedEvent(e.getKeyCode()));
  }

  public void keyTyped( KeyEvent e ) {
    // Not needed
  }
  
  private void add(GameInputEvent anEvent) {
	  if (events.size() == QUEUE_SIZE)
		  events.remove();
	  events.add(anEvent);
  }
}