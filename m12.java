class m12 
{
	public static String concat(String m,char n,boolean o)
	{
		String s=m+n+o;
		return s;
	}

	public static void main(String[] args) 
	{
		System.out.println(concat("java",'$',true));
		System.out.println(concat("python",'@',false));
	}
}
