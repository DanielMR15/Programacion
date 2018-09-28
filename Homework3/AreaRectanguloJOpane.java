import javax.swing.JOptionPane;

public class AreaRectanguloJOpane{
  public static void main(String[] args) {

    double B = Double.parseDouble(JOptionPane.showInputDialog(null,"inserte la base del rectangulo:"));

    /*Scanner input = new Scanner(System.in);
    System.out.println("inserte la base del rectangulo:");
    double B = input.nextDouble();*/
    double A = Double.parseDouble(JOptionPane.showInputDialog(null,"inserte la altura del rectangulo:"));
    /*Scanner input1 = new Scanner(System.in);
    System.out.println("inserte la altura del rectangulo:");
    double A = input1.nextDouble();*/

    Double area = B*A;

    JOptionPane.showMessageDialog(null,"el area del rectangulo es:" + area + "m2");
    //System.out.println("el area del rectangulo es:" + area + "m2");

  }
}
