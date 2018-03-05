package com.paulgeschke;

class Customer {
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private double squareFootage;


    String getCustomerName() { return customerName; }
    String getCustomerPhone() { return customerPhone; }
    String getCustomerAddress() { return customerAddress; }
    double getSquareFootage() { return squareFootage; }

    void setCustomerName(String customerName) { this.customerName = customerName; }
    void setCustomerPhone(String customerPhone) { this.customerPhone = customerPhone; }
    void setCustomerAddress(String customerAddress) { this.customerAddress = customerAddress; }
    void setSquareFootage(double squareFootage) { this.squareFootage = squareFootage; }


}
