class p53 
{
	public static void main(String[] args) 
	{
		int a=100, b=50;
		char operator='/';
		switch (operator)
		{
		case '+':{
			       int sum=a+b;
		           System.out.println(sum+"sum");
				   break;
		         }
		case '-':{
			       int sub=a-b;
		           System.out.println(sub+"sub");
				   break;
		         }
	    case '*':{
			       int prod=a*b;
		           System.out.println(prod+"prod");
				   break;
		         }
		case '/':{
			       int div=a/b;
		           System.out.println(div+"div");
		         }
		
		}
	}
}
