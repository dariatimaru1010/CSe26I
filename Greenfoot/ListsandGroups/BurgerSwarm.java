import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;


public class BurgerSwarm extends Actor
{
    private int dx=0;
    private int dy=0;
    
    public void setDiff(int dx, int dy){
        this.dx=dx;
        this.dy=dy;
    }
    List<Burger> burgers = new ArrayList();
    
    public BurgerSwarm(int amount){
        burgers = createBurgerSwarm(amount);
    }
    
    private List<Burger> createBurgerSwarm(int amount){
        List<Burger> burgers = new ArrayList();

        for(int i=0;i<amount;i++){
            int dx = Greenfoot.getRandomNumber(100);
            int dy = Greenfoot.getRandomNumber(100);
            Burger burger = new Burger();
            GreenfootImage bi = burger.getImage();
            int size = Greenfoot.getRandomNumber(20)+10;
            bi.scale(size, size);
            burgers.add(burger);
        }
        return burgers;
    }
    public void act()
    {
        for(Burger b: burgers)
        {
            int x = b.getX();
            int y = b.getY();
            b.setLocation(x+dx,y+dy);
        }
        // Add your action code here.
    }
}
