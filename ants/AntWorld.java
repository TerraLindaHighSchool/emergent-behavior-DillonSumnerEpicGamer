import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * The world where ants live.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class AntWorld extends World
{
    public static final int SIZE = 640;

    /**
     * Create a new world. It will be initialised with a few ant hills
     * and food sources
     */
    public AntWorld()
    {
        super(SIZE, SIZE, 1);
        setPaintOrder(Ant.class, AntHill.class);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AntHill antHill = new AntHill();
        addObject(antHill,134,99);
        AntHill antHill2 = new AntHill();
        addObject(antHill2,528,549);
        food food = new food();
        addObject(food,484,100);
        food food2 = new food();
        addObject(food2,100,543);
        food food3 = new food();
        addObject(food3,341,298);
        food food4 = new food();
        addObject(food4,83,217);
        food food5 = new food();
        addObject(food5,312,37);
        food food6 = new food();
        addObject(food6,404,584);
        food food7 = new food();
        addObject(food7,553,415);
        food food8 = new food();
        addObject(food8,308,272);
        food food9 = new food();
        addObject(food9,304,328);
        food food10 = new food();
        addObject(food10,378,293);
        food food11 = new food();
        addObject(food11,357,336);
    }
}
