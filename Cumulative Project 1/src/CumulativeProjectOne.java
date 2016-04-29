import java.util.Scanner;

public class CumulativeProjectOne
	{
        static String name;
		public static void main(String[] args)
			{
            greetPlayer();
            askChoices();
			}
		public static void greetPlayer()
		    {
		    Scanner userInput = new Scanner (System.in);
			System.out.println("Hello, What is your name?");
			name = userInput.nextLine();
			int number = (int)(Math.random()*5)+1;
		    String [] compliments = {"You rock!", "you are amazing!", " I like your eyes.", "looking good today."}; 				
		    int randomNumber = (int)(Math.random()*4);
		    int compliments1 = randomNumber;
		    System.out.println("Hello, " + name + ", " + compliments[compliments1]);
			}
	      public static void askChoices()
			   {
			   Scanner userInput = new Scanner (System.in);
			   System.out.println("How many choices they are trying to decide between?");
			   int choices = userInput.nextInt();
			   String choiceArray[] = new String[choices];
			   int option = 1;
			   for (int i = 0; i < choiceArray.length; i++)
				   {
					if( i < choiceArray.length);
					  {
					   System.out.println("What is choice number " + option + "?");
					   Scanner userInput1 = new Scanner (System.in);
					   choiceArray[i] = userInput1.nextLine();
					   option++;
					  }
				   }
			   int randomNumber = (int)(Math.random()*choiceArray.length);
			   int choice1 = randomNumber;
			   System.out.println(name + ", you should pick " + choiceArray[choice1] + "." );
			   }

	  }