package dk.sea.oostuff.zoo;

public abstract class Animal {
    protected int health;

    public abstract void makeSound();

    public Animal(){
        health = 100;
    }

    public Animal(int health){
        this.health = health;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public int getHealth() {
        return health;
    }
}
