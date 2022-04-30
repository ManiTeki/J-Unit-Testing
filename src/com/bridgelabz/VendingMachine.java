package com.bridgelabz;

import java.util.Scanner;

public class VendingMachine {
    static Scanner input = new Scanner(System.in);
    static int balance = 0, notes, total = 0, change = 0, options;

    public static void payment(int opt, int note) {
        System.out.println("\nPlease select the payment method");
        do {
            System.out.println("0. Enter Money");
            System.out.println("1.Enter notes");
            options = opt;

            if (options == 0) {
                break;
            }
            else if (options == 1){
                System.out.println("Enter notes");
                System.out.println(note);
                do{
                    notes = note;
                    switch (notes) {
                        case 1:
                            total += 1;
                            break;
                        case 2:
                            total += 2;
                            break;
                        case 5:
                            total += 5;
                            break;
                        case 10:
                            total += 10;
                            break;
                        case 50:
                            total += 50;
                            break;
                        case 100:
                            total += 100;
                            break;
                        case 500:
                            total += 500;
                            break;
                        case 1000:
                            total += 1000;
                            break;
                        default:
                            System.out.println("invalid notes, Please enter new notes");
                    }

                }
            }
        }
    }
    public static String change(){

    }
}
