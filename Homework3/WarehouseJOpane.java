//import java.util.Scanner;
import javax.swing.JOptionPane;

public class WarehouseJOpane{
 public static void main(String[] args) {

   double CT = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the price: "));
  /* Scanner input = new Scanner(System.in);
   System.out.print("enter the price: ");
   double CT = input.nextInt();*/
   double DE;
   double PF;
   if(CT > 2500){
     DE = CT * 015;
   }else{
     DE = CT * 0.08;
   }
   PF = CT - DE;
   JOptionPane.showMessageDialog(null,"The price is:" + PF);
   //System.out.println("The price is:" + PF);
   JOptionPane.showMessageDialog(null,"The discount is:" + DE);
   //System.out.println("The discount is:" + DE);
 }
}
