import javax.swing.JOptionPane;
//import java.util.Scanner;

public class ConstructoraJOpane{
  public static void main(String[] args) {

    double B = Double.parseDouble(JOptionPane.showInputDialog(null,"inserte la base del trinangulo y rectangulo:"));
    /*Scanner input = new Scanner(System.in);
    System.out.println("inserte la base del trinangulo y rectangulo:");
    double B = input.nextDouble();*/

    double A = Double.parseDouble(JOptionPane.showInputDialog(null,"inserte la altura del trinangulo y rectangulo:"));
    /*Scanner input1 = new Scanner(System.in);
    System.out.println("inserte la altura del trinangulo y rectangulo:");
    double A = input1.nextDouble();*/

    double C = Double.parseDouble(JOptionPane.showInputDialog(null,"inserte la altura del rectangulo:"));
    /*Scanner input2 = new Scanner(System.in);
    System.out.println("inserte la altura del rectangulo:");
    double C = input2.nextDouble();*/

    double AT = (B * A) / 2;

    double AR = (B * A);

    double area = AT + AR;

    JOptionPane.showMessageDialog(null,"el area del tereno es :" + area +"m2");
    //System.out.println("el area del tereno es :" + area +"m2");
   }
}
