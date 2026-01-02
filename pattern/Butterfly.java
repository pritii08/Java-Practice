import java.util.*;

public class Butterfly{

    public void butterflyPattern(int n){

        System.out.println("Printing Butterfly pattern : ");
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<(n-i)*2;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<(n-i)*2;k++){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String arg[]){
        
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the num :");
        int n=sc.nextInt();

        Butterfly bf=new Butterfly();
        bf.butterflyPattern(n);
    }
}