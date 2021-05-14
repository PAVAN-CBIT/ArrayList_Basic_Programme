import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		ArrayList<vehicle>vehicles=new ArrayList<vehicles>();
		vehicle vehicle2 =new vehicle("Toyota","camery",12000,false);
		vehicle.add (new vehicle("Honda","accord",15000,false));
		vehicle.add(vehicle2);
		vehicle.add (new vehicle("Jeap","Wrangler",17000,true));
		for(vehicle car:vehicles)
		{
		    
		    System.out.println(car);
		}
		
		
		
	}
}
public class vehicle
{
    
    String make;
    String model;
    int price;
    boolean fourWdrive;
    
    public StringtoString()
    {
        return"Vehicle[make"=+make+",model"=+model+",price"=+price+",fourWdrive"=+fourWdrive+"]";
        
    }
    
    public vehicle(String make,String model,int price,boolean fourWdrive)
    {
        super();
        this.make=make;
        this.model=model;
        this.price=price;
        this.fourWdrive=foueWdrive;
        
        
    }
    public String getMake()
    {
       return make; 
        
    }
    public void setMake(String make)
    {
        this.make=make;
    }
    public String getModel()
    {
        return model;
        
    }
    public void setModel(String model)
    {
        this.model=model;
        
    }
    public int getPrice()
    {
        
        return price;
    }
    public void setPrice(int price)
    {
        
        this.price=price;
    }
    public boolean getfourWdrive()
    {
        
        return price;
    }    
    public void setfourWdrive(boolean fourWdrive)
    {
        
        this.fourWdrive=fourWdrive;
    }
        
}


}
