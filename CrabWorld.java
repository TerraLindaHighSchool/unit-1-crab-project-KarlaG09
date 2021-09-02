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
        addObject(crab,256,200);
        Worm worm = new Worm();
        addObject(worm,358,235);
        Worm worm2 = new Worm();
        addObject(worm2,66,214);
        Worm worm3 = new Worm();
        addObject(worm3,120,405);
        Worm worm4 = new Worm();
        addObject(worm4,302,388);
        worm4.setLocation(307,444);
        Worm worm5 = new Worm();
        addObject(worm5,482,423);
        Worm worm6 = new Worm();
        addObject(worm6,483,67);
        Worm worm7 = new Worm();
        addObject(worm7,352,50);
        Worm worm8 = new Worm();
        addObject(worm8,124,29);
        worm8.setLocation(120,123);
        worm8.setLocation(124,107);
        worm8.setLocation(106,47);
        worm8.setLocation(114,35);
        Lobster lobster = new Lobster();
        addObject(lobster,461,203);
        lobster.setLocation(364,177);
        lobster.setLocation(353,182);
        lobster.setLocation(352,151);
        lobster.setLocation(65,156);
        lobster.setLocation(383,196);
        lobster.setLocation(369,194);
        lobster.setLocation(367,165);
    }
}