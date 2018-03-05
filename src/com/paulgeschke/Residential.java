package com.paulgeschke;

import java.text.NumberFormat;

class Residential extends Customer {
    private boolean seniorField;

    private boolean isSeniorField() { return seniorField; }

    private void setSeniorField(boolean seniorField) { this.seniorField = seniorField; }

    Residential(String name, String phone, String address, double footage, boolean senior) {
        setCustomerName(name);
        setCustomerPhone(phone);
        setCustomerAddress(address);
        setSquareFootage(footage);
        setSeniorField(senior);
    }
    public void calculate(){
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        double tempRate;
        System.out.println(getCustomerName());
        System.out.println(getCustomerPhone());
        System.out.println(getCustomerAddress());
        tempRate = (getSquareFootage() / 1000) * 6;
        if (isSeniorField()){
            tempRate = tempRate * .85;
            System.out.println("15% Discount applied.");
        }
        System.out.println("Your charges are: $" + nf.format(tempRate) + " per week");
    }

}
