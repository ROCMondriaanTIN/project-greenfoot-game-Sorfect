import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vlag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vlag extends Mover 
{
    /**
     * Act - do whatever the vlag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        for( Actor hero : getIntersectingObjects(Hero.class))
        {
            if(hero != null)
            {
                Hero.x = getX();
                Hero.y = getY();
            }
        }
    }    
}
