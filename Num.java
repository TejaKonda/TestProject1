class Num
{
  public static void main(String[] args)
  {
    try{
	int x = 10/0;
	//int y = 2/2;
	
	System.out.println(x);
	//System.out.println(y);
	} catch (Exception e) {
	  System.out.println("Error:");
	  e.printStackTrace();
	}
  }
}