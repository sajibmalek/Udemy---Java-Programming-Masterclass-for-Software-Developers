package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int result=28*2;
        System.out.println(result);

        result=result+4;
        System.out.println(result);

        //result++ => +1 add, result=60 and result++ => 61
        result++;
        System.out.println("result++ "+result);

        //result-- => -1 loss, result=60 and result-- => 59
        result=60;
        result--;
        System.out.println("result-- "+result);
        //
        result=60;
        //result += => main result + assign value; Exp: result=60, result+=2, output: 60+2=62
        result+=2;
        System.out.println("result+= "+result);
        ///
        result=60;
        //result -= => main result - assign value; Exp: result=60, result-=2, output: 60-2=58
        result-=2;
        System.out.println("result-= "+result);

        ///
        result=60;
        //result *= => main result * assign value; Exp: result=60, result*=2, output: 60*2=120
        result*=2;
        System.out.println("result*= "+result);

        ///
        result=60;
        //result /= => main result / assign value; Exp: result=60, result/=2, output: 60/10=6
        result/=10;
        System.out.println("result/= "+result);

    }
}
