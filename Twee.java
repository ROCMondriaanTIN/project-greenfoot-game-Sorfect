import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Twee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Twee extends Actor
{
    /**
     * Act - do whatever the Twee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level2());
        }
    }    
}
