class m41 
{
	int a;
	float b;
	public m41(int x,float y)
	{
       a=x;
	   b=y;
	}
	public static void main(String[] args) 
	{
		m41 ob1=new m41(100,25.5f);
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println("----------------");
		m41 ob2=new m41(200,35.5f);
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		System.out.println("----------------");
		m41 ob3=new m41(300,35.5f);
		System.out.println(ob3.a);
		System.out.println(ob3.b);
		System.out.println("----------------");
	}
}