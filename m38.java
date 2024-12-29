class m38 
{
	int a=10;
	public m38()
	{
		System.out.println("From constructor of m38");
	}
	public static void main(String[] args) 
	{
		m38 ob1=new m38();
		m38 ob2=new m38();
		m38 ob3=new m38();
		System.out.println(ob1.a);
	}
}
