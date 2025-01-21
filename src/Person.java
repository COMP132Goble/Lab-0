import Vehicles.*;
/**
 * Lab 0: VSCode, Java, and GitHub
 * 
 * The purpose of this lab is to introduce you to VSCode, 
 * Github, and the Java language in an OOP manner. The 
 * Person class contains information about a user's first 
 * and last name. As part of the assignment you will add 
 * a field which can contain the user's github username.
 * 
 * @author William Goble
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        firstName = "Jane";
        lastName = "Doe";
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) throws Exception {
        Car truck, suv;
        truck = new Car();
        suv = new Car("Ford", "CRV", 2019, "gray");

        System.out.println("Hello, World!");
        System.out.print("My dream car is ");
        truck.show();
        System.out.println("\nBut I drive a " + suv);
    }
}
