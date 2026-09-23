/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4_prefinalexercises;

/**
 *
 * @author User
 */
public class Motorcycle extends Vehicle {

    // Constructor
    public Motorcycle(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    // Override calculateRental()
    @Override
    public double calculateRental() {

        double rentalCost = rentalDays * 700;

        // Helmet fee
        rentalCost = rentalCost + 100;

        return rentalCost;
    }
}
