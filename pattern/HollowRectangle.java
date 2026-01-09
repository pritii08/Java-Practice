import java.io.*;

public class HollowRectangle{

    public static void rectanglePattern(int n,int m){
        System.out.println("Printing rectangle pattern : ");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==(n-1) || j==(m-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String arg[])throws IOException{

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter rows and columns : ");
        int r=Integer.parseInt(bf.readLine());
        int c=Integer.parseInt(bf.readLine());

        rectanglePattern(r,c);

    }
}