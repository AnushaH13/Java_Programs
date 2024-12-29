class p65
{
	public static void main(String[] args)
	{
		int i=1;
		System.out.println("Main Begin");
		while(i<=5)
		{
			if(i==3)
			{
		      i++;
			  continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Main End");
	}
}