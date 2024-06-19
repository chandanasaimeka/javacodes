class Ncr
{
	public static void main(String [] args)
	{
		int n=10,r=8,i=1,m1=1,m2=1,m3=1,diff=n-r;
		
		while(i<=n)
		{
			m1*=i;//m1=m1*i
			i++;
		}
		i=1;
		while(i<=r)
		{

			m2*=i;//m2=m2*i
			i++;
		}
		i=1;
		while(i<=diff)
		{
			m3*=i;//m3=m3*i
			i++;
		}
		int res=m1/(m2*m3);
		

System.out.println(m1+" "+m2+" "+m3);
System.out.println(res);
	}
}