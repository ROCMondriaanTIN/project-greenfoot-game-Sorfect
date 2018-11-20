
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                setLocation(60,750);
                return;
            }
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("w") && (onGround() == true)
        || Greenfoot.isKeyDown("up") && (onGround() == true)
        || Greenfoot.isKeyDown("space") && (onGround() == true)) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            velocityX = 5;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
    boolean onGround()
   {
       Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Tile.class);
       return under != null;
    }
}
