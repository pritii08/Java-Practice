/** Finding HCF - Highest common factor of two numbers  */

import java.util.*;

public class HCF{

    
        public static int commonFactor(int n1,int n2){
            int x=1;
            int c=0;

            while(x<n1 && x<n2){

                if(n1%x==0 && n2%x==0){
                    c=x;
                }
                x++;
            }

            return c;
            

        }

    public static void main(String arg[]){


        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the numbers : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println(HCF.commonFactor(n1,n2));




    }
}