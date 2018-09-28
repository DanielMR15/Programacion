//import java.util.Scanner;
import javax.swing.JOptionPane;

  public class TheHumanLobsterJOpane{
    public static void main(String[] args) {


      double NP = Double.parseDouble(JOptionPane.showInputDialog(null,"enter the number of people:"));
      /*Scanner input = new Scanner(System.in);
      System.out.println("enter the number of people:");
      double NP = input.nextInt();*/
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
      JOptionPane.showMessageDialog(null,"The total is:" + TOT);
      //System.out.println("The total is:" + TOT);
  }
}
