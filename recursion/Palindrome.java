package recursion;

import java.util.Scanner;

/*
Checking number is palindrome or not using recursion.
 */
public class Palindrome {

    public static int digitCnt(int num){
        if(num==0){
            return 0;
        }
        return 1+digitCnt(num/10);
    }

    public static int reverseNum(int num){
        if(num==0){
            return 0;
        }
        int lastD=num%10;
        int remD=num/10;

        return lastD*(int) Math.pow(10,digitCnt(num/10))+reverseNum(remD);
    }

    public static void checkPalindrome(int num){
        if(num==reverseNum(num)){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not palindrome number");
        }

    }



    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num=sc.nextInt();

    }



}
