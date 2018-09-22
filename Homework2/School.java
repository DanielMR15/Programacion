import java.util.Scanner;
public class School{
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("enter the number of students who made the trip: ");
   double NA = input.nextInt();
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
   System.out.println("the individual payment is" + PA);
   System.out.println();
 }
}
