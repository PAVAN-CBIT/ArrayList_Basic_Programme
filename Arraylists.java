import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList Number=new ArrayList();
		Number.add(10);
		Number.add(15);
		Number.add(20);
		Integer item1=(Integer)Number.get(1);
		Integer item2=(Integer)Number.get(2);
		System.out.println(item1+item2);
		
	}
}
