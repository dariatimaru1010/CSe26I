package dk.sea.oostuff;

import dk.sea.oostuff.zoo.Animal;
import dk.sea.oostuff.zoo.ICanRun;

public class Horse extends Animal implements ICanRun {

    @Override
    public void makeSound() {
        System.out.println("Well hello there Brittany");
    }

    @Override
    public void run(){
        System.out.println("Horse is running happily");
        health++;
    }
}
