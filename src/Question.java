//import javax.swing.JOptionPane;

import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0; //Static variable
	static int nCorrect = 0;
	
	Question(String question){
		this.question = new QuestionDialog();
		
		this.question.setLayout(new GridLayout(0, 1));
		
		this.question.add(new JLabel("          " + question + "       ", JLabel.CENTER));
	}
	
	QuestionDialog question; //Instance variable when object is constructed
	String correctAnswer;//Instance variable when object is constructed
	
//	abstract String ask();
	
	String ask() {
		question.setVisible(true);
		return question.answer;
	}
	
	void check() {
		
		nQuestions += 1;
		
		String answer = ask();
		
		
//		System.out.println(answer); //Scaffolding
//		System.out.println(correctAnswer); //Scaffolding
		
		if(answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
	}//End of check method
	
	static void showResults(){
		JOptionPane.showMessageDialog(null, nCorrect+" correct out of " + nQuestions);
	}//End of show Result Method
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
}
