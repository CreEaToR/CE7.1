import java.util.Scanner;

public class calculate{

    public static void main(String args[]){
		


	//import scanner		

	Scanner input = new Scanner(System.in);

	//Assigning my variables

	int [] num = new int[4];

	int sum = 0;

	int average = 0;

	int max = 0;

	int min = num[0];

	int median = 0;

	System.out.println("Enter 5 value.");


   
		        for(int i = 0; i<5;i++)
    			{



			//Adding values and finding the sum

			
			System.out.println("Value" + i);
			
			num[i] = input.nextInt();	

			sum = sum + num[i];



			//finding max

			if(num[i]>=max)
			{
			max = num[i];
			}

			//finding min

			if(num[i]<=min)	
			{
			min = num[i];	
			}	
			

			//finding medium
				
			if(num[i]>=max && num[i]<=min)
			{
			median = num[i];
			}	





			}

			

				
                        

		//LIST THE CALUCULATIONS

		System.out.println("The sum is: " + sum);

		System.out.println("Your average is: " + (sum/5));

		System.out.println("The max is: " + max);

		System.out.println("The min is: " + min);
						
						
						
	  	
						
						
						
						
						}


						}
			

