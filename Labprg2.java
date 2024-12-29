class Labprg2 
{
	public double add(double a,double b)
	{
		return a+b;
	}
	public double subtract(double a,double b)
	{
		return a-b;
	}
	public double multiply(double a,double b)
	{
		a*b;
	}
	public double divide(double a,double b)
	{
		if(b==0)
		{
			throw new IllegalArgumentException("Division by zero is not allowed.");
		}
		return a/b;
	}

}
import arithmetic.Labprg2;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) 
	{
		Labprg2 claculator=new Labprg2();
		Scanner scanner=new Scanner(System.in);

		System.out.println("Arithmetic Calculator");
	}
}
