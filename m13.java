class m13 
{
	public static int test(boolean cond)
	{
		if (cond)
			return 100;
		else
			return 2000;
	}
		
		
	public static void main(String[] args) 
	{
		System.out.println(test(false));
	}
}