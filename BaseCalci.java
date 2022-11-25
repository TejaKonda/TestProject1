class BaseCalci implements Calci
{
	public int add(int a, int b)
	{
	 int x = a+b;
	 return x;
	}
	
	public int subtract(int a, int b)
	{
	 int y = a-b;
	 return y;
	}
	
	public int multiply(int a, int b)
	{
	int z = a*b;
	return z;
	}
	
	public static void main(String args[])
	{
		BaseCalci bc = new BaseCalci();
		System.out.println(bc.add(95, 5));
		System.out.println(bc.subtract(350, 100));
		System.out.println(bc.multiply(9, 5));
	}
}