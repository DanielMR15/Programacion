import java.util.Scanner;
  public class TheHumanLobster{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter the number of people:");
      double NP = input.nextInt();
      double TOT;
      if(NP > 300){
        TOT = NP * 75;
      }else{
        if(NP > 200){
          TOT = NP * 85;
        }else{
          TOT = NP * 95;
        }
      }
      System.out.println("The total is:" + TOT);
  }
}
