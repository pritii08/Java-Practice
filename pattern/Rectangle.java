import java.io.*;

public class Rectangle{

    public static void rectanglePattern(int n,int m){
        System.out.println("Printing rectangle pattern : ");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
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