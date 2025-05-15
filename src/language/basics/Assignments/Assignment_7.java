package language.basics.Assignments;

public class Assignment_7 
{
	public static void main(String[] args) 
	{
		String customerName="John Doe";
		int creditScore=720;
		float income=55000f;
		boolean isEmployed=false;
		float debtToIncomeRatio=35.0f;
		System.out.println("Evaluation of Eligibility criteria for Loan approval for " + customerName);
		if(creditScore>750) 
		{
			System.out.println("Excellent credit score, Loan approved");
			
		}
		else if(creditScore>=650) 
		{
			if(income>=50000) 
			{
				if(isEmployed) 
				{
					if(debtToIncomeRatio<40) 
					{
						System.out.println("Loan is Approved");
						
					}
					else 
					{
						System.out.println("Loan is denied: debt to income ratio is too high");
					}
				
				}
				else 
				{
					System.out.println("Loan is denied:Customer is not employeed");
					
				}	
			}
			else 
			{
				System.out.println("Loan is denied: income is less than 50,000");
			}	
		}
		else 
		{
			System.out.println("Loan is denied:credit score is less than 650");
		}
	}
	

}
