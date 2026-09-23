/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4_prefinalexercises;

/**
 *
 * @author User
 */
public class VehicleMainClass {
     public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("C-001", "Toyota", "Vios", 7),
            new Motorcycle("M-001", "Honda", "Click 125", 3),
            new Van("V-001", "Toyota", "Hiace", 2)
        };

        System.out.println("===== VEHICLE RENTAL =====");
        System.out.println();

        // Polymorphism
        for (Vehicle vehicle : vehicles) {

            if (vehicle instanceof Car) {
                System.out.println("Vehicle: Car");
            } 
            else if (vehicle instanceof Motorcycle) {
                System.out.println("Vehicle: Motorcycle");
            } 
            else if (vehicle instanceof Van) {
                System.out.println("Vehicle: Van");
            }

            vehicle.displayVehicle();
            System.out.println();
        }
    }
}
