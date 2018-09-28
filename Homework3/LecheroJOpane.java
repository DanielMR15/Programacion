//import java.util.Scanner;
import javax.swing.JOptionPane;

public class LecheroJOpane{
  public static void main(String[] args) {

    double L = Double.parseDouble(JOptionPane.showInputDialog(null,"cual es la cantidad de litros que se producen:"));
    /*Scanner input = new Scanner(System.in);
    System.out.println("cual es la cantidad de litros que se producen:");
    int L = input.nextDouble();*/

    double PG = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa el precio del galon:"));
    /*System.out.println("ingresa el precio del galon:");
    double PG = input.nextDouble();*/

    double TG = L / 3.785;

    double GA = PG * TG;

    JOptionPane.showMessageDialog(null,"la ganancia es:" + GA);
    //System.out.println("la ganancia es:" + GA);

  }
}
