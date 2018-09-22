import java.util.Scanner;
public class GreaterQuantity{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("enter the second number: ");
        n2 = sc.nextInt();
        System.out.print("enter the third number: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("the greatest is: " + n1);
            } else {
                System.out.println("the greatest is: " + n3);
            }
        } else if (n2 > n3) {
            System.out.println("the greatest is: " + n2);
        } else {
            System.out.println("the greatest is: " + n3);
        }
    }
}
