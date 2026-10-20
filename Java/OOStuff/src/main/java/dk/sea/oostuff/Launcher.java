package dk.sea.oostuff;

import dk.sea.oostuff.zoo.Animal;

import java.util.ArrayList;
import java.util.List;

public class Launcher extends Animal {
    public static void main(String[] args) {
        Wombat w = new Wombat();
        w.eat();
        Horse h = new Horse();
        h.eat();
        h.run();
        Chicken chick = new Chicken(500);
        chick.flapWings();
        System.out.println("Horse health:" + h.getHealth());
        System.out.println(chick.getHealth());
        Launcher launcher = new Launcher();
        System.out.println(launcher.health);

        Lion mufasa = new Lion();
        mufasa.eat();
        List<Animal> theRoom = new ArrayList();

        theRoom.add(h);
        theRoom.add(w);
        theRoom.add(chick);
        theRoom.add(new Fly());

        for(Animal a: theRoom){
            a.makeSound();
        }

        for(Animal a: theRoom){
            mufasa.eat(a);
        }


        System.out.println(mufasa.getHealth());


        //Animal a = new Animal();
        //Application.launch(HelloApplication.class, args);
    }

    @Override
    public void makeSound() {

    }
}
