class m16 
{
	public static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	public static double add(float a, double b)
	{
		double sum= a+b;
		return sum;
	}
	public static String add(String a, char b)
	{
		String sum=a+b;
	    return sum;
    }
	public static void main(String[] args) 
	{
		System.out.println(add(100,200));
		System.out.println(add(25.5f,125.456));
		System.out.println(add("java",'$'));
	}
}
