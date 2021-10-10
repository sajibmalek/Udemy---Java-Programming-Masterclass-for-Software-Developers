package com.company;

public class Main {

    public static void main(String[] args) {

double firstvalue=20.00d;
double secondvalue=80.00d;
double totalvalue= (firstvalue+secondvalue)*100.00d;
        System.out.println("total value "+totalvalue);
double remainder= totalvalue % 40.00d;
        System.out.println("remainder "+remainder);
        boolean notremainder=(remainder==0) ? true:false;
        System.out.println("not remainder "+notremainder);

        if (!notremainder){
            System.out.println("Go some remainder");
        }




    }
}
