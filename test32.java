import java.util.Scanner;


public class test32 {
	
	public void conversation() {
		
		Scanner input = new Scanner(System.in);

		int loop = 0;

		while (loop > 100) { 

		}


		System.out.println("What is your name?");
		
		String userName = input.nextLine();
		
		System.out.println("You're name is " + userName + (".") );
		
		System.out.println("How are you feeling today?");

		String userAnswer = input.nextLine();

		if (userAnswer.equals ("good") || userAnswer.equals ("great")  || userAnswer.equals("fucking awesome") || userAnswer.equals("awesome") ) {

			System.out.println("I'm glad to hear that, " + userName + " I'm feeling " + userAnswer + (" myself") );


			System.out.println("How old are you?");



			int userAge = input.nextInt();	


			System.out.println("Oh you're " + userAge + ", yea I had a " + userAnswer + " year when I was that old, I bet you will too.");




		}





		else if (userAnswer.equals("bad") || userAnswer.equals("not well") || userAnswer.equals("horrible")
				|| userAnswer.equals("fucking awful") ) {


			System.out.println("I'm so sorry to hear that " + userName + (", but hey at least tomorrow's another day. How old are you?") );

			int userAge = input.nextInt();


			System.out.println("Oh you're " + userAge + ", yea I had a rough year when I was that old, im sure it'll get better though."); 

				



		}





		else  {

			System.out.println( "I'm sorry my vocabulary is limited, so I don't understand what you mean by ''" + userAnswer + "'' :(");

			System.out.println("Do you want to try again? type true for yes and false for no.");
			
			boolean userTorf = input.nextBoolean();
			
			if (userTorf == true) {
				
				test32 conversation = new test32();
				
				conversation.conversation();
				
			}

			
				
			



		}
		
	}

}
