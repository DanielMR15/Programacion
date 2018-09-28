import javax.swing.JOptionPane;
public class AreaCircunferenciaJOpane{
  public static void main(String[] args) {

    double R = Double.parseDouble(JOptionPane.showInputDialog(null,"inserte el radio del circulo:"));

    //double R = JOptionPane.nextDouble();
    //num1 = double.parseDouble(R);

    double r2 = R * 2;

    double PI = 3.1416;

    double area = r2 + PI;

    JOptionPane.showMessageDialog(null,"el area del circulo es:"+ area + "m2");
    //System.out.println("el area del circulo es:"+area + "m2");
 }
}
