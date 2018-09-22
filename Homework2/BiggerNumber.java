import java.util.Scanner;
public class BiggerNumber {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int A = sc.nextInt();
        System.out.print("Enter the second number: ");
        int B = sc.nextInt();
        int M = 0 ;
        if (A > B) {
          System.out.println("the greatest is: " + A);
        }else{
          System.out.println("the greatest is: " + B);
        }

    }
}
