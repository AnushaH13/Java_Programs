class m7 
{
	public static void concat(String m, char n, boolean o)
	{
		String s = m+n+o;
		System.out.println(s);
		//System.out.println(s);
	}
	public static void main(String[] args) 
	{
		concat("java" ,'$' , true);
		concat("python" , '@' , false);
	}
}
