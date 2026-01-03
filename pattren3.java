//      *
//     **
//    ***
//   ****
//  *****
// ******
 //code 
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter the row ");
        int n =sc.nextInt();

        // outer loop
        for(int i=1; i<=n; i++){
            //inner  loop for space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop for star
            for(int j=1; j<=i; j++){
                System.out.print("*");

                }
                System.out.println( );
        }
    }
}

// 0,1 triangle
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the row ");
        int n = sc.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if ((sum % 2 == 0)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");  
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



