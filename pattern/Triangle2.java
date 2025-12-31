/** Printing the Triangle Patterns
 *
 * 1) First Pattern
 * |       * 
 * |      * * 
 * |     * * *
 * |    * * * *
 * |   * * * * * 
 * |  * * * * * * 
 * | * * * * * * *
 * |* * * * * * * * 
 * 
 * 2)Second Pattern
 * |* * * * * * * * 
 * | * * * * * * *
 * |  * * * * * *
 * |   * * * * * 
 * |    * * * *
 * |     * * * 
 * |      * *
 * |       *
 */

import java.util.Scanner;

public class Triangle2{


    public void firstPattern(int n){
        System.out.println("Printing First Pattern : ");
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
    }

    public static void secondPattern(int n){
        System.out.println("Printing Second Pattern : ");
        for(int i=n;i>0;i--){
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



    public static void main(String arg[]){
        
        Triangle2 t=new Triangle2();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        t.firstPattern(n);
        Triangle2.secondPattern(n);

    }
}