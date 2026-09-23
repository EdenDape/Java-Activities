/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2_prefinalexercises;

import activity2_prefinalexercises.WaterBill;

/**
 *
 * @author User
 */
public class WaterMainClass {
    public static void main(String[] args) {

        // Create 3 WaterBill objects

        WaterBill customer1 = new WaterBill(
            "WB001",
            "Eden Dape",
            "Residential",
            120,
            145
        );

        WaterBill customer2 = new WaterBill(
            "WB002",
            "Shirra Brigole",
            "Residential",
            200,
            212
        );

        WaterBill customer3 = new WaterBill(
            "WB003",
            "Princes May Opaño",
            "Commercial",
            300,
            335
        );

        // Display bills
        customer1.displayBill();
        customer2.displayBill();
        customer3.displayBill();
    }
}
