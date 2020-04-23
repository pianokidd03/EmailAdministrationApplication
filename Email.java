package com.gabebraden;

import java.util.*;

public class Email{
    private String companyName;
    private String firstName;
    private  String lastName;
    private String department;
    private String emailAddress;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;

    // contructor to recive first name and last name
    public Email(String companyName ,String firstName, String lastName){
        System.out.println("Welcome to the "+companyName+" email admin app. \n");

        this.companyName = companyName.replaceAll("\\s+", "").toLowerCase();
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New email address for : "+this.firstName+" "+this.lastName+"\n");

        this.department = setDepartment();
        System.out.println("Department: "+this.department);

        this.emailAddress = createEm(this.companyName, this.firstName, this.lastName, this.department);
        System.out.println("Email address: "+this.emailAddress.toLowerCase());

        this.password = randomPass();
        System.out.println("Default password: "+this.password);
    }

    // ask for department
    private String setDepartment(){
        System.out.print("Enter: \n1 for " +
                "Sales \n2 for Development \n3 for Accounting \n0 for none. \nDepartment number: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if (deptChoice == 1){
            return "Sales";
        }
        if(deptChoice == 2){
            return "Development";
        }
        if(deptChoice == 3){
            return "Accounting";
        }
        else{
            return null;
        }
    }

    // generate random password
    private String randomPass(){
        int min = 1;
        int max = 9;

        StringBuilder passString = new StringBuilder();

        for (int i = 0; i < 10; i++){
            Random rand = new Random();
            int randInt = rand.nextInt((max - min) + 1) + min;

            passString.append(String.valueOf(randInt));
        }

        return passString.toString();
    }

    // Create primary email address

    private String createEm(String co,String first,String last,String dept){
        // email syntax: firstname.lastname@department.company.com
        String emailString = first+"."+last+"@"+dept+"."+co+"."+"com";
        return emailString;
    }

    // set mailbox capacity 

    // set alt email

    // change password
}
