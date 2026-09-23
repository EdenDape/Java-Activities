/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity4_prefinalexercises;

/**
 *
 * @author User
 */
public class Van extends Vehicle {

    // Constructor
    public Van(String vehicleId, String brand, String model, int rentalDays) {
        super(vehicleId, brand, model, rentalDays);
    }

    // Override calculateRental()
    @Override
    public double calculateRental() {

        double rentalCost = rentalDays * 2500;

        // Driver fee
        rentalCost = rentalCost + 1000;

        return rentalCost;
    }
}

