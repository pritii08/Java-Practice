/**
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

USE OF XOR operator

XOR operator have some special properties

x ^ x = 0  same numbers cancel out
x ^ 0 = x

XOR operator is commutative and associative
When we say XOR is commutative and associative, we’re talking about how the order of operations doesn’t matter.
 */

import java.util.*;

public class SingleNumber{


    public static int returnSingleNum(int[] arr){
        int result=0;

        for(int i:arr){
            result=result^i;
        }
        return result;
    }

    public static void main(String agr[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("\n"+returnSingleNum(arr));


    }
}