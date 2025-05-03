package language.basics;

public class Arrays 
{

	public static void main(String[] args) 
	{
		/*String[] name= {"Shubham","Rutuja"};
		int[] emp_id= {101,102};
		
		System.out.println(name[0]);
		System.out.println(emp_id[1]);*/
		
		/*String[] emp_names=new String[4];
		emp_names[0]="Shubham";
		emp_names[1]="Rutuja";
		emp_names[2]="Tech";
		emp_names[3]="Hey";
		
		System.out.println(emp_names[0]);
		System.out.println(emp_names[3]);*/
		
		/******2D Arrays******/
		
		String[][] name=new String[2][3];
		
		name[0][0]="Shubham";
		name[0][1]="Rutuja";
		name[0][2]="Chandan";
		name[1][2]="Bharati";
		name[1][0]="Deelip";
		name[1][1]="Varsha";
		
		System.out.println(name[0][1]);
		System.out.println(name[0][2]);
		System.out.println(name[1][1]);
		System.out.println(name[0][0]);
		System.out.println(name[0][0]);
		System.out.println(name[1][2]);
		System.out.println(name.length);
		
		
		
		
		
		
		 
	}

}
