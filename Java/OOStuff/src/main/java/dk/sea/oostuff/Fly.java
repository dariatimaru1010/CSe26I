package dk.sea.oostuff;

import dk.sea.oostuff.zoo.Animal;

public class Fly extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bzzz!");
    }
}
