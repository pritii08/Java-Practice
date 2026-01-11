/** Printing factorial of a number */

import java.util.*;

public class Factorial{

    public static int printFactorial(int n){
        
        if(n==0){
            return 1;
        }
        return n*printFactorial(n-1);
    }

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        System.out.println(n+"! = "+printFactorial(n));

    }
}