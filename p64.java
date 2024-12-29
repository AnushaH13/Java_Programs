class p64 
{
	public static void main(String[] args) 
	{
		int row=3;
		int col=3;
		int i=1;
		while(i<=row)
		{
			int j=1;
		while(j<=col)
			{
			if(i==2&&j==2)
			{
				break;
			}
			System.out.print('*');
			j++;
			}
		System.out.println();
			i++;
		}
			
	}
}
