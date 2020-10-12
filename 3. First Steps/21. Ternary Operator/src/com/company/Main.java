package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isCar=true;
        if (isCar!=false){
            System.out.println("car");
        }
        boolean wasCar= isCar ? true:false;
        isCar=false;
        if(wasCar){
            System.out.println("Was car true");
        }
        if(wasCar){
            System.out.println();
        }

    }
}
