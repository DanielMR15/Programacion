import java.util.Scanner;

public class constructora{
  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("inserte la base del trinangulo y rectangulo:");
    double B = input.nextDouble();


    Scanner input1 = new Scanner(System.in);
    System.out.println("inserte la altura del trinangulo y rectangulo:");
    double A = input1.nextDouble();

    Scanner input2 = new Scanner(System.in);
    System.out.println("inserte la altura del rectangulo:");
    double C = input2.nextDouble();

    double AT = (B * A) / 2;

    double AR = (B * A);

    double area = AT + AR;


    System.out.println("el area del tereno es :" + area +"m2");
   }
}
