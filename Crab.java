import greenfoot.*;

 /**
    * The class controls the Crab object
    * @author: Karla
    * @version: 8/26/21
    */
public class Crab extends Actor

{  
    private int numOfWorms=0;
   public void act()  
   {
       move(3);
       turnAtEdge();
       checkKeyPress();
       onCollision();
    }

    private void turnAtEdge()
    {
       if (isAtEdge());
      {    
        turn(50); 
      }
    }
    // Turns the Crab at the edge

    // Checks for user key presses so user can turn the Crab
   private void checkKeyPress()
   {
     if(Greenfoot.isKeyDown("right"))  
     {
        turn(4);
     }
     if(Greenfoot.isKeyDown("left"))
     {
         turn(-4);
     }
     if(Greenfoot.isKeyDown("up"))
     {
            Greenfoot.delay(60);
     }
     }

    // Checks for collisions with other objects
   private void onCollision () 
   {
       
    if(isTouching(Worm.class))
     {
    
        removeTouching(Worm.class);
        Greenfoot.playSound("slurp.wav");
        numOfWorms --;
    
         // *** Winning the game *******************
         if (numOfWorms ==0)
         {
             Greenfoot.setWorld(new WinSplash());
             Greenfoot.playSound("fanfare.wav");
             Greenfoot.stop();
            }
            // 
    }
    
     if (isTouching(Lobster.class))
     {
    
        removeTouching(Worm.class);
        Greenfoot.playSound("au.wav");
        Greenfoot.stop();
    }
   }
}


