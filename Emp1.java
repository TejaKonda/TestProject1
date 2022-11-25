class Empl
{
  private int age;
  void setAge(int age)
  {
    if ( age < 0 )
	  this.age = age;
	else if ( age > 100)
	  this.age = age;
	else
	  this.age = age;
  }
  int getAge()
  {
    return age;
  }
}
class Demos
{
  public static void main(String args[])
  {
    Empl e = new Empl();
	e.setAge(200);
	int x = e.getAge();
	System.out.println(x);
  }
}