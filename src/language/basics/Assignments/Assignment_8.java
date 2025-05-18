package language.basics.Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment_8 
{

	public static void main(String[] args) 
	{
		int[]transaction= {50000,-2000,3000,-15000,-200,-300,4000,-3000};
		
		int totalNumberCredit=0;
		int totalNumberDebit=0;
		int totalAmountCredit=0;
		int totalAmountDebit=0;
		int suspiciousTras=0;
		int finalBalance=0;
		for(int number:transaction)
		{
			if(number>0) 
			{
				totalNumberCredit++;
				
			}
			if(number<0) 
			{
				totalNumberDebit++;
				
			}
		}
			for(int number1:transaction) 
			{
				if(number1>0) 
				{
					totalAmountCredit+=number1;
				}
				if(number1<0)
				{
					totalAmountDebit+=number1;
					
				}
				finalBalance=totalAmountCredit+totalAmountDebit;
				if(number1>10000) 
				{
					System.out.println("Suspicious Credit Transaction:" +number1);
					suspiciousTras++;
					
				}
				if(number1<-10000) 
				{
					System.out.println("Suspicious Debit Transaction:" +number1);
					suspiciousTras++;
				}
				
			}
			System.out.println("Total Number of Credit: "+totalNumberCredit);//3
			System.out.println("Total Number of Credit: "+totalNumberDebit);//5
			System.out.println("Total Amount Credit: "+totalAmountCredit);//57000
			System.out.println("Total Amount Debit: "+totalAmountDebit);//-20500
			System.out.println("Remaining Balance in Account: "+finalBalance);
			System.out.println("Number of suspicious transaction:" +suspiciousTras);//2
			
			
			
			
			
			
		
	}
}
