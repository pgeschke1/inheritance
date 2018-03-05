package com.paulgeschke;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        while (input == 1){
            System.out.println("1. Commercial");
            System.out.println("2. Residential");
            System.out.println("3. Finish");
            int selection = scanner.nextInt();

            switch (selection){
                case 1:
                    commercial();
                    input = 2;
                    break;
                case 2:
                    residential();
                    input = 2;
                    break;
                case 3:
                    System.out.println("Program Ended");
                    input = 2;
                    break;
                default:
                    System.out.println("Enter a number between 1 - 3:");
            }
        }
    }
    private static void commercial(){
        boolean mProperty;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Commercial Customer");
        System.out.println("Enter Customer Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Customer Phone Number:");
        String phone = scanner.nextLine();
        System.out.println("Enter Customer Address:");
        String address = scanner.nextLine();
        System.out.println("Enter Square Footage of Property:");
        String tempFootage = scanner.nextLine();
        double footage = Double.parseDouble(tempFootage);
        System.out.println("Type True if Multi-Property Discount:");
        String multiDiscount = scanner.nextLine();
        mProperty = multiDiscount.substring(0, 1).equals("t") ||
                multiDiscount.substring(0, 1).equals("T");

        Commercial customer = new Commercial(name, phone, address, footage, mProperty);
        customer.calculate();
    }
    private static void residential(){
        boolean senior;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Residential Customer");
        System.out.println("Enter Customer Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Customer Phone Number:");
        String phone = scanner.nextLine();
        System.out.println("Enter Customer Address:");
        String address = scanner.nextLine();
        System.out.println("Enter Square Footage of Property:");
        String tempFootage = scanner.nextLine();
        double footage = Double.parseDouble(tempFootage);
        System.out.println("Type True if Senior Discount:");
        String seniorDiscount = scanner.nextLine();
        senior = seniorDiscount.substring(0, 1).equals("t") ||
                seniorDiscount.substring(0, 1).equals("T");

        Residential customer = new Residential(name, phone, address, footage, senior);
        customer.calculate();
    }
}
