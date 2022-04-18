import java.awt.*;

public class carCreator {

    public String brand;
    public String model;
    public int year;
    public int mileage;


    public carCreator(String brand, String model, int year, int mileage){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void drive() {
        System.out.println("Engine on, bon voyage");
    }

    public void brake() {
        System.out.println("You are driving too fast! Brake!!!");
    }

    public void info() {
        System.out.println("The brand of your car is " + brand);
        System.out.println("Model = " + model);
        System.out.println("Year = " + year);
        System.out.println("Mileage = " + mileage);
    }

    public static void main(String[] args) {

        carCreator car = new carCreator("Mercedes","S Class", 2022, 0 );
        car.info();
        System.out.println("\n");
        car.drive();
        car.brake();

    }
}
