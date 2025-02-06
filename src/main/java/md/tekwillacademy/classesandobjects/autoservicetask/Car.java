package md.tekwillacademy.classesandobjects.autoservicetask;

public class Car {

    String make;
    String colorOfTheCar;
    int numberOfDoors;
    int motorCapacity;

    public Car (String make, String colorOfTheCar, int numberOfDoors, int motorCapacity){
        System.out.println("This is a full constructor with all params included");
        this.make = make;
        this.colorOfTheCar = colorOfTheCar;
        this.numberOfDoors = numberOfDoors;
        this.motorCapacity = motorCapacity;
        System.out.println("The object is created! Bingo!");
    }

    public Car () {
        System.out.println("Multi");
    }

}
