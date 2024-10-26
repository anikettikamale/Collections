package collection.listclasses;

public class Emp1  implements Comparable{

	int empId;
	String empName;
	Emp1(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	@Override
	public int compareTo(Object o) {
		
	int status=0;
	Emp1 e=(Emp1)o;
	if(e.empId==empId)
	{
		status=0;	
	}
	else if(e.empId>empId)
	{
	status=-1;	
	}
	else if(e.empId<empId)
	{
	status=1;	
	}	
		
		return status;
	}
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
}
