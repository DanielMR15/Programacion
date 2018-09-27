import javax.swing.JOptionPane;
public class WhileLoop{
  public static void main(String[] ars){
    int number = (int)(Math.random() * 100);

    int guess = - 1;
    while(guess != number){
      Integer.parseInt(JOptionPane.showInputDialog("Guess a magin number between 0 and 100"));

    }

    if (guess == number) {
    JOptionPane.showInputDialog(null,"Yes , the number is:" + number);
  }else if(guess > number) {
      JOptionPane.showMessageDialog(null, "your guess is to high");
    }else{
      JOptionPane.showMessageDialog(null, "your guess is ");
    }
  }
}
