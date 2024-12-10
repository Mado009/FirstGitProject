package org.example;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("username: ");
        String username = s.nextLine();
        System.out.println("password: ");
        String password = s.nextLine();

        System.out.println("1- Add vehicle " +
                "\n 2- Remove vehicle" +
                "\n 3- Print vehicle");

        int action = s.nextInt();

        switch (action){
            case 1:
               // addVehicle();
                break;
            case 2:
               // removeVehicle();
                break;
            case 3:
               // printVehicle();
                break;
            default:
                System.out.println("Choose action!");
        }

    }
}