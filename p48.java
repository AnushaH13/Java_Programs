class p48 
{
	public static void main(String[] args) 
	{
		int age=16;
		boolean eid=true;
		if (age>=18)
		{
			if (eid)
			{ 
				System.out.println("eligible for voting");
			}
			else
			{
				System.out.println("not eligible for voting");
			}
		}
		else
		{
			System.out.println("not eligible for voting");
		}
	}
}
