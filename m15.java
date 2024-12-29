class m15
{
	public static void test()
	{
       System.out.println("from test-1");
	}
	public static void test(int a)
	{
		System.out.println("From test-2");
	}
	public static void test(int a, int b)
	{
		System.out.println("From test-3");
	}
	public static void main(String[] args) 
	{
		test();
		test(100);
		test(100,200);
	}
}
