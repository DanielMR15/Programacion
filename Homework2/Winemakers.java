import java.util.Scanner;
public class Winemakers{
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Seleccione el valor de tipo de uva.");
        System.out.println("\t1.- A");
        System.out.println("\t2.- B");
        System.out.print("\t: ");
        double 1 = input.nextDouble();
        double 2 = input.nextDouble();
   System.out.print("enter the grape size: ");
   double TA = input.nextInt();
   System.out.print("enter the price of grape: ");
   double P = input.nextInt();
   System.out.print("enter the kilos of production: ");
   double K = input.nextInt();

   if(TI = "A"){
     if(TA = 1){
       P = P + 0.20;
     }else{
       P = P - 0.30;
     }
   }else{
     if(TA = 1){
       P = P + - 0.30;
     }else{
       P = P - 0.50;
     }
   }
  }
 }
