import java.util.Scanner;

public class lechero{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("cual es la cantidad de litros que se producen:");
    int L = input.nextDouble();

    System.out.println("ingresa el precio del galon:");
    double PG = input.nextDouble();

    double TG = L / 3.785;

    double GA = PG * TG;

    System.out.println("la ganancia es:" + GA);

  }
}
