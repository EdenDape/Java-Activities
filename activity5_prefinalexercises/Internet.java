/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity5_prefinalexercises;

/**
 *
 * @author User
 */
public class Internet {
     private String planCode;
    private String customerName;
    private double monthlyFee;
    private int monthsSubscribed;

    public Internet(String planCode, String customerName,
                         double monthlyFee, int monthsSubscribed) {
        this.planCode = planCode;
        this.customerName = customerName;
        this.monthlyFee = monthlyFee;
        this.monthsSubscribed = monthsSubscribed;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public int getMonthsSubscribed() {
        return monthsSubscribed;
    }

    public void setMonthsSubscribed(int monthsSubscribed) {
        this.monthsSubscribed = monthsSubscribed;
    }

    public double calculateMonthlyBill() {
        return monthlyFee;
    }

    public String getSpeed() {
        return "Unknown";
    }

    public String getPlanDescription() {
        return "Internet Plan";
    }

    public double getDiscountRate() {
        return 0;
    }

    public String getClassification() {
        if (monthsSubscribed >= 12) {
            return "LONG-TERM SUBSCRIBER";
        } else if (monthsSubscribed >= 6) {
            return "REGULAR SUBSCRIBER";
        } else {
            return "NEW SUBSCRIBER";
        }
    }

    public void displayPlanInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("Plan: " + getPlanDescription());
        System.out.println("Speed: " + getSpeed() + " Mbps");
        System.out.printf("Monthly Fee: P%,.2f%n", monthlyFee);
        System.out.println("Months Subscribed: " + monthsSubscribed);
        System.out.printf("Discount: %.0f%%%n", getDiscountRate() * 100);
        System.out.printf("Monthly Bill: P%,.2f%n", calculateMonthlyBill());
        System.out.println("Classification: " + getClassification());
    }
}
