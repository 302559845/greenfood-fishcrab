import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FishWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Fish(),136,375);
        Fish fish2 = new Fish();
        addObject(fish2,340,215);
        Fish fish3 = new Fish();
        addObject(fish3,351,504);
    }
}
