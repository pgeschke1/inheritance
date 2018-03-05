package com.paulgeschke;

import java.text.NumberFormat;

class Commercial extends Customer {
    private boolean multiProperty;

    private boolean isMultiProperty() { return multiProperty; }

    private void setMultiProperty(boolean multiProperty) { this.multiProperty = multiProperty; }

    Commercial(String name, String phone, String address, double footage, boolean mProperty){
        setCustomerName(name);
        setCustomerPhone(phone);
        setCustomerAddress(address);
        setSquareFootage(footage);
        setMultiProperty(mProperty);
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
        tempRate = (getSquareFootage() / 1000) * 5;
        if (isMultiProperty()){
            tempRate = tempRate * .9;
            System.out.println("10% Discount applied.");
        }
        System.out.println("Your charges are: $" + nf.format(tempRate) + " per week");
    }

}
