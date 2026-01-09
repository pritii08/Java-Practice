/***
Insertion sort algorithm :
We select an element and find its exact position and insert that element to its exact position

dividing it into two part : Sorted | Unsorted

Logic:

for(int i=0 to n(array length)){
    currentEle=arr[i]
    int j=i-1;
    while(j>=0 && current<arr[j]){
        arr[j+1]=arr[j]
        j--;
    }
    arr[j+1]=current
}
 */





public class InsertionSort{

    public static void sortArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= current;
        }


        System.out.println("Sorted array : ");
        for(int i : arr){
            System.out.println(i);
        }


    }


    public static void main(String arg[]){
        int[] arr={7,8,3,2,1};
        sortArray(arr);

    }
}