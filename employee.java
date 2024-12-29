class employee 
{
	static String name="Google";
	String ename;
	int eid;
	double sal;
	public static void work()
	{
		System.out.println("I am working for "+employee.name);
	}
	public void displayEmployeeInfo()
	{
		System.out.println("ename="+this.ename +" eid="+this.eid+ " sal="+this.sal);
	}
	public employee(String ename,int eid,double sal)
	{
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
	}
	public static void main(String[] args) 
	{
		employee e1=new employee("sachin",111,500000);
		employee e2=new employee("chethan",222,800000);
		employee e3=new employee("lavanya",333,500000);
		e1.displayEmployeeInfo();
		e1.work();
		System.out.println("--------------------------");
		e2.displayEmployeeInfo();
		e2.work();
		System.out.println("--------------------------");
		e3.displayEmployeeInfo();
		e3.work();
		System.out.println("--------------------------");
	}
}
