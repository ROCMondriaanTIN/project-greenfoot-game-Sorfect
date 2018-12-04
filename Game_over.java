import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_over extends World
{
    /**
     * Constructor for objects of class Game_over.
     * 
     */
    public Game_over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.setBackground("New_Game_Over.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        { //LevenHudExtra.leven2=2;
            Greenfoot.setWorld(new StartScherm());
        }
    }
}
