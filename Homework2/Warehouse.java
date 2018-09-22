import java.util.Scanner;
public class Warehouse {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("enter the price: ");
   double CT = input.nextInt();
   double DE;
   double PF;
   if(CT > 2500){
     DE = CT * 015;
   }else{
     DE = CT * 0.08;
   }
   PF = CT - DE;
   System.out.println("The price is:" + PF);
   System.out.println("The discount is:" + DE);
 }
}
