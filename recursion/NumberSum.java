/** Printing sum of n natural numbers */

import java.io.*;

public class NumberSum{

    public static int printSum(int n){
        if(n==0) return 0;

        return n+printSum(n-1);

    }



    public static void main(String arg[])throws IOException{

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number : ");
        int n=Integer.parseInt(bf.readLine());

        System.out.println("Sum of "+n+" numbers = "+printSum(n));


    }
}