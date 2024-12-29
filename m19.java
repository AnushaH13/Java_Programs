class m19
{
	static int  a=test1(10,20);
		static int  b=test1(10,20)+test2(15,30);
		public static int test1(int m,int n)
	{
			return m+n+test2(m,n);
	}
      public static int test2(int x,int y)
	{
		  return x+y+10;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(m19.a);
		System.out.println(m19.b);
	}
}
