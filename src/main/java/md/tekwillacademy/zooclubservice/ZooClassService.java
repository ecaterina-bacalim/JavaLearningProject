package md.tekwillacademy.zooclubservice;

public class ZooClassService {
    public static void main(String[] args) {

        Dog bimDog = new Dog("BimDog");
        Animal lucyCat = new Cat("LucyCat");
        Animal mikeyMouse = new Mouse("MikeyMouse");

        lucyCat.eat();
        lucyCat.makeSound();

        System.out.println();

        bimDog.eat();
        bimDog.makeSound();

        System.out.println();

        mikeyMouse.eat();
        mikeyMouse.makeSound();

    }
}
