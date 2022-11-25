import java.lang.*;

class Employee extends Object
{
	public int id;
	public String name;
	public String location;
	public String designation;
	
	public Employee()
	{
		System.out.println("I'm coming frm constructor");
	}
	
	public Employee(int id,String name, String location, String designation)
	{
		this.id=id;
		this.name=name;
		this.location=location;
		this.designation = designation;
	}
	
	public void employeeDetails(int id,String name, String location, String designation )
	{
		this.id=id;
		this.name=name;
		this.location=location;
		this.designation = designation;
	}
	
	public String toString(){
		return "ID is:"+id+" Name is:"+name+" location:"+location+" designation: "+designation;
	}
}

public class Techouts{
	public static void main(String args[])
	{
		Employee emp1 = new Employee(102,"Teja","Hyderabad","SWD");
		
		//emp1.employeeDetails(102,"Teja","Hyderabad","SWD");
		
		System.out.println(emp1);
	}
}