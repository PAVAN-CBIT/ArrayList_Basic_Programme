import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) 
	{
		ArrayList words=new ArrayList();
		words.add(10);
		words.add(15);
		words.add(20);
		
		Integer item1 =(Integer)words.get(0);
		Integer item2=(Integer)words.get(1);
		System.out.println(item1+item2);
		
	}
}
