import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leven extends Mover
{
    public Leven()
    {
        super();
        setImage("hud_heartFull.png");
    }
    public void addedToWorld(World w)
    {
        getWorld();
    }
        
    /**
     * Act - do whatever the Leven wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
    }    
}
