/**
Selection Sort Algorithm:
Select minimum element from array
Swap with first element
and repeatedly do until array get sorted.

Logic:
for(i=0 to n){
    minIndex=i;
    for(j=i+1 to n){
        if(arr[j]<arr[minIndex]){
            minIndex=j;
        }
    }
    now we get the smallest element index
    Swap with first element
    temp=arr[i]
    arr[i]=arr[minIndex]
    arr[minIndex]=temp
}
 */




import java.util.*;

public class SelectionSort{

    public static void arraySorting(int[] arr,int n){

        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println("Sorted array : ");
        for(int i: arr){
            System.out.println(i);
        }

    }


    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        SelectionSort.arraySorting(arr,n);


    }
}