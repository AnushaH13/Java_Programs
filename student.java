class student 
{
	String sname;
	int regno;
	String branch;
	public student(String sname,int regno,String branch)
	{
		this.sname=sname;
		this.regno=regno;
		this.branch=branch;
	}
	public static void main(String[] args) 
	{
		student s1=new student("sachin",111,"BCA");
		student s2=new student("naga",222,"MCA");
		student s3=new student("subbu",333,"ECE");
		System.out.println("studentName=" + s1.sname + ", " + "regNo=" + s1.regno + ", " + "branch=" + s1.branch);
		System.out.println("studentName=" + s2.sname + ", " + "regNo=" + s2.regno + ", " + "branch=" + s2.branch);
		System.out.println("studentName=" + s3.sname + ", " + "regNo=" + s3.regno + ", " + "branch=" + s3.branch);
	}
}
