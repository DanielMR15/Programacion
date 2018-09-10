import java.util.Scanner;

public class AreaRectangulo{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("inserte la base del rectangulo:");
    double B = input.nextDouble();

    Scanner input1 = new Scanner(System.in);
    System.out.println("inserte la altura del rectangulo:");
    double A = input1.nextDouble();

    Double area = B*A;

    System.out.println("el area del rectangulo es:" + area + "m2");

  }
}
