import java.util.Scanner;
public class ComputeBMI{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    final double KILOGRAMS_PER_FOUND = 0.4535923;
    final double METERS_PER_INCH = 0.0254;


    System.out.println(" Enter weight in pounds");
    double weight = input.nextDouble();

    System.out.println("Enter height in inches");
    double height = input.nextDouble();

    double weightInKilograms = weight * KILOGRAMS_PER_FOUND;
    double heightInMeters = height * METERS_PER_INCH;

    //double bmi = weightInKilograms / (heightInMeters * heightInMeters);
    double bmi = weightInKilograms / Math.pow(heightInMeters , 2);

    System.out.println("you are bmi is");

    if (bmi < 16)
    System.out.println("you are seriusly underweight");
    else if (bmi < 18)
    System.out.println("you are underweight");
    else if (bmi < 24)
    System.out.println("you are normal weight");
    else if (bmi < 29)
    System.out.println("you are overweight");
    else if (bmi < 35)
    System.out.println("you are seriusly overweight");
    else
    System.out.println("you are gravely overweight");








  }
}
