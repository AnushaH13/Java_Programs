/*class ibm 
{
    public static void main(String[] args) 
    {
        int num = 10;
        for (int i = 1; i <= num; i++) 
        {
            int count = 0;
            for (int j = 1; j <= i; j++) 
            {
                if (i % j == 0) 
                {
                    count++;
                }
            }
            if (count == 2) 
            {
                System.out.println(i);  // Print only if i has exactly 2 divisors
            }
        }
    }
}
*/
/*import java.util.Scanner;
class ibm
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int rem=0;
		int rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("its a palindrom number");
		else
			System.out.println("its not a palindrom number");

	
	}
}*/
import java.util.*;
class ibm
{
	public static void main(String[]args)
	{
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int rev=0,rem=0;
		while (num>0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if(temp==rev)
			System.out.println("its a palindrom number");
		else
			System.out.println("its not a palindrom number");

	}
}
