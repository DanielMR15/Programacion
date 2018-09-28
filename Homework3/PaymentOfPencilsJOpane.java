//import java.util.Scanner;
import javax.swing.JOptionPane;


public class PaymentOfPencilsJOpane{
  public static void main(String[] args){

    double X = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the amount of pencils to pay:"));
    /*Scanner input = new Scanner(System.in);
    System.out.println("enter the amount of pencils to pay:");
    double X = input.nextDouble();*/

    double PAG;
    if(X >= 1000){
      PAG = X * 0.85;
    }else{
      PAG = X * 0.90;
    }
    JOptionPane.showMessageDialog(null,"The payment is"+ PAG);
    //System.out.println("The payment is"+ PAG);
  }
}
