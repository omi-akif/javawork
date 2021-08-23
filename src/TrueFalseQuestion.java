//import javax.swing.JOptionPane;

import javax.swing.*;

public class TrueFalseQuestion extends Question {
	
	public TrueFalseQuestion(String question, String answer){
//		this.question = "TRUE or FALSE: " + question;
		
		super(question);
		
		JPanel buttons = new JPanel();
		
		
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		
		this.question.add(buttons);
		
		initQuestionDialog();
		
		
		if(answer.equals("TRUE")) {
			correctAnswer = "TRUE";
		}else if(answer.equals("FALSE")){
			correctAnswer = "FALSE";
		}
	}

	void addButton(JPanel buttons, String label) {
		// TODO Auto-generated method stub
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
		
	}

	
//	String ask() {
//		
//		question.setVisible(true);
//		
//		return question.answer;
////		while(true) {
////			String answer = JOptionPane.showInputDialog(question);
////			
////			answer = answer.substring(0, 1);
////			
////			answer = answer.toUpperCase();
////			
////			if(answer.equals("Y") || answer.equals("T")) {
////				return "TRUE";
////			}else if(answer.equals("N") || answer.equals("F")){
////				return "FALSE";
////			}else {
////				JOptionPane.showMessageDialog(null, "Invalid Answer, Please enter TRUE or FALSE");
////			}//End of if-else
////		}//End of while loop
//	}//End of ask method

}//End of TrueFalseQuestion class
