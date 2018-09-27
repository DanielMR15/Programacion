import javax.swing.JOptionPane;
  public class FactoralWhileLoop{
    public static void main(String[] args) {
      int value = integer.parseInt(JOptionPane.showInputDialog("Enter an int Value"));
        int fact = 1;


      int i = 1 ;

      while(i <= value){
        fact =fact + 1;
        i++;
        }
        JOptionPane.showMessageDialog(null, "El factorial de "+ value + "es" + fact , "calcular factorial",JOptionPane.WARNING_MESSAGE);
  }
}
