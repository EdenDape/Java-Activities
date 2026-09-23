/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;

/**
 *
 * @author User
 */
public class BasicPlan extends Internet {

    public BasicPlan(String planCode, String customerName, int monthsSubscribed) {
        super(planCode, customerName, 999.00, monthsSubscribed);
    }

    @Override
    public double calculateMonthlyBill() {
        if (getMonthsSubscribed() >= 6) {
            return getMonthlyFee() * 0.95;
        }

        return getMonthlyFee();
    }

    @Override
    public String getSpeed() {
        return "50";
    }

    @Override
    public String getPlanDescription() {
        return "Basic";
    }

    @Override
    public double getDiscountRate() {
        if (getMonthsSubscribed() >= 6) {
            return 0.05;
        }

        return 0;
    }
}
