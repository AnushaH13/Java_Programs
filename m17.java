class m17 
{
	public static void main(String[] args) 
	{
		System.out.println("from main-1");
		main();
		main(90);
	}
	public static void main()
	{
		System.out.println("from main-2");
	}
	public static void main(int a)
	{
		System.out.println("from main-3");
	}
}
