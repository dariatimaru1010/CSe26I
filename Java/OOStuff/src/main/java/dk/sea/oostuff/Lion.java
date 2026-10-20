package dk.sea.oostuff;

import dk.sea.oostuff.zoo.Animal;

public class Lion extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Roooar!");
    }

    public void eat(Animal a){
        health = health + a.getHealth();
    }
}
