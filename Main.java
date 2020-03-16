package HomePackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int num1 = 13;
        boolean isPrime = false;

        for (int i = 2; i <= num1 / 2; ++i)
        {
            if (num1 % i == 0)
            {
                isPrime = true;
                break;
            }
        }
        if (!isPrime){
            System.out.println(num1 + " is a prime number.");}
        else {
            System.out.println(num1 + " is not a prime number."); }

        //Second number
        int num2 = 141;
        int result;
        String output, outputFinal = "Prime Factor is : ";
        isPrime = false;
        String[] factor = new String[10];

        for (int i = 2; i <= num2 / 2; ++i)
        {
            if (num2 % i == 0)
            {
                isPrime = false;
                factor[i]= Integer.toString(i);
                factor[i+1]= "*";
                result = num2 / i;
                factor[i+2]= Integer.toString(result);
                break;
            }
        }
        if (!isPrime)
            System.out.println(num2 + " is not a prime number.");
        else
            System.out.println(num2 + " is a prime number: ");

        for (int i=0; i< factor.length; i++){

            output = factor[i];

            if ( output == null){
           }
            else
                outputFinal += output;

        }
        System.out.println(outputFinal);

    }
}






