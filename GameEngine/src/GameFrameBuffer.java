import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class GameFrameBuffer {

	BufferedImage image;
    BufferStrategy frame;    
	
	public GameFrameBuffer(Canvas aCanvas) {
		 
		frame = aCanvas.getBufferStrategy();    

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();
		GraphicsConfiguration gc = gd.getDefaultConfiguration();
		
		image = gc.createCompatibleImage(aCanvas.getWidth(), aCanvas.getHeight());

	}
	
	public void clear(Graphics2D g2d) {
	    g2d.setColor( Color.BLACK );
	    g2d.fillRect( 0, 0, image.getWidth(), image.getHeight() );		
	}
	
	public int getWidth() { return image.getWidth(); }

	public int getHeight() { return image.getHeight(); }

	public Graphics2D graphics() {
		return image.createGraphics();
	}
	
	public void show() {
		Graphics graphics = frame.getDrawGraphics();
	    graphics.drawImage( image, 0, 0, null );
	    if( !frame.contentsLost() )
	      frame.show();		
	}
	
}
