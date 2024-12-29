class m43 
{
	public m43()
	{
		System.out.println("From constructor-1");
	}
	public m43(int a)
	{
		this();
		System.out.println("From construvtor-2");
	}
	public static void main(String[] args) 
	{
		m43 ob=new m43(100);
	}
}
