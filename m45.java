class m45 
{
	{
		System.out.println("From non static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("From Main");
		m45 ob1=new m45();
		m45 ob2=new m45();
		m45 ob3=new m45();
	}
}
