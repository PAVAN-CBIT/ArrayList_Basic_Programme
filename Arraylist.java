import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		ArrayList<String>words=new ArrayList<String>();
		words.add("Hi");
		words.add("Hello");
		words.add("How r u?");
		words.add("R u ok?");
		String item =words.get(1);
		System.out.println(item);
		
	}
