import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       Crab crab = new Crab();
        addObject(crab,142,148);
        Worm worm = new Worm();
        addObject(worm,553,192);
        worm.setLocation(414,190);
        crab.setLocation(133,146);
        Worm worm2 = new Worm();
        addObject(worm2,278,332);
        Worm worm3 = new Worm();
        addObject(worm3,424,369);
        Worm worm4 = new Worm();
        addObject(worm4,255,114);
        Worm worm5 = new Worm();
        addObject(worm5,80,418);
        Worm worm6 = new Worm();
        addObject(worm6,464,65);
        Worm worm7 = new Worm();
        addObject(worm7,488,524);
        Worm worm8 = new Worm();
        addObject(worm8,74,239);
        Lobster Lobster = new Lobster();
        addObject(Lobster,360,264);
       
    }
}