package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        byte minValue=Byte.MIN_VALUE;
        byte maxValue=Byte.MAX_VALUE;

        System.out.println("minValue= "+ minValue);
        System.out.println("maxValue= "+maxValue);


        System.out.println("Busted minValue= "+ (minValue + 1));
        System.out.println("maxValue= "+(maxValue -1));

        short minShortValue=Short.MIN_VALUE;
        short maxShortValue=Short.MAX_VALUE;

        System.out.println("minValue= "+ minShortValue);
        System.out.println("maxValue= "+maxShortValue);


        System.out.println("Busted minValue= "+ (minShortValue + 1));
        System.out.println("maxValue= "+(maxShortValue -1));

        long minLongValue=Long.MIN_VALUE;
        long maxLongValue=Long.MAX_VALUE;
        

        System.out.println("Long minValue"+minLongValue);
        System.out.println("maxLongValue = " + maxLongValue);

    }
}
