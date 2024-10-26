package collection.listclasses;

import java.util.Comparator;

public class EmpId implements Comparator {
int status;
	@Override
	public int compare(Object o1, Object o2) {
	
		Emp e1=(Emp)o1;
		Emp e2=(Emp)o2;
		if(e1.empId==e2.empId)
		{
			status=0;
		}
		else if(e1.empId>e2.empId)
		{
			status=1;
		}
		else if(e1.empId<e2.empId)
		{
			status=-1;
		}
		return status;
	}

}
