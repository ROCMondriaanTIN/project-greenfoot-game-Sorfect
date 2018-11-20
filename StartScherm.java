import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScherm extends World
{

    /**
     * Constructor for objects of class StartScherm.
     * 
     */
    public StartScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        Greenfoot.start();
        prepare();
    }
    private void prepare()
    {
        Start start = new Start();
        addObject(start, 500, 400);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
