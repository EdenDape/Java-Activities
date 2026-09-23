/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;

/**
 *
 * @author User
 */
public class InternetMainClass {
    public static void main(String[] args) {

        Internet[] plans = {
            new BasicPlan("B001", "Eden Dape", 6),
            new StandardPlan("S001", "Princes May", 12),
            new PremiumPlan("P001", "Shirra ", 18)
        };

        System.out.println("===== INTERNET SUBSCRIPTION =====");

        for (Internet plan : plans) {

            plan.displayPlanInfo();

            System.out.println("--------------------------------");
        }
    }
}
