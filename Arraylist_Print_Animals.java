import java.util.ArrayList;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		ArrayList<String>animals=new ArrayList<String>();
		animals.add("Dog");
		animals.add("cat");
		animals.add("tiger");
		animals.add("lion");
		for(int i=0;i<animals.size();i++)
		{
		    System.out.println(animals.get(i));
		    
		}
		for(String value:animals)
		{
		    System.out.println(value);
		    
		}
	}
}
