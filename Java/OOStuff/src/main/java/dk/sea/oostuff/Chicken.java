package dk.sea.oostuff;

import dk.sea.oostuff.zoo.Animal;
import dk.sea.oostuff.zoo.ICanFly;
import dk.sea.oostuff.zoo.ICanRun;

public class Chicken extends Animal implements ICanRun, ICanFly {
    public Chicken(){
        super();
    }

    public Chicken(int health){
        super(health);
    }

    @Override
    public void makeSound(){
        System.out.println("Goobeli gok!");
    }

    @Override
    public void flapWings() {
        System.out.println("Flapping wings happily");
        health++;
    }

    @Override
    public void run() {
        System.out.println("Roaming the fields, running! :)");
    }
}
