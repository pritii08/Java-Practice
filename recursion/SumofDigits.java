package recursion;

import java.util.*;

public class SumofDigits{

    public static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        int lastD=num%10;
        return lastD+sumOfDigit(num/10);
    }


    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();

        System.out.println("Sum of all digits = "+sumOfDigit(num));


    }
}
