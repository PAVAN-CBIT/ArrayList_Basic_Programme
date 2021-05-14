import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		ArrayList<String>animals = new ArrayList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("lion");
		animals.add("tiger");
		
		
	    	for(int i=0;i<animals.size();i++)
		   {
		    
		    System.out.println(animals.get(i));
		    
		   }
		
	}
}
