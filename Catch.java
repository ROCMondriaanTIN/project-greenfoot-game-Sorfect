import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Catch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catch extends Actor
{
    /**
     * Act - do whatever the Catch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Catch(){
    
        super();
        setImage("LastPic.png");
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        { //LevenHudExtra.leven2=2;
            Greenfoot.setWorld(new StartScherm());
        }
    }
}
