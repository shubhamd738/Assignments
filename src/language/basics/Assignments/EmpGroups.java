package language.basics.Assignments;

public class EmpGroups 
{

	public static void main(String[] args) 
	{
		Employees obj= new Employees();
		String []EmployeesNames=new String[3];
		
		EmployeesNames[0]=obj.EmployeeName1;
		EmployeesNames[1]=obj.EmployeeName2;
		EmployeesNames[2]=obj.EmployeeName3;
		
		int []EmployeeID= new int[3];
		
		EmployeeID[0]=obj.EmployeeId1;
		EmployeeID[1]=obj.EmployeeId2;
		EmployeeID[2]=obj.EmployeeID3;
		
		System.out.println(EmployeesNames[0]+":"+EmployeeID[0]);
		System.out.println(EmployeesNames[1]+":"+EmployeeID[1]);
		System.out.println(EmployeesNames[2]+":"+EmployeeID[2]);
		
		
		
	}

}
