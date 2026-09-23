/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;

/**
 *
 * @author User
 */
public class StandardPlan extends Internet {

    public StandardPlan(String planCode, String customerName, int monthsSubscribed) {
        super(planCode, customerName, 1499.00, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 12) {
            return getMonthlyFee() * 0.90;
        }

        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "100";
    }

    @Override
    public String getPlanDescription() {
        return "Standard";
    }

    @Override
    public double getDiscountRate() {
        if (getMonthsSubscribed() >= 12) {
            return 0.10;
        }

        return 0;
    }
    
}
