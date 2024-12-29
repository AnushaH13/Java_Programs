class bank{
	public float roi()
	{
		return 0.0f;
	}
}
class icici extends bank{
	public float roi()
	{
		return 5.2f;
	}
}
class hdfc extends bank{
	public float roi()
	{
		return 8.4f;
	}
}
class axis extends bank{
	public float roi()
	{
		return 6.4f;
	}
}
public class Poly {
	public static void main(String[]args)
	{
		icici ob1=new icici();
		hdfc ob2=new hdfc();
		axis ob3=new axis();
		System.out.println(ob1.roi());
		System.out.println(ob2.roi());
		System.out.println(ob3.roi());
	}

}