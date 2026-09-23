/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;

/**
 *
 * @author User
 */
public class PremiumPlan extends Internet {

    public PremiumPlan(String planCode, String customerName, int monthsSubscribed) {
        super(planCode, customerName, 2499.00, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 12) {
            return getMonthlyFee() * 0.85;
        }

        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "300";
    }

    @Override
    public String getPlanDescription() {
        return "Premium";
    }

    @Override
    public double getDiscountRate() {
        if (getMonthsSubscribed() >= 12) {
            return 0.15;
        }

        return 0;
    }
    
}
