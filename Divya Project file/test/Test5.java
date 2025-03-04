package test;

public class Test5 {

	public static void main(String[] args) {
		boolean kfc = true;
		boolean chicken = false;
		boolean pepsi = true;
		
		if(kfc) 
		{
		  System.out.println("Enter into KFC");
		  
		  if(chicken) 
		  {
		    System.out.println("Eating Chicken");
		    
		    if(pepsi) 
		    {
		      System.out.println("Drinking pepsi");
		    }
		    else
		    {
		    	System.out.println("water");
		    }
		  } else if(pepsi) {
			  System.out.print("Drinking Pepsi only");
		  }
		}
		

	}

}
