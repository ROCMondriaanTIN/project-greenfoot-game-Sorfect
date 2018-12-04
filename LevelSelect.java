import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        super(1000, 800, 1); 
        this.setBackground("StartPage.png");
        prepare();
    }
    public void prepare()
    {
        Een een = new Een();
        Twee twee = new Twee();
        Drie drie = new Drie();
        Vier vier = new Vier();
        addObject(een, 155, 325);
        addObject(twee, 390, 325);
        addObject(drie, 590, 325);
        addObject(vier, 840, 325);
    }
}
