import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class LevenHudExtra here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class LevenHudExtra extends Actor
{
    private int leven = 3;
    public LevenHudExtra()
    {  
    }
    
    public void act() 
    {
    }  
    
    public void verliesLeven()
    {
        leven --;
        if(leven==2){
           setImage("hud_heartFull.png");
        }
        if(leven==1){
           setImage("hud_heartHalf.png");
        }
        if(leven==0){
           setImage("hud_heartEmpty.png");
           Greenfoot.setWorld(new Game_over());  
        }
    }
}

