import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class MyWorld extends World
{
    private int tics = 0;
    private int dx=0;
    private int dy=0;
    private List<BurgerSwarm> swarms = new ArrayList();

    public MyWorld()
    {    
        super(800, 600, 1); 

        for(int i=0;i<3;i++){
            int randX = Greenfoot.getRandomNumber(800);
            int randY = Greenfoot.getRandomNumber(600);
            int swarmSize = Greenfoot.getRandomNumber(20-5)+5;
            Byrger
        }

        Burger burger = new Burger();
        GreenfootImage bi = burger.getImage();
        int size = Greenfoot.getRandomNumber(20)+10;
        bi.scale(150, 150);
        addObject(burger, 500, 500);
    }


    public void act(){
        tics++;
        if(tics>90){
            for(BurgerSwarm bs: swarms){
            
                dx = Greenfoot.getRandomNumber(9)-4;
                dy = Greenfoot.getRandomNumber(9)-4;
                bs.setDiff(dx,dy);
            
            }
            tics = 0;
        }

        

    }
}
