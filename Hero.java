
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    protected static int x;
    protected static int y;
    LevenHudExtra levenHud;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.8;
        drag = 0.8;
        setImage("p1.png");
    }
    
    @Override
    public void act() {
        if(levenHud== null)
        {
            levenHud = new LevenHudExtra();
            getWorld().addObject(levenHud, 100,100);
        }
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        
        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                levenHud.verliesLeven();
                setLocation(x,y);
                return;
            }
        }
         for (Actor Fly : getIntersectingObjects(Fly.class)) {
            if (Fly != null) {
                levenHud.verliesLeven();
                setLocation(x,y);
                return;
            }
        }
         for (Actor Gevaar : getIntersectingObjects(Gevaar.class)){
            if (Gevaar != null) {
                levenHud.verliesLeven();
                setLocation(x,y);
                return;
            }
        }
        for (Actor exit : getIntersectingObjects(Exit.class)) {
            if (exit != null) {
                Greenfoot.setWorld(new LevelSelect());
                return;
            }
        }
    }
     
    public void levens()
    {
        Actor l = getOneIntersectingObject(Leven.class);
        if( l != null)
        {
            
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("w") && (onGround() == true)
        || Greenfoot.isKeyDown("up") && (onGround() == true)
        || Greenfoot.isKeyDown("space") && (onGround() == true)) {
            velocityY = -22;
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
