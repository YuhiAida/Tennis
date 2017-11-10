package Tennis;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Tennis extends Applet{
	final int WIDTH = 700, HEIGHT = 500;
	public void init(){
		this.resize(WIDTH, HEIGHT);
    }

    public void paint(Graphics g){
    	g.setColor(Color.BLACK);
    	g.fillRect(0, 0, WIDTH, HEIGHT);
    }

    public void update(Graphics g){
    	paint(g);
    }
    
}
