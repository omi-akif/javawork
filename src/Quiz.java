public class Quiz {


	public static void main(String[] args) {
		
		//Initialize a question variable of MultipleChoiceQuestion type
		
		Question question;
		
		//Question 1
//		
		question = new MultipleChoiceQuestion("What does Computer Science mean to you?", "Programming", "Gaming", "Streaming", "Teaching", "Desigining", "a");
//		
//		
		question.check();
//		
//		
//		//Question 2
//		
		question = new MultipleChoiceQuestion("What is degree of a quadratic function?", "one", "two","three", "four", "five", "b");
//		
//		
		question.check();
//		
//		
//		//Question 3
		question = new MultipleChoiceQuestion("What is two plus two?", "one", "two","three", "four", "five", "d");
		
		question.check();
//		
//		//Question 4
//		
		question = new MultipleChoiceQuestion("Why study programming?" ,"job", "learn", "think", "cook", "clean", "a");
		
		question.check();
//		
//		
//		//Question 5
//		
		question = new MultipleChoiceQuestion("What is an inverse function?", "Don't know", "Don't care", "Necessary?", "To compose" , "None of the above", "e");
		
		question.check();
//		
//		//The results
//		
		question = new TrueFalseQuestion("Is the program okay?", "TRUE");
		
		question.check();
//		
		question = new TrueFalseQuestion("Is it okay to lie?", "FALSE");
		
		question.check();
//		
		question = new TrueFalseQuestion("Is it okay to okay steal", "FALSE");
		
		question.check();
		
		question = new TrueFalseQuestion("Will you be okay?", "TRUE");
		
		question.check();
		
		question = new TrueFalseQuestion("Do you know the direction?", "TRUE");
		
		question.check();
		
		MultipleChoiceQuestion.showResults();
		
		
		
	} //End of main method

}//End of quiz class
