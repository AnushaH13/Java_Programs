import java.util.Scanner;
class Labprg1
{
	private String name;
	private double baseSlary;
	private double bonus;
	public Labprg1(String name,double baseSalary,double bonus){
		this.name=name;
		this.baseSalary=baseSalary;
		this.bonus=bonus;
	}
	public double claculateSlary(){
		return baseSlary+bonus;
	}
	public void displayInfo()
	{
		System.out.println("Employee name:%s%n",name);
		System.out.println("Base Salary:%.2f%n",baseSalary);
		System.out.println("Bonus:%.2f%n",bonus);
		System.out.println("total Salary:%.2f%n%n",calculateSalary());
	}
}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the of employees:");
		int n=scanner.nextInt();
		scanner.nextLine();
		employee[] employees=new employee[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee name: ");
			String name=scanner.nextLine();
		    System.out.println("Enter base salary: ");
			double baseSlary=scanner.nextDouble();
			System.out.println("Enter bonus(default is 0): ")
				double bonus=scanner.nextLine();
			employee[i]=new employee(name,baseSalary,bonus);
		}
		System.out.println("\n Employee Salary information:\n");
		for(employee emp : employees)
		{
			emp.dislayInfo();
		}
		scanner.close();

	}
}
