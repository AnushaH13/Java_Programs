class m33
{
	int a=100;
	public void test()
	{
		System.out.println("from test");
	}
	public static void main(String[]args)
	{
		m33 ob1=new m33();
		System.out.println(ob1);
		System.out.println(ob1.a);
		ob1.test();
		System.out.println("________________");
		m33 ob2=new m33();
		System.out.println(ob2);
		System.out.println(ob2.a);
		ob2.test();
		System.out.println("________________");
		m33 ob3=new m33();
		System.out.println(ob3);
		System.out.println(ob3.a);
		ob3.test();
		//System.out.println("________________");
	}

}
