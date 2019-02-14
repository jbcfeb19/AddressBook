package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        AddressBookEntry a = new AddressBookEntry();
        ArrayList<AddressBookEntry> userInfo = new ArrayList<>();
        String tryAgain = "";
        do {
            System.out.println("Please enter your name ");
            String name = input.nextLine();
            System.out.println("Enter your phone number: ");
            String phoneNumber = input.nextLine();
            System.out.println("Enter your email address: ");
            String emailAddress = input.nextLine();


            userInfo.add(new AddressBookEntry(name, phoneNumber, emailAddress));

            System.out.println("Do you want to enter another contact? ");
            tryAgain = input.next();
            input.nextLine();
        }while (!tryAgain.equalsIgnoreCase("no"));

        for(AddressBookEntry info: userInfo){
            System.out.println("Name: " + info.getName() + "\nPhone number: " + info.getPhoneNumber()
                    + "\nEmail: " + info.getEmailAddress());
        }


    }
}
