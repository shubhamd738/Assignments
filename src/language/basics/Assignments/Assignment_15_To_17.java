package language.basics.Assignments;

public class Assignment_15_To_17 
{

	public static void main(String[] args) 
	{
		String sentence="Java programming is fun and challaging";
	//1)Count the Total number of words in the Sentence
		
		System.out.println(sentence.length());
		
	//2)Print sentence words in reverse order
		int lenth=sentence.length();
		String reverseSentence="";
		
		for(int i=lenth-1;i>=0;i--) 
		{
			reverseSentence=reverseSentence+sentence.charAt(i);
			
		}
		System.out.println("Reverse of Sentence is: "+ reverseSentence);
		
	//3)Program for search all occurrence of word "Java"	
		
		String paragraph="Java is a popular programming language. Java is used for Web development"
				   + 	 "mobile application and more";
	
		String word="Java";
		
	//4) Pyramid Pattern(Can't print need help)
		
		int n=5;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n-1;j++) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
