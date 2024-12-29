class m11 
{
	public static double product(int x,float y,double z)
	{
		double prod=x*y*z;
		return prod;
	}
	public static void main(String[] args) 
	{
		double p1=product(10,2.5f,23.545);
		System.out.println(p1);
		double p2=product(15,6.23f,45.123);
		System.out.println(p2);
	}
}
