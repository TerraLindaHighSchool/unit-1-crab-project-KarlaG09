import greenfoot.*;

 /**
    * The class defines a crab. Crabs live on the beach.
    * @author: Karla
    * @version: 8/26/21
    */
public class Crab extends Actor

{  
    private int numOfWorms= 8;
    
   public void act()  
   {
       move(3);
       turnAtEdge();
       checkKeyPress();
       onCollision();
    }

    private void turnAtEdge()
    {
       if (isAtEdge())
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
     
     }

   private void onCollision () 
   {
       
    if(isTouching(Worm.class))
     {
        removeTouching(Worm.class);
        Greenfoot.playSound("slurp.wav");
        numOfWorms--;
        System.out.println("Number of worms" + numOfWorms);
    
         //Winning The Game
         if (numOfWorms == 0)
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


