import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter number for pattern  ");
        int n= sc.nextInt();
        System.out.println("enter the 2 number ");
        int m= sc.nextInt();
        //outer loop
        for(int i=1; i<=n; i++){ //row
            //inner loop 
            for(int j =1; j<=m;j++){

                if (i==1 || j==1 || i==n || j==m) {

                    System.out.print("*");
                    
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
* * * * *
*       *
*       *
*       *
* * * * *
