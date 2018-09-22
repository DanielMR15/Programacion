import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingresa un numero");
      int NUM = sc.nextInt();
      if(NUM == 0){
      System.out.println("The Number "+ NUM +" is null");
      } else{
          if(NUM > 0){
              System.out.println("The Number "+ NUM +" is Positive");
          }else{
          System.out.println("The Number "+ NUM +" is Negative");
          }
      }
      }
}
