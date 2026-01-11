/** Printing numbers from 10 to 1 using recursion method */

public class NumberPrint{

    public static void numberPrint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        numberPrint(n);
        
    }


    public static void main(String arg[]){
        NumberPrint np=new NumberPrint();
        np.numberPrint(10);


    }
}