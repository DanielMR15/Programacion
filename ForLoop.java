import javax.swing.JOptionPane;
  public class ForLoop{
    public static void main(String[] args) {
      /*for(inicializar var, condicion , incremento){
        accion 1
        accion 2
      }*/
      //int a = Integer.parseInt(JOptionPane.showMessageDialog(null,"what multiplication table you want to print"));
      int tabla;
      do{
      tabla = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
      String salida = "";
      for(int i = 0; i < 9; i++){
        salida += tabla + "x" + (i + 1) + "=" + (i + 1) * tabla + "\n";
      }
      JOptionPane.showMessageDialog(null, salida);
    }while(tabla !=0);
    }
  }
