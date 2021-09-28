package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        float numInput = input.nextInt();
        numInput = numInput / 2;
        if (numInput == (int)numInput){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }
    }
}
