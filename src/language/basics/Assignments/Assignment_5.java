package language.basics.Assignments;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Assignment_5 
{

	public static void main(String[] args) 
	{
		//STUDENT DETAILS
		
		Map<String,String> StudentDetails1=new HashMap<String,String>();
		StudentDetails1.put("Name", "John Doe");
		StudentDetails1.put("Age", "20");
		StudentDetails1.put("Gender", "Male");
		StudentDetails1.put("Roll Number", "12345");
		StudentDetails1.put("Grade", "A");
		StudentDetails1.put("Major", "Computer Science");
		StudentDetails1.put("GPA", "3.8");
		StudentDetails1.put("Email", "John@exam.com");
		StudentDetails1.put("Contact Number", "9876543120");
		StudentDetails1.put("Address","123,elm st");
		
		Map<String,String> StudentDetails2=new HashMap<String,String>();
		StudentDetails2.put("Name", "Jane Smith");
		StudentDetails2.put("Age", "21");
		StudentDetails2.put("Gender", "Female");
		StudentDetails2.put("Roll Number", "12346");
		StudentDetails2.put("Major", "Mathamatics");
		StudentDetails2.put("GPA", "3.5");
		StudentDetails2.put("Email", "Jane@exam.com");
		StudentDetails2.put("Contact Number", "9632587453");
		StudentDetails2.put("Address", "124 elm st");
		
		Map<String,String> StudentDetails3=new HashMap<String,String>();
		StudentDetails3.put("Name", "Mike Brown");
		StudentDetails3.put("Age", "22");
		StudentDetails3.put("Gender", "Male");
		StudentDetails3.put("Roll Number","12347");
		StudentDetails3.put("Major", "Physics");
		StudentDetails3.put("GPA", "3.4");
		StudentDetails3.put("Email", "Mike@exam.com");
		StudentDetails3.put("Contact Number","1234567890");
		StudentDetails3.put("Address", "125,elm st");
		
		//EMPLOYEE DETAILS
		Map<String,String>EmpDetails1=new HashMap<String,String>();
		EmpDetails1.put("Employee ID", "E001");
		EmpDetails1.put("Name", "Alice Green");
		EmpDetails1.put("Age", "30");
		EmpDetails1.put("Gender", "Male");
		EmpDetails1.put("Department", "Engineering");
		EmpDetails1.put("Position", "Software Engineer");
		EmpDetails1.put("Salary", "75000");
		EmpDetails1.put("Email", "alice.company.com");
		EmpDetails1.put("Contact Number", "1234567890");
		
		Map<String,String>EmpDetails2=new HashMap<String,String>();
		EmpDetails2.put("Employee ID", "E002");
		EmpDetails2.put("Name", "Bob Johnson");
		EmpDetails2.put("Age", "35");
		EmpDetails2.put("Gender", "Male");
		EmpDetails2.put("Department", "Marketing");
		EmpDetails2.put("Position", "Marketing Manager");
		EmpDetails2.put("Salary", "85000");
		EmpDetails2.put("Email", "Bob.company.com");
		EmpDetails2.put("Contact Number", "1234567890");
		
		Map<String,String>EmpDetails3= new HashMap<String,String>();
		EmpDetails3.put("Employee ID", "E003");
		EmpDetails3.put("Name", "Carol White");
		EmpDetails3.put("Age", "28");
		EmpDetails3.put("Gender", "Female");
		EmpDetails3.put("Department", "Sales");
		EmpDetails3.put("Position", "Sales Executive");
		EmpDetails3.put("Salary", "65000");
		EmpDetails3.put("Email", "Carol.company.com");
		EmpDetails3.put("Contact Number", "1234567890");
		
		//PRODUCT DETAILS
		Map<String,String>ProductDetails1=new HashMap<String,String>();
		ProductDetails1.put("Product ID", "P001");
		ProductDetails1.put("Name", "LapTop");
		ProductDetails1.put("Category", "Electronics");
		ProductDetails1.put("Price", "$1200");
		ProductDetails1.put("Stock Quantity", "50");
		ProductDetails1.put("Supplier", "Tech Supplies");
		ProductDetails1.put("Warranty", "2 Years");
		ProductDetails1.put("Rating", "4.5");
		ProductDetails1.put("Manufacturing Date", "01/15/2020");
		ProductDetails1.put("Expiry Date", "01/15/2022");
		
		Map<String,String>ProductDetails2=new HashMap<String,String>();
		ProductDetails2.put("Product ID", "P002");
		ProductDetails2.put("Name", "Desk Chair");
		ProductDetails2.put("Category", "Furniture");
		ProductDetails2.put("Price", "$150");
		ProductDetails2.put("Stock Quantity", "100");
		ProductDetails2.put("Supplier", "Office Depot");
		ProductDetails2.put("Warranty", "1 Year");
		ProductDetails2.put("Rating", "4");
		ProductDetails2.put("Manufacturing Date", "01/15/2020");
		ProductDetails2.put("Expiry Date", "01/15/2021");
		
		Map<String,String>ProductDetails3=new HashMap<String,String>();
		ProductDetails3.put("Product ID", "P003");
		ProductDetails3.put("Name", "Coffee Maker");
		ProductDetails3.put("Category", "Kitchen");
		ProductDetails3.put("Price", "$75");
		ProductDetails3.put("Stock Quantity", "200");
		ProductDetails3.put("Supplier", "KitchenWorld");
		ProductDetails3.put("Warranty", "2 Years");
		ProductDetails3.put("Rating", "4.2");
		ProductDetails3.put("Manufacturing Date", "01/15/2020");
		ProductDetails3.put("Expiry Date", "01/15/2022");
		
		//Student Details
		List<Map<String,String>>StudentList=new ArrayList<>();
		StudentList.add(StudentDetails1);
		StudentList.add(StudentDetails2);
		StudentList.add(StudentDetails3);
		
		//Employee Details
		List<Map<String,String>>EmployeeList=new ArrayList<>();
		EmployeeList.add(EmpDetails1);
		EmployeeList.add(EmpDetails2);
		EmployeeList.add(EmpDetails3);
		
		//Product Details
		List<Map<String,String>>ProductList=new ArrayList<>();
		ProductList.add(ProductDetails1);
		ProductList.add(ProductDetails2);
		ProductList.add(ProductDetails3);
		
		Map<String,List<Map<String,String>>>AllDetails=new HashMap<String,List<Map<String,String>>>();
		AllDetails.put("Student Data", StudentList);
		AllDetails.put("Employee Data", EmployeeList);
		AllDetails.put("Product Data", ProductList);
		
		System.out.println(AllDetails.get("Product Data").get(1).get("Supplier"));

		
	}

}
