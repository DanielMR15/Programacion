//import java.util.Scanner;
import javax.swing.JOptionPane;

public class SchoolJOpane{
 public static void main(String[] args) {

   double NA = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the number of students who made the trip: "));
   /*Scanner input = new Scanner(System.in);
   System.out.print("enter the number of students who made the trip: ");
   double NA = input.nextInt();*/

   double PA;
   if(NA >= 100){
     PA = 65.0;
   }else{
     if(NA >= 50){
       PA = 70.0;
     }else{
       if(NA >= 30){
         PA = 95.0;
       }else{
         PA = 4000 / NA;
       }
     }
   }
   double TOT = PA * NA;
   JOptionPane.showMessageDialog(null,"the individual payment is" + PA);
   //System.out.println("the individual payment is" + PA);
 }
}
