class m21 
{
	static float x=2.5f;
	public static void main(String[] args) 
	{
		System.out.println(x);
		x=3.5f;
			test();
		System.out.println(x);
		x=5.5f;
         System.out.println(x);
	}
	public static void test()
	{
		System.out.println(x);
		x=4.5f;
	}
}
