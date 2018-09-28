//import java.util.Scanner;
import javax.swing.JOptionPane;

public class BiggerNumberJOpane {
 public static void main(String[] args) {

        double A = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the first number: "));
        /*Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int A = sc.nextInt();*/

        double B = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the second number: "));
        /*System.out.print("Enter the second number: ");
        int B = sc.nextInt();*/


        int M = 0 ;
        if (A > B) {
          JOptionPane.showMessageDialog(null,"the greatest is: " + A);
          //System.out.println("the greatest is: " + A);
        }else{
          JOptionPane.showMessageDialog(null,"the greatest is: " + B);
          //System.out.println("the greatest is: " + B);
        }

    }
}
