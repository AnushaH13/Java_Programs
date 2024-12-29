class m40 
{
	public m40()
	{
		System.out.println("From constructor-1");
	}
	public m40(int a)
	{
		System.out.println("From constructor-2");
	}
	public m40(int a,float b)
	{
		System.out.println("From constructor-3");
	}
	public static void main(String[] args) 
	{
		m40 ob1=new m40();
		m40 ob2=new m40(100);
		m40 ob3=new m40(1,1.1f);
	}
}
