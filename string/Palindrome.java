/** Here is this problem we will check if given string is palindrome or not

Palindrome string is a string where if the given string stays same after reversing it

 */

import java.util.*;
import java.io.*;

public class Palindrome{

    public static boolean isPalindrome(String s){
        char[] arr=s.toCharArray();

        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

    public static void main(String arg[])throws IOException{

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String s=bf.readLine();

        System.out.println("Is given string palindrome : "+Palindrome.isPalindrome(s));


    }
}