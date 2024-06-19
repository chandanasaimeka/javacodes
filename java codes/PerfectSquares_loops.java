class PerfectSquares_loops
{
	public static void main(String args[])
	{
		int s=1,e=1000;
		System.out.println("The Following are perfect Squares from "+s+" to "+e+" : ");
		while(s<=e)
		{
			int sq=(int)(Math.sqrt(s));
			int sq1=(int)Math.pow(sq,2);
			if(s==sq1)
			{
				System.out.println(s);
			}
			s++;
		}
	}
}