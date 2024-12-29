class m23 
{
	static int a=test();
	public static int test()
	{
		System.out.println("From test");
	    return 100;
	}
	public static void main(String[] args) 
	{
		System.out.println("From Main Begin");
		System.out.println(a);
		System.out.println("From Main End");
	}
}
