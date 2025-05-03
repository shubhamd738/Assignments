package language.basics;

public class Assignment_2 
{

	public static void main(String[] args) 
	{ 
		String academics[][][]=new String[5][2][6];
		//Semester 1
		
		academics[0][0][0]="Mathematic 1";
		academics[0][1][0]="Pass(78)";
		
		academics[0][0][1]="Physics";
		academics[0][1][1]="Pass(85)";
		
		academics[0][0][2]="Chemistry";
		academics[0][1][2]="Fail(21)";
		
		academics[0][0][3]="Computer Programming";
		academics[0][1][3]="Pass(74)";
		
		academics[0][0][4]="Engieering Drawing";
		academics[0][1][4]="Pass(88)";
		
		academics[0][0][5]="Basic Electrical Engineering";
		academics[0][1][5]="Pass(79)";
		
		
		//Semester 2
		academics[1][0][0]="Mathematics 2";
		academics[1][1][0]="Pass(82)";
		
		academics[1][0][1]="Mechanics";
		academics[1][1][1]="Pass(77)";
		
		academics[1][0][2]="Environmental Science";
		academics[1][1][2]="Pass(93)";
		
		academics[1][0][3]="Basic Electronics";
		academics[1][1][3]="Fail(19)";
		
		academics[1][0][4]="Engineeing Physics";
		academics[1][1][4]="Fail(24)";
		
		academics[1][0][5]="Engineering Graphics";
		academics[1][1][5]="Pass(90)";
		
		//semester 3
		academics[2][0][0]="Data Structures";
		academics[2][1][0]="Pass(88)";
		
		academics[2][0][1]="Discrete Mathematics";
		academics[2][1][1]="Pass(81)";
		
		academics[2][0][2]="Digital Electronics";
		academics[2][1][2]="Pass(76)";
		
		academics[2][0][3]="Operating System";
		academics[2][1][3]="Fail(32)";
		
		academics[2][0][4]="Signals & Systems";
		academics[2][1][4]="Pass(85)";
		
		academics[2][0][5]="Object Oriented Programming";
		academics[2][1][5]="Pass(78)";
		
		//Semester 4
		academics[3][0][0]="Algorithms";
		academics[3][1][0]="Pass(91)";
		
		academics[3][0][1]="Computer Networks";
		academics[3][1][1]="Pass(73)";
		
		academics[3][0][2]="DataBase Systems";
		academics[3][1][2]="Fail(19)";
		
		academics[3][0][3]="MicroProcessors";
		academics[3][1][3]="Pass(80)";
		
		academics[3][0][4]="Communication Engineering";
		academics[3][1][4]="Pass(76)";
		
		academics[3][0][5]="Software Engineeing";
		academics[3][1][5]="Pass(87)";
		
		//Semester 5
		academics[4][0][0]="Probablity & Statistics";
		academics[4][1][0]="Pass(86)";
		
		academics[4][0][1]="Machine Learning";
		academics[4][1][1]="Pass(88)";
		
		academics[4][0][2]="Compiler Design";
		academics[4][1][2]="Pass(84)";
		
		academics[4][0][3]="Theory of Computation";
		academics[4][1][3]="Pass(95)";
		
		academics[4][0][4]="Embedded Systems";
		academics[4][1][4]="Pass(73)";
		
		academics[4][0][5]="Computer Graphics";
		academics[4][1][5]="Pass(90)";
		
		//Print Semester 2, Subject 4 and 5 names
		
		System.out.println(academics[1][0][3]);
		System.out.println(academics[1][0][4]);
		
		//Print Marks of Semester-4, Subject-3 & 6
		
		System.out.println(academics[3][1][2]);
		System.out.println(academics[3][1][5]);
		
		
		
		
		
		

	}

}
	