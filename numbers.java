class Numbers
{
int add(int num1, int num2){
int x = num1 + num2;
return x;
}
public static void main(String[] args){
	Numbers a = new Numbers();
	Numbers b = new Numbers();
int x = a.add(5, 10);
b.subtract(10, 5);
System.out.println(x);
}

void subtract(int e, int f){
	System.out.println("Subtraction is: " + (e-f));
}


}	
