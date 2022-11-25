

public class Student1 implements Student
{
  public int idno()
  {
	  return 20191238;
  }
  
  public String name()
  {
	  return "Teja Konda";
  }
  
  public int section()
  {
	  return 2;
  }
  
  public static void main(String[] args)
  {
	  Student1 as = new Student1();
	  int idno = as.idno();
	  String name = as.name();
	  int section = as.section();
	  System.out.println("NEW STUDENT DETAILS: " + '\n' + "Id No.: " + idno + " Name: " + name + " Section No.: " + section);
  }
}