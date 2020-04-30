import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food extends Actor
{
    GreenfootImage image = getImage();
    private int crumbs = 100;
    private final int size = 30;
    
    public food()
    {
        image = new GreenfootImage(size, size);
    }
    
    /**
     * Act - do whatever the food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateImage();
    }    
    
    private void updateImage()
    {
        Random random = new Random();
        //int randomNum1 = random.nextInt(5);
        
        for (int i = 0; i < crumbs; i++)
        {
           int stDev = size / 6;
           int x = (int) (stDev * random.nextGaussian( ) + 3 * stDev);
           int y = (int) (stDev * random.nextGaussian( ) + 3 * stDev);
            
           // keep crumbs in image
           if(x < 0) 
           x = 0;
           if(x >= size) 
           x = size - 1;
           if(y < 0) 
           y = 0;
           if(y >= size) 
           y = size - 1;
     
           Color color = new Color(255, 0, 0);  // pick the color you want by replacing r, g, b with values.
           image.setColorAt(x, y, color); 
        }
        setImage(image);
    }
    
    public void removeCrumb()
    {
        crumbs--;
        updateImage();
        image.clear();
        if (crumbs == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
