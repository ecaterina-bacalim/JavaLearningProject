package md.tekwillacademy.zooclubservice;

public class Mouse extends Animal {

    public Mouse (String name){
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " mouse is eating beans");
    }

    @Override
    public void makeSound() {
        System.out.println("Mouse says 3.14!");
    }
}
