class Leap
{
	public static void main(String [] args)
	{
		int s=1900,e=2024;
System.out.println("The leaf year from "+s+" to "+e+" : ");
		while(s<=e)
		{
			if(((s%4)==0) && ((s%100)!=0) ||((s%400)==0))
			{
				System.out.println(s+" is Leap year");
				
			}
			s++;
		}
	}
}