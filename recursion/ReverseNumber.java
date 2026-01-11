/** Reversing a number */

import java.util.*;

public class ReverseNumber{

    public static int reverseNum(int n, int digit){
        if(n==0){
            return 0;
        }
        
        int lastDigit=n%10;
        int remainingNum=n/10;
        return lastDigit*(int) Math.pow(10,digit-1)+reverseNum(remainingNum,digit-1);
    }

    public static int cntDigit(int n){
        if(n==0){
            return 0;
        }
        return 1+cntDigit(n/10);
    }


    public static void main(String arg[]){

        int num=12345;

        System.out.println("Reversing num = "+reverseNum(num,cntDigit(num)));

    }
}