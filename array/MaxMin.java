package array;

import java.util.Scanner;

public class MaxMin {

    public static int maxFind(int[] arr){
        int max=arr[0];

        for(int i:arr){
            if(max<i){
                max=i;
            }
        }

        return max;
    }

    public static int minFind(int[] arr){
        int min=arr[0];
        for(int i:arr){
            if(min>i){
                min=i;
            }
        }
        return min;

    }


    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Maximum element : "+maxFind(arr));
        System.out.println("Minimum element : "+minFind(arr));


    }
}
