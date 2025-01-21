package Vehicles;
/**
 * A simple class to demonstrate how we can create packages in Java. 
 * Here we will create a Car object that we can use in various other 
 * projects.
 * 
 * @author William Goble
 */
public class Car {
    private String make;
    private String modle;
    private int year;
    private String color;

    public Car() { 
        this("Ford", "F150", 2019, "blue");
    }

    public Car(String mk, String mod, int yr, String clr) {
        make = mk;
        modle = mod;
        year = yr;
        color = clr;
    }

    public String toString() {
        return color + " " + year + " " + make + " " + modle;
    }

    public void show() {
        System.out.print(color + " " + year + " " + make + " " + modle);
    }

    // Accessor methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return modle;
    }

    public int getYear() {
        return year;
    }
}
