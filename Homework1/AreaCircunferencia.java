import java.util.Scanner;

public class AreaCircunferencia{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("inserte el radio del circulo:");
    double R = input.nextDouble();

    double r2 = R * 2;

    double PI = 3.1416;

    double area = r2 * PI;

    System.out.println("el area del circulo es:"+area + "m2");
 }
}
