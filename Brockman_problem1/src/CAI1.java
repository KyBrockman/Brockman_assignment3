import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	
	static int randInt_1, randInt_2, answer, user_entry;
	static String problem;
	SecureRandom rand = new SecureRandom();
	Scanner scan = new Scanner(System.in);

	public CAI1() {
	}
	
	
	//Create a method called "quiz" that contains the program logic
	
	public void quiz() {
		this.askQuestion();
		//The program shall continue to ask the student to solve the
		//original multiplication problem until the student provides the correct answer
		while (!this.isAsnwerCorrect()){
			System.out.println(problem);
			this.readResponce();
			
			if(this.isAsnwerCorrect()) {
				break;
			}
			this.displayInorrectResponse();
			
		}
		this.displayCorrectResponse();
		//The program shall terminate when a correct response is provided by the student
		System.exit(0);
	}
		
	//Create a method called "askQuestion" that prints the problem to the screen
	public void askQuestion() {
		this.createProblem();
		problem =("How much is " + randInt_1 + " times " + randInt_2 + "?");
	}
	public void createProblem() {
		//The program shall generate random numbers with a SecureRandom object
		//A multiplication problem shall contain two numbers sampled from a
		//uniform random distribution in the range of 0 to 9 (inclusive)
		
		randInt_1 = rand.nextInt(10);
		randInt_2 = rand.nextInt(10);
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
		//The program shall display the message "Very good!" if the student provides a correct response
		System.out.println("Very good!");
	}
	
	//Create a method called "displayInorrectResponse" that prints out the response when a student enters an incorrect answer
	public void displayInorrectResponse() {
		//The program shall display the message "No. Please try again." if the student provides an incorrect response
		System.out.println("No. Please try again");
	}
	
	//Create a main method that runs your program by calling the "quiz" method
	
	public static void main(String args[]) {
		CAI1 quiz = new CAI1();
		quiz.quiz();
	}
		
}


