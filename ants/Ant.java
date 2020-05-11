import greenfoot.*;

/**
 * An ant that collects food.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Ant extends Creature
{
    private boolean carryingFood;
    private GreenfootImage image1 = getImage();
    private GreenfootImage image2 = new GreenfootImage("ant-with-food.gif");
    private final int MAX_PH_AVAILABLE = 16;
    private final int TIME_FOLLOWING_TRAIL = 30;
    private int phAvailable = MAX_PH_AVAILABLE;
    private int followTrialTimeRemaining = 0;
    
    /**
     * Create an ant with a given home hill. The initial speed is zero (not moving).
     */
    public Ant(AntHill home)
    {
        setHomeHill(home);
    }
    
    public Ant()
    {
        carryingFood = false;
    }
    
    private void handlePheromoneDrop()
    {
        
    }
    
    private boolean smellsPheromone()
    {
        return false;
    }
    
    private void walkTowardsPheromoneCenter()
    {
        
    }
    
        private boolean atHome()
    {
        if (getHomeHill() != null) {
            return (Math.abs(getX() - getHomeHill().getX()) < 4) && 
                   (Math.abs(getY() - getHomeHill().getY()) < 4);
        }
        else {
            return false;
        }
    }

    /**
     * Do what an ant's gotta do.
     */
    public void act()
    {
        status();
    }
    
    private void checkForFood()
    {
        food food = (food) getOneIntersectingObject(food.class);
        if (food != null) 
        {
            carryingFood = true;
            setImage(image2);
            food.removeCrumb();
        }
    
    
    }
    
    private void searchForFood()
    {
        randomWalk();
        checkForFood();
    }
    
    private void status()
    {
        if (carryingFood)
        {
            walkTowardsHome();
            if (atHome())
            {
                setImage(image1);
                carryingFood = false;
                getHomeHill().countFood();
            }
        }
        else
        {
           searchForFood(); 
        }
    }
}