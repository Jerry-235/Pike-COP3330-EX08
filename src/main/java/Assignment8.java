/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the amount of people : ");
        int people = input1.nextInt();

        System.out.println("Enter the number of pizzas: ");
        int pizzas = input1.nextInt();

        System.out.println("Enter the number of slices: ");
        int slices = input1.nextInt();



        System.out.println("There are " + pizzas + " pizzas with " + slices + " and " + people);
        System.out.println("Each person gets " + (( slices * pizzas) / people) + " slice with " + ((slices * pizzas)% people) +" slices leftover");





    }
}