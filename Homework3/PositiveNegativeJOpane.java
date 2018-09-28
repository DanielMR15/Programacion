//import java.util.Scanner;
import javax.swing.JOptionPane;

public class PositiveNegativeJOpane{
    public static void main(String[] args) {

      double NUM = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter a number"));
      /*Scanner sc=new Scanner(System.in);
      System.out.println("Ingresa un numero");
      int NUM = sc.nextInt();*/
      if(NUM == 0){
        JOptionPane.showMessageDialog(null,"The Number "+ NUM +" is null");
        //System.out.println("The Number "+ NUM +" is null");
      } else{
          if(NUM > 0){
              JOptionPane.showMessageDialog(null,"The Number "+ NUM +" is Positive");
              //System.out.println("The Number "+ NUM +" is Positive");
          }else{
            JOptionPane.showMessageDialog(null,"The Number "+ NUM +" is Negative");
            //System.out.println("The Number "+ NUM +" is Negative");
          }
      }
      }
}
