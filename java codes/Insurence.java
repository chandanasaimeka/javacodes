class Insurence
{
	public static void main(String []args)
	{
		String s="married";
		String g="male";
		int age =40;
		
		if (s=="married")
		{
			System.out.println("Gets Insurance");
		}
		else if((s=="unmarried") && (g=="male") && (age>30))
		{
			System.out.println("Gets Insurance");
		}
		else if((s=="unmarried") && (g=="female") && (age>25))
		{
			System.out.println("Gets Insurance");
		}
		else
		{
			System.out.println(" Not Gets the  Insurance");
		}
	}
}