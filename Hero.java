
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
    private GreenfootImage run1r=new GreenfootImage("p1_walk01.png");
    private GreenfootImage run2r=new GreenfootImage("p1_walk02.png");
    private GreenfootImage run3r=new GreenfootImage("p1_walk03.png");
    private GreenfootImage run4r=new GreenfootImage("p1_walk04.png");
    private GreenfootImage run5r=new GreenfootImage("p1_walk05.png");
    private GreenfootImage run6r=new GreenfootImage("p1_walk06.png");
    private GreenfootImage run7r=new GreenfootImage("p1_walk07.png");
    private GreenfootImage run8r=new GreenfootImage("p1_walk08.png");
    private GreenfootImage run9r=new GreenfootImage("p1_walk09.png");
    private GreenfootImage run10r=new GreenfootImage("p1_walk10.png");
    private GreenfootImage run11r=new GreenfootImage("p1_walk11.png");
    private GreenfootImage run1l=new GreenfootImage("p1_walk01.png");
    private GreenfootImage run2l=new GreenfootImage("p1_walk02.png");
    private GreenfootImage run3l=new GreenfootImage("p1_walk03.png");
    private GreenfootImage run4l=new GreenfootImage("p1_walk04.png");
    private GreenfootImage run5l=new GreenfootImage("p1_walk05.png");
    private GreenfootImage run6l=new GreenfootImage("p1_walk06.png");
    private GreenfootImage run7l=new GreenfootImage("p1_walk07.png");
    private GreenfootImage run8l=new GreenfootImage("p1_walk08.png");
    private GreenfootImage run9l=new GreenfootImage("p1_walk09.png");
    private GreenfootImage run10l=new GreenfootImage("p1_walk10.png");
    private GreenfootImage run11l=new GreenfootImage("p1_walk11.png");
    private int frame= 1;
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.8;
        drag = 0.8;
        run1l.mirrorHorizontally();
        run2l.mirrorHorizontally();
        run3l.mirrorHorizontally();
        run4l.mirrorHorizontally();
        run5l.mirrorHorizontally();
        run6l.mirrorHorizontally();
        run7l.mirrorHorizontally();
        run8l.mirrorHorizontally();
        run9l.mirrorHorizontally();
        run10l.mirrorHorizontally();
        run11l.mirrorHorizontally();
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
        || Greenfoot.isKeyDown("space")&& (onGround() == true)){
            velocityY = -27;
        }

        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            velocityX = -5;
            animateLeft();
        } else if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")) {
            velocityX = 5;
            animateRight();
        }
    }

    public void animateRight()
    {
        if(frame==1)
        {
            setImage(run1r);
        }
        else if(frame==2)
        {
            setImage(run2r);
        }
        else if(frame==3)
        {
            setImage(run3r);
        }
        else if(frame==4)
        {
            setImage(run4r);
        }
        else if(frame==5)
        {
            setImage(run5r);
        }
         else if(frame==6)
        {
            setImage(run6r);
        }
         else if(frame==6)
        {
            setImage(run6r);
        }
         else if(frame==7)
        {
            setImage(run7r);
        }
         else if(frame==8)
        {
            setImage(run8r);
        }
         else if(frame==9)
        {
            setImage(run9r);
        }
         else if(frame==10)
        {
            setImage(run10r);
        }
         else if(frame==11)
        {
            setImage(run11r);
            frame = 1;
            return;
        }
        frame++;
    }
    public void animateLeft()
    {
        if(frame==1)
        {
            setImage(run1l);
        }
        else if(frame==2)
        {
            setImage(run2l);
        }
        else if(frame==3)
        {
            setImage(run3l);
        }
        else if(frame==4)
        {
            setImage(run4l);
        }
        else if(frame==5)
        {
            setImage(run5l);
        }
         else if(frame==6)
        {
            setImage(run6l);
        }
         else if(frame==6)
        {
            setImage(run6l);
        }
         else if(frame==7)
        {
            setImage(run7l);
        }
         else if(frame==8)
        {
            setImage(run8l);
        }
         else if(frame==9)
        {
            setImage(run9l);
        }
         else if(frame==10)
        {
            setImage(run10l);
        }
         else if(frame==11)
        {
            setImage(run11l);
            frame = 1;
            return;
        }
        frame++;
    }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
    public boolean onGround()
    {
       Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Tile.class);
       return under != null;
    }
}
