 import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Vijand extends Mover {

    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    private final double gravity;
    private final double acc;
    private final double drag;
    private static boolean onPlatform = false;
    private CollisionEngine collisionEngine;
    private TileEngine tileEngine;
    
    //Lopen
    private GreenfootImage run1 = new GreenfootImage("p2_walk01.png");
    private GreenfootImage run2 = new GreenfootImage("p2_walk02.png"); 
    private GreenfootImage run3 = new GreenfootImage("p2_walk03.png"); 
    private GreenfootImage run4 = new GreenfootImage("p2_walk04.png"); 
    private GreenfootImage run5 = new GreenfootImage("p2_walk05.png"); 
    private GreenfootImage run6 = new GreenfootImage("p2_walk06.png"); 
    private GreenfootImage run7 = new GreenfootImage("p2_walk07.png"); 
    private GreenfootImage run8 = new GreenfootImage("p2_walk08.png"); 
    private GreenfootImage run9 = new GreenfootImage("p2_walk09.png"); 
    private GreenfootImage run10 = new GreenfootImage("p2_walk10.png"); 
    private GreenfootImage run11 = new GreenfootImage("p2_walk11.png"); 

    private int frame = 1;
    public Vijand(CollisionEngine collisionEngine, TileEngine tileEngine) {
        super();
        setImage("p2_jump.png");
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        walkRange = 20;
        firstAct = true;
        speed = 5;
        this.collisionEngine = collisionEngine;
        this.tileEngine = tileEngine;
    }

    @Override
    public void act() {
        int x = getX();
        int y = getY();
        velocityX *= drag;
        velocityY += acc;
        
        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        loop();
        velocityX = speed;
        applyVelocity();
            for (Actor Spring : getIntersectingObjects(Spring.class)) {
            if (Spring != null) {
                
                    velocityY = -27;
            }
        }
        for (Actor exit : getIntersectingObjects(Exit.class)) {
            if (exit != null) {
                getWorld().removeObject(this);
                return;
            }
        }
        for (Actor hero : getIntersectingObjects(Hero.class)) {
            if (hero != null) {
                Greenfoot.setWorld(new Catch());
            }
        }
    }
        public void loop()
    {
        if (frame == 1)
        {
            setImage(run1);
        }
        else if (frame == 2)
        {
            setImage(run2);
        }
        else if (frame == 3)
        {
            setImage(run3);
        }
        else if (frame == 4)
        {
            setImage(run4);
        }
        else if (frame == 5)
        {
            setImage(run5);
        }
        else if (frame == 6)
        {
            setImage(run6);
        }
        else if (frame == 7)
        {
            setImage(run7);
        }
        else if (frame == 8)
        {
            setImage(run8);
        }
        else if (frame == 9)
        {
            setImage(run9);
        }
        else if (frame == 10)
        {
            setImage(run10);
        }
        else if (frame == 11)
        {
            setImage(run11);
            frame=0;
        }
        frame++;
        return;
    }
    
    public boolean isOnSolidGround()
    {
        boolean isOnGround = false;

        if (getY() > getWorld().getHeight() - 50) isOnGround = true;

        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        return isOnGround;
    }
}