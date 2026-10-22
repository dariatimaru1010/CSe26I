package dk.sea.oostuff;

import dk.sea.oostuff.zoo.Animal;
import dk.sea.oostuff.zoo.FourLegs;

public class Wombat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Grhriiiiiii");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("I am a wombat");
        /*
        System.out.println("Munching away at rocks!");
        health++;*/
    }
}
