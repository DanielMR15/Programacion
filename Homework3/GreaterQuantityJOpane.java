//import java.util.Scanner;
import javax.swing.JOptionPane;

public class GreaterQuantityJOpane{
 public static void main(String[] args) {

        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the first number: "));
        /*Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("enter the first number: ");
        n1 = sc.nextInt();*/

        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the second number: "));
        /*System.out.print("enter the second number: ");
        n2 = sc.nextInt();*/

        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the third number: "));
        /*System.out.print("enter the third number: ");
        n3 = sc.nextInt();*/
        if (n1 > n2) {
            if (n1 > n3) {
                JOptionPane.showMessageDialog(null,"the greatest is: " + n1);
                //System.out.println("the greatest is: " + n1);
            } else {
                JOptionPane.showMessageDialog(null,"the greatest is: " + n3);
                //System.out.println("the greatest is: " + n3);
            }
        } else if (n2 > n3) {
            JOptionPane.showMessageDialog(null,"the greatest is: " + n2);
            //System.out.println("the greatest is: " + n2);
        } else {
            JOptionPane.showMessageDialog(null,"the greatest is: " + n3);
            //System.out.println("the greatest is: " + n3);
        }
    }
}
