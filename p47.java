class p47 
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		if (false)
		{
			System.out.println(1);
			if(false)
			{
				System.out.println(2);
			}
			else
			{
				System.out.println(3);
			}
			System.out.println(4);
		}
		else 
		{
			System.out.println(5);
			if(true)
			{
				System.out.println(6);
			}
			System.out.println(7);
		}

		System.out.println("main end");
	}
}
