package language.basics.Assignments;

public class Assignment_6 
{

	public static void main(String[] args) 
	{
	String []studentName= {"Suresh","Mahesh","Naresh"};
	int []marks= {75,80,82};
	
	for(int i=0;i<=2;i++) 
	{
		marks[i]+=10;
	}
	int allMarks=marks[0]+marks[1]+marks[2];
	System.out.println("Updated Marks: ");
	System.out.println(studentName[0]+ ":" +marks[0]);
	System.out.println(studentName[1]+ ":" +marks[1]);
	System.out.println(studentName[2]+ ":" +marks[2]);
	
	float average=allMarks/3;
	System.out.println("Average Marks: "+average);
	
	
	
	
	
	


	}

}
