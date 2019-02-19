import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mole extends Actor
{
    /**
     * Act - do whatever the Mole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Get an object reference to our world
        MoleWorld world = (MoleWorld) getWorld();
        
        // Check for mouse press on this actor
        if (Greenfoot.mouseClicked(this) == true)
        {
            world.showText("ouch", Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
            world.moleWhacked();
        }
    }    
}
