import java.io.*;

class FileDemo{
	public static void main(String[] args){
		File f = new File("abc.txt");
		try{	
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
