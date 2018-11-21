
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Enemy extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;

    public Enemy() {
        super();
        setImage("pokerMad.png");
        getImage().mirrorHorizontally();
        walkRange = 140;
        firstAct = true;
        speed = 1;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = true;
            xMin = x - walkRange / -60;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -2;
            x = xMax;
            getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -2;
            x = xMin;
            getImage().mirrorHorizontally();
        }
    }
}
