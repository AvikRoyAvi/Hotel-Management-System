package Project.Hotel_Management_System;

import java.util.Scanner;

public class hotel_management_system {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Taking user information
        System.out.println("***Welcome***\n**Please sign up**");
        System.out.print("Name: ");
        String name = scan.next();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.print("Password: ");
        String password = scan.next();
        System.out.println();

        //Log in
        System.out.println("*Log in*");

        System.out.print("Name: ");
        String ans1 = scan.next();
        while (!ans1.equals(name)) {
            System.out.println("Wrong name! Please try again.");
            System.out.print("Name: ");
            ans1 = scan.next();
        }

        System.out.print("Email: ");
        String ans2 = scan.next();
        while (!ans2.equals(email)) {
            System.out.println("Wrong email! Please try again.");
            System.out.print("Email: ");
            ans2 = scan.next();
        }

        System.out.print("Password: ");
        String ans3 = scan.next();
        while (!ans3.equals(password)) {
            System.out.println("Wrong password! Please try again.");
            System.out.print("Password: ");
            ans3 = scan.next();
        }
        System.out.println();

        System.out.println("Access Granted.");

        System.out.println();

        //Order
        System.out.println("What do you want to order?");
        System.out.print("1. Berger\n2. Pizza\n3. Sandwiches\n4. Chips\n5. Hot Dog\n");
        System.out.print("Your order please: ");
        int order = scan.nextInt();
        int berger = 60;
        int pizza = 80;
        int sandwiches = 40;
        int chips = 20;
        int hot_dog = 50;
        int drink = 30;

        //Processing order
        if (order == 1) {
            System.out.println("How many Berger do you want to order?");
            int num = scan.nextInt();
            System.out.println("Do you want to order Cold drink?");
            System.out.println("1. Yes\n2. No");
            System.out.print("-> ");
            int colddrink = scan.nextInt();
            int yes = 1;
            if (colddrink == yes) {
                System.out.println("You ordered "+num+" Berger & drink.");
                int price = berger * num + drink;
                System.out.println("Your bill is: "+price);
            } else {
                System.out.println("You ordered "+num+" Berger.");
                int price = berger * num;
                System.out.println("Your bill is: "+price);
            }
            System.out.println();
        } else if (order == 2) {
            System.out.println("How many Pizza do you want to order?");
            int num = scan.nextInt();
            System.out.println("Do you want to order Cold drink?");
            System.out.println("1. Yes\n2. No");
            System.out.print("-> ");
            int colddrink = scan.nextInt();
            int yes = 1;
            if (colddrink == yes) {
                System.out.println("You ordered "+num+" Pizza & drink.");
                int price = pizza * num + drink;
                System.out.println("Your bill is: "+price);
            } else {
                System.out.println("You ordered "+num+" Pizza.");
                int price = pizza * num;
                System.out.println("Your bill is: "+price);
            }
            System.out.println();
        } else if (order == 3) {
            System.out.println("How many Sandwiches do you want to order?");
            int num = scan.nextInt();
            System.out.println("Do you want to order any Cold drink?");
            System.out.println("1. Yes\n2. No");
            System.out.print("-> ");
            int colddrink = scan.nextInt();
            int yes = 1;
            if (colddrink == yes) {
                System.out.println("You ordered "+num+" Sandwiches & drink.");
                int price = sandwiches * num + drink;
                System.out.println("Your bill is: "+price);
            } else {
                System.out.println("You ordered "+num+" Sandwiches.");
                int price = sandwiches * num;
                System.out.println("Your bill is: "+price);
            }
            System.out.println();
        } else if (order == 4) {
            System.out.println("How many packets of Chips do you want to order?");
            int num = scan.nextInt();
            System.out.println("Do you want to order any Cold drink?");
            System.out.println("1. Yes\n2. No");
            System.out.print("-> ");
            int colddrink = scan.nextInt();
            int yes = 1;
            if (colddrink == yes) {
                System.out.println("You ordered "+num+" packed of Chips & drink.");
                int price = chips * num + drink;
                System.out.println("Your bill is: "+price);
            } else {
                System.out.println("You ordered "+num+" packed of Chips.");
                int price = chips * num;
                System.out.println("Your bill is: "+price);
            }
            System.out.println();
        } else if (order == 5) {
            System.out.println("How many Hot Dog do you want to order?");
            int num = scan.nextInt();
            System.out.println("Do you want to order any Cold drink?");
            System.out.println("1. Yes\n2. No");
            System.out.print("-> ");
            int colddrink = scan.nextInt();
            int yes = 1;
            if (colddrink == yes) {
                System.out.println("You ordered "+num+" Hot Dog & drink.");
                int price = hot_dog * num + drink;
                System.out.println("Your bill is: "+price);
            } else {
                System.out.println("You ordered "+num+" Hot Dog.");
                int price = hot_dog * num;
                System.out.println("Your bill is: "+price);
            }
            System.out.println();
        } else {
            System.out.println("Sorry! We do not have that item.");
        }

        //order or not?
        if (order < 6) {
            //Payment method
            System.out.println("How do you like to Payment?");
            System.out.println("Please choose one\n1. Bank\n2. Cash on delivery");
            int payment = scan.nextInt();
            if (payment == 1) {
                System.out.println("You choose bank payment.");
            } else {
                System.out.println("You choose Cash on delivery.");
            }
            System.out.println();

            //order confirming
            System.out.println("Please enter password to confirm your order.");
            System.out.print("-> ");
            String ans4 = scan.next();
            while (!ans4.equals(password)) {
                System.out.println("Wrong password! Please try again.");
                System.out.print("Password: ");
                ans3 = scan.next();
            }
            System.out.println("Your order confirmed.\nThank You for your order.");
        } else {
            System.out.println("Have a good day.");
        }
    }
}
