

public class Mahindra implements Vehicle 
{
	public int tyres()
	{
		return 4;
	}
	public String color()
	{
		return "red";
	}
	 String fuelType()
	{
		return "Petrol";
	}
	public String brand()
	{
		return "Mahindra Thar";
	}
	
	public static void main(String args[])
	{
		Mahindra thar = new Mahindra();
		int tyres = thar.tyres();
		String color = thar.color();
		String fuel = thar.fuelType();
		String brand = thar.brand();
		System.out.println("Thar has " + tyres + " tyres, " + color + " color, " + fuel + " fueltype and brand is " + brand + ".");
	}
}