import java.util.Scanner;
public class PaymentOfPencils{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("enter the amount of pencils to pay:");
    double X = input.nextDouble();
    double PAG;
    if(X >= 1000){
      PAG = X * 0.85;
    }else{
      PAG = X * 0.90;
    }
    System.out.println("The payment is"+ PAG);
  }
}
