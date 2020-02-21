import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
	
	static int randInt_1, randInt_2, answer, user_entry, score, diff_lvl, product_range;
	static int num_Correct = 0;
	//static String problem;
	SecureRandom rand = new SecureRandom();
	Scanner scan = new Scanner(System.in);

	public CAI4() {
	}
	
	
	//Create a method called "quiz" that contains the program logic
	
	public void quiz() {
		boolean repeat = true;
		while(repeat) {
			this.readDifficulty();
			
			//The program shall ask the student to solve 10 different multiplication problems
			for(int i = 0; i<10; i++) {
				this.askQuestion();
				this.readResponce();
				if(this.isAsnwerCorrect()) {
					num_Correct++;
					this.displayCorrectResponse();
				}
				else
					this.displayInorrectResponse();
			}
			//The program shall display the student's score after the student 
			//has attempted to solve 10 problems
			//The student's score shall be the percentage of problems correctly solved
			score = (10*num_Correct)/100;
			System.out.println(score + "%");
			//The program shall display the message "Please ask your teacher for extra help." 
			//if the student's score is less than 75%
			//The program shall display the message "Congratulations, you are ready to go to 
			//the next level!" if the student's score is greater than or equal to 75%
			if(score>=75) {
				System.out.println("Congratulations, you are ready to go to the next level!");
			}
			else {
				System.out.println("Please ask your teacher for extra help.");
			}
			System.out.println("would you like to solve a new set of problems (Y/N)");
			if(scan.next().charAt(0)=='N'){
				repeat = false;
			}
		}
	}
		
	//Create a method called "askQuestion" that prints the problem to the screen
	public void askQuestion() {
		this.generateQuestionArguement();
		System.out.println("How much is " + randInt_1 + " times " + randInt_2 + "?");
	}
	public void generateQuestionArguement() {
		//The program shall generate random numbers with a SecureRandom object
		//A multiplication problem shall contain two numbers sampled from a
		//uniform random distribution in the range of 0 to 9 (inclusive)
		
		randInt_1 = rand.nextInt(product_range);
		randInt_2 = rand.nextInt(product_range);
		answer = randInt_1*randInt_2;
	}

	//Create a method called "readResponse" that reads the answer from the student
	public void readResponce() {
		user_entry = scan.nextInt();
	}	

	//Create a method called "isAsnwerCorrect" that checks to see if the student's 
	//answer matches the correct answer to the problem
	public boolean isAsnwerCorrect() {
		return (user_entry == answer);		
	}	
	
	

	
	//Create a method called "displayCorrectResponse" that prints out the response when 
	//a student enters a correct answer
	public void displayCorrectResponse() {
		//The program shall display a random positive message if the student 
		//provides a correct response
		int response = rand.nextInt(4)+1;
		switch(response) {
			case 1: System.out.println("Very good!");
			break;
			case 2: System.out.println("Excellent!");
			break;
			case 3: System.out.println("Nice work!");
			break;
			case 4: System.out.println("Keep up the good work!");
			break;
		}
	}
	
	//Create a method called "displayInorrectResponse" that prints out 
	//the response when a student enters an incorrect answer
	public void displayInorrectResponse() {
		//The program shall display a random negative message if the student 
		//provides an incorrect response
		int response = rand.nextInt(4)+1;
		switch(response) {
			case 1: System.out.println("No. Please try again.");
			break;
			case 2: System.out.println("Wrong. Try once more.");
			break;
			case 3: System.out.println("Don't give up!");
			break;
			case 4: System.out.println("No. Keep trying.");
			break;
		}
	}
	public void readDifficulty() {
		//The program shall ask the student to enter a difficulty level of 1, 2, 3, or 4
		System.out.println("What difficulty problem would you like (1-4)");
		diff_lvl = scan.nextInt();
				
		//A difficulty level of 1 shall limit random numbers to the range of 0-9, inclusive
		//A difficulty level of 2 shall limit random numbers to the range of 0-99, inclusive
		//A difficulty level of 3 shall limit random numbers to the range of 0-999, inclusive
		//A difficulty level of 4 shall limit random numbers to the range of 0-9999, inclusive
		switch(diff_lvl) {
			case 1: product_range = 10;
			break;
			case 2: product_range = 100;
			break;
			case 3: product_range = 1000;
			break;
			case 4: product_range = 10000;
			break;
		}
	}
	
	//Create a main method that runs your program by calling the "quiz" method
	
	public static void main(String args[]) {
		CAI4 quiz = new CAI4();
		quiz.quiz();
	}
		
}

