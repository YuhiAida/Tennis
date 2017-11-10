package tennis;

import java.awt.Graphics;

/**
 *
 * @author YuhiA
 */
public interface Paddle {
    public void draw(Graphics g);
    public void move();
    public int getY();
}
