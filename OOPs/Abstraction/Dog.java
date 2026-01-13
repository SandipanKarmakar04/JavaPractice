package Abstraction;

public class Dog extends AbstractionPractice {

    @Override
    void makeSound() {
        System.out.println("Berk!!!");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
    }
    
}
