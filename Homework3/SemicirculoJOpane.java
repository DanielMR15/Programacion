import javax.swing.JOptionPane;
//import java.util.Scanner;

public class SemicirculoJOpane{
  public static void main(String[] args) {

    double R = Double.parseDouble(JOptionPane.showInputDialog(null,"inserte el radio del circulo:"));
    /*Scanner input = new Scanner(System.in);
    System.out.println("inserte la medida de la base del triangulo rectangulo y radio:");
    double R = input.nextDouble();*/

    double H = Double.parseDouble(JOptionPane.showInputDialog(null,"inserte el radio del circulo:"));
    /*System.out.println("inserte la medida de la ipotenusa:");
    double H = input.nextDouble();*/

    double C = Math.sqrt(H * H - R * R);

    double AT = 2 * (R  * C)/2;

    double PI = 3.1416;

    double AC= (PI * R *R)/2;

    double area = AT + AC;

    JOptionPane.showMessageDialog(null,"el area es:"+area + "m2");
    //System.out.println("el area es:"+area + "m2");
 }
}
