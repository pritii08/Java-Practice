/**
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.


Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].

 */

public class MergeArrays{

    public static void mergeSortedArray(int[] ar1,int m,int[] ar2,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(ar1[i]>ar2[j]){
                ar1[k]=ar1[i];
                i--;
            }else{
                ar1[k]=ar2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            ar1[k]=ar2[j];
            j--;
            k--;
        }

        for(int x : ar1){
            System.out.println(x);
        }
    }

    

    public static void main(String arg[]){
        
        MergeArrays m=new MergeArrays();

        int[] ar1={1,2,3,4,0,0,0};
        int[] ar2={1,8,9};
        int x=4,y=3;
        mergeSortedArray(ar1,x,ar2,y);

    }
}