class m44 
{
	int a;
	int b;
	public m44(int x)
	{
		System.out.println("From constructor-1");
		this.a=x;
	}
	public m44(int y,int z)
	{
		this(y);
		System.out.println("From constructor-2");
		this.b=z;
	}
	public static void main(String[] args) 
	{
		m44 ob=new m44(100,200);
		System.out.println(ob.a);
		System.out.println(ob.b);
	}
}
