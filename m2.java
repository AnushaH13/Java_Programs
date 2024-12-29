class m2 
{
	public static void test1()
	{
		System.out.println("from test1 begin");
		test2();
		System.out.println("from test1 end");
	}
	public static void test2()
	{
		System.out.println("From test2");
	}
	public static void main(String[] args) 
	{
		System.out.println("from main begin");
		test1();
		System.out.println("from main end");
	}
}
