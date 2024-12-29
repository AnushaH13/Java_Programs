class m42 
{
	int a;
	public m42(int a)
	{
		this.a=a;
	}
	public static void main(String[] args) 
	{
		m42 ob1=new m42(100);
		System.out.println(ob1.a);
		m42 ob2=new m42(200);
		System.out.println(ob2.a);
	}
}
