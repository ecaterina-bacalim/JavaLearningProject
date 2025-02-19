package md.tekwillacademy.zooclubservice;

public class Dog extends Animal {

    public Dog (String dogName){
        super(dogName);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " dog eats meat and bones");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says RRRRRRRR!");
    }
}
