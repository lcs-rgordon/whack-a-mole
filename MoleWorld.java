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
        // Track time
        updateTime();
        
        // Add a mole
        addMole();
        
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
    
    // Track the time
    private void updateTime()
    {
        // Every 60 frames (every 1 second) update the time
        if ((frames % 60) == 0)
        {
            String timeElapsed = "Time: " + Integer.toString(frames / 60);
            showText(timeElapsed, 100, 50);
        }
    }
    
    // Add a new mole
    private void addMole()
    {
        // Every 120 frames (every 2 seconds) add a new mole
        if ((frames % 120) == 0)
        {
            Mole newMole = new Mole();
           
            // Random horizontal position
            int x = Greenfoot.getRandomNumber(500);
            // Ensure the mole doesn't appear off the left or right edge
            x += 50;
            
            // Random vertical position
            int y = Greenfoot.getRandomNumber(200);
            // Ensure mole doesn't appear behind score or time or below
            // bottom of screen 
            y += 150;
            
            // Add the mole
            this.addObject(newMole, x, y);
        }
    }
}
