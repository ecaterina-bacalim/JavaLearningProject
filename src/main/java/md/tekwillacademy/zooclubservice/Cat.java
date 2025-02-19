package md.tekwillacademy.zooclubservice;

public class Cat extends Animal implements AnimalInterface {

    public Cat (String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " cat says MEOW!");

    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " cat is eating fish");
    }
}
