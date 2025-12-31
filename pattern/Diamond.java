/**
 Here we have printed two types of diamond pattern
  
 1) diamondPattern() method prints: 
 
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
  * * * * * * * * * * * 
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *

2) diamondP() method prints: 
         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * * 
     * * * * *
      * * * *
       * * *
        * *
         *
 
 */



import java.util.*;

public class Diamond{

    public void diamondPattern(int n){
        System.out.println("Printing diamond pattern : ");
        //Upper Half
        for(int i=0;i<n;i++){
            for(int k=0;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=n;i>=0;i--){
            for(int k=0;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void diamondP(int n) {

        System.out.println("Printing diamond pattern : ");

    // Upper half
    for (int i = 0; i < n; i++) {

        for (int k = 0; k < n - i; k++) {
            System.out.print(" ");
        }

        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // Lower half (start from n-1 to avoid duplicate middle)
    for (int i = n; i >= 0; i--) {

        for (int k = 0; k < n - i; k++) {
            System.out.print(" ");
        }

        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}


    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        Diamond d=new Diamond();
        System.out.println("Enter the num : ");
        int n=sc.nextInt();
        d.diamondPattern(n);
        d.diamondP(n);
    }
}