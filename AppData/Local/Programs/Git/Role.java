import java.util.Scanner;

public class Role{

	public static void main(String args[]){
	
	
	Scanner input = new Scanner(System.in);

	System.out.println("Please enter your role.");
	System.out.println("");
	System.out.println("1. Administrator");
	System.out.println("2. Faculty");
	System.out.println("3. Staff");
	System.out.println("4. Student");
	System.out.println("5. Guest");

	int holdRole = input.nextInt();

	switch(holdRole){
	case 1:
		System.out.println("Welcome Administrator");
		break;
	case 2: 
		System.out.println("Welcome Faculty");
		break;
	case 3:
		System.out.println("Welcome Staff");
		break;
	case 4: 
		System.out.println("Welcome Student");
		break;
	case 5:
		System.out.println("Welcome Guest");
		break
	default:
		System.out.println("Error, no role selected");
		break;
	
	
	
	
	
	
	}
	
	
	
	
	}

}



