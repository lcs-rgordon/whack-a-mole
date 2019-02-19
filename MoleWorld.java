import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoleWorld extends World
{
    // Track time going up
    private int frames = 0;
    
    // Track mole presses
    private int molesWhacked = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MoleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Set the initial time
        String initialTime = "Time: 0";
        showText(initialTime, 100, 50);
        
        // Set the initial score
        String currentScore = "Score: 0";
        showText(currentScore, 500, 50);
    }
    
    public void act()
    {

        // Every 60 frames, update the time
        if ((frames % 60) == 0)
        {
            String timeElapsed = "Time: " + Integer.toString(frames / 60);
            showText(timeElapsed, 100, 50);
        }
        
        // Increment frame (roughly 60 frames per second)
        frames = frames + 1;
        
    }
    
    // Add to moles clicked
    void moleWhacked()
    {
        molesWhacked = molesWhacked + 1;
        
        // Update the score
        String currentScore = "Score: " + Integer.toString(molesWhacked);
        showText(currentScore, 500, 50);
    }
}
