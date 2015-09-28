import javax.swing.JOptionPane;

public class StatementCE{

public static void main(String args[]){

int numPeople = Integer.`parseInt(JOptionPane.showInputDialog("Enter number of people"));

 int groupSize = 0;

	if(numPeople>10){

	  groupSize = numPeople/2;

           System.out.println(groupSize);


 }
	 else if(numPeople>3 && numPeople<10){

	groupSize = numPeople/3;

	 System.out.println(groupSize);

	 }
	else{



	 System.out.println("The number of people has to be at least 3");



	 }

		int numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Enter number of players"));

		int teamSize = 0;

		if(numPlayers>11 && numPlayers<55){

		 teamSize = numPlayers/11;

		 }else{


		teamSize = 1;

		System.out.println("Team size is one");



												 }



												}





											}

