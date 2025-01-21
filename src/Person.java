import Vehicles.*;

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
