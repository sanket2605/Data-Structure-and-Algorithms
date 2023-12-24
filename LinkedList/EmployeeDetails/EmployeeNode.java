public class Employee 
{
	private int id,salary;
	private String name,gender;
	
	Employee next;
	
	public Employee() 
	{
		super();
		this.id = 0;
		this.salary = 0;
		this.name = null;
		this.gender = null;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary) 
	{
		this.salary = salary;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String toString() 
	{
		return "[ "+id+"\t"+name+"\t"+gender+"\t"+salary+" ]";
	}	
}
