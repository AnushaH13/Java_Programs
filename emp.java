class emp
{
	String ename;
	int eid;
	double sal;
	public emp(String ename,int eid,double sal)
	{
		this.ename=ename;
		this.eid=eid;
		this.sal=sal;
	}
	public static void main(String[] args) 
	{
		emp e1=new emp("sam",111,20000.00);
		emp e2=new emp("daizy",222,300000.0);
		emp e3=new emp("megha",333,250000.0);
		System.out.println( e1.ename + ", " + e1.eid + ", " + e1.sal);
		System.out.println( e2.ename + ", " + e2.eid + ", " + e2.sal);
		System.out.println( e3.ename + ", " + e3.eid + ", " + e3.sal);
	}
}