import javax.swing.JOptionPane;
public class CourseImpl{
   public static void main(String[] args){
     Course course = new Course();
     int opc=0;
     do {
      opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Choose the desired option"+
                                                              "\n1. Create Course"+
                                                              "\n2.Add Student"+
                                                              "\n3. Delete Student"+
                                                              "\n4.Show Student"+
                                                              "\n5.Show number of students"+
                                                              "\n6.Exit menu"));
       switch(opc){
       case 1:
       String n=JOptionPane.showInputDialog(null, "Course name");
       course.setCourseName(n);
       JOptionPane.showMessageDialog(null, n);
       break;


       case 2:
       String Alumno = JOptionPane.showInputDialog("Student's name");
       course.addStudent(Alumno);
       break;

       case 3:
       String AlumnoDrop = JOptionPane.showInputDialog("Student's name");
       course.dropStudent(AlumnoDrop);
       break;

       case 4:
       JOptionPane.showMessageDialog(null,course.getStudents());
       break;

       case 5:
       JOptionPane.showMessageDialog(null,course.getCAntidad());
       break;

       default:
       JOptionPane.showMessageDialog(null, "Select the correct option");
       break;
     }
   } while (opc != 6);
 }
}
