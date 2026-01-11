/** Counting digit in a number */

import java.util.*;

public class DigitCount{

    public int digitCnt(int n){
        if(n==0){
            return 0;
        }

        return 1+ digitCnt(n/10);
    }


    public static void main(String arg[]){

        DigitCount c=new DigitCount();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        System.out.println("Number of digit = "+c.digitCnt(n));


    }
}