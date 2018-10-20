import javax.swing.JOptionPane;

public class CourseImpl{
   public static void main(String[] args){
     Course course = new Course();
     int opc=0;
     do {
      opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Elige la opcion deseada \n1. Craer Curso\n2.Agregar Estudiante \n3. Eliminar Estudiante\n4.Mostrar Estudiante\n5. Mostar cantidad de estudiantes\n6. Salir del menu"));
       switch(opc){
       case 1:
       //crear curso

       String n=JOptionPane.showInputDialog(null, "Nombre del curso");
       course.setCourseName(n);
       JOptionPane.showMessageDialog(null, n);
       break;
       case 2:
       //agregar estudiante
       String Alumno = JOptionPane.showInputDialog("Nombre del Alumno");
       course.addStudent(Alumno);

       break;
       case 3:
       //eliminar estudiante
       String AlumnoDrop = JOptionPane.showInputDialog("Nombre del Alumno");
       course.dropStudent(AlumnoDrop);
       break;
       case 4:
        //mostrar estudiantes
        JOptionPane.showMessageDialog(null,course.getStudents());
        //Correl
       break;

       case 5:
       //mostrar numero de estudiantes
       JOptionPane.showMessageDialog(null,course.getCAntidad());
       break;
       default:
       JOptionPane.showMessageDialog(null, "Seleccione la opcion correcta");
       //mensaje de eliga opcion correcta
       break;
     }
   } while (opc != 6);
 }
}
