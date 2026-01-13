import java.util.*;

public class NumberPalindrome{

    public static boolean checkPalindrome(int num){
        String str=String.valueOf(num);
        char[] arr=str.toCharArray();
        int left=0,right=arr.length-1;
        while(left<=right && right>=0){

            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String agr[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        System.out.println("Is palindrome = "+checkPalindrome(num));


    }
}