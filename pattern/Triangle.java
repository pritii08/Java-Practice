/*** Printing Triangle pattern 
 * 
 * 1) First Pattern
 * |*
 * |**
 * |***
 * |****
 * |*****
 * |******
 * 
 * 2)Second Pattern
 * |******
 * |*****
 * |****
 * |***
 * |**
 * |*
 */

import java.util.Scanner;

public class Triangle{

    public static void firstPattern(int n){
        System.out.println("Printing first pattern : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void secondPattern(int n){
        System.out.println("Printing second pattern : ");
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main(String arg[]){

        Triangle t=new Triangle();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        Triangle.firstPattern(n);//Static Method
        t.secondPattern(n);//Non-Static Method


    }
}