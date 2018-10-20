import javax.swing.JOptionPane;
public class Course{
  private String courseName; //encapsulacion
  private String[] students = new String[100];
  private int numberOfStudents = 0;

  public Course(){

  }
  public Course(String CourseName){
    this.courseName = CourseName;
  }
  /*public String getCourseName(){
  //CONSTRUCTOR  ES UN METODO, INICIALIZA VALORES. MISMO NOMBRE DE LA CLASE
    return this.courseName;
  }*/
   public String getCourseName(){
  //CONSTRUCTOR  ES UN METODO, INICIALIZA VALORES. MISMO NOMBRE DE LA CLASE
      return courseName;
    }

  public void setCourseName(String courseName){
    this.courseName = courseName;
  }
  public void addStudent(String student){
    /*this.students[numberOfStudents] = student;
    this.numberOfStudents ++ ;*/
    if (numberOfStudents >= students.length) {
       String[] temp = new String[students.length * 2];
       System.arraycopy(students, 0, temp, 0, students.length);
       students = temp;
     }

     students[numberOfStudents++] = student;
   }

 public String[] getStudents() {
     return students;
}
  /*public String[] setStudents(){
    return this.students;
  }
  public int getNumberOfStudents(){
    return this.numberOfStudents;

  }*/
  public void clear() {
    //students = new String[1];
    numberOfStudents = 0;
  }
  public int getCAntidad(){
    return numberOfStudents;
  }
  public void dropStudent(String student){
    for (int i = 0; i < numberOfStudents; i++) {
	      if (students[i].equalsIgnoreCase(student)) {
	        // Move students[i + 1] to students[i], etc.
	        for (int d = i + 1; d < numberOfStudents; d++) {
	          students[d - 1] = students[d];
            students[d]=null;
	        }

	        numberOfStudents--;
	        break;
	      }
	    }
	  }
  }
