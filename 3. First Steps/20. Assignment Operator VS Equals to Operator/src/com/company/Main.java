package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value=50;
    // if (value=50) error=> == means it's a boolean logic ture or false, and value=10 it's normally value assignment
        if (value!=50){
            System.out.println("50");
        }
        else{
            System.out.println("40");
        }

        boolean icCar= true;
        if (icCar=true){
            System.out.println("This is a car");
        }
        else  if(icCar !=true){
            System.out.println("This is not a car");
        }
        else{
            System.out.println("Something Error");
        }
    }
}
