package com.pluralsight;

import java.util.Scanner;

public class addressBuilder {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        StringBuilder customerInfo = new StringBuilder();

        System.out.println("Enter the following information: ");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine().trim();
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine().trim();
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine().trim();
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine().trim();
        System.out.print("Billing Zip: ");
        String billingZip = (scanner.nextLine().trim());
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine().trim();
        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine().trim();
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine().trim();
        System.out.print("Shipping Zip: ");
        String shippingZip = (scanner.nextLine().trim());

        customerInfo.append(fullName).append("\n\n");

        customerInfo.append("Billing Address:\n");
        customerInfo.append(billingStreet).append("\n");
        customerInfo.append(billingCity).append("\n");
        customerInfo.append(billingState).append("\n");
        customerInfo.append(billingZip).append("\n");

        customerInfo.append("Shipping Address:\n");
        customerInfo.append(shippingStreet).append("\n");
        customerInfo.append(shippingCity).append("\n");
        customerInfo.append(shippingState).append("\n");
        customerInfo.append(shippingZip).append("\n");

        System.out.println(customerInfo.toString());


    }
}
