import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mole extends Actor
{
    // Track time going up
    private int frames = 0;

    /**
     * Act - do whatever the Mole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Track time
        frames = frames + 1;
        
        // Get an object reference to our world
        MoleWorld world = (MoleWorld) getWorld();
        
        // After two seconds, disappear
        if (frames % 120 == 0)
        {
            world.removeObject(this);
        }
        
        // Check for mouse press on this actor
        if (Greenfoot.mouseClicked(this) == true)
        {
            // Track that a mole was whacked
            world.moleWhacked();
            
            // Remove this object (this instance of the Mole class)
            // from the world
            world.removeObject(this);
        }
    }    
}
