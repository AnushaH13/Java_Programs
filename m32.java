class m32 
{
	static
	{
		System.out.println("From static block of m32");
	}
	static int b=200;
	public static void main(String[] args) 
	{
		System.out.println("from main of m32");
		System.out.println(m32.b);
		System.out.println("_____________________");
		System.out.println(m31.a);
		m31.test();
	}
}
