package recursion;

public class DescendingNumberPrint {

    //Printing numbers from n to 1
    public static void numberPrint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        numberPrint(n);
    }

    public static void numberPrintAsc(int n){
        if(n==0){
            return;
        }
        numberPrintAsc(n-1);
        System.out.println(n);
    }



    public static void main(String arg[]){
        numberPrint(10);
        numberPrintAsc(10);

    }
}
