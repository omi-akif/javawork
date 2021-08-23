//import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question{
	
	
	
	//Constructor
	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		
		super(query);
		
		addChoice("A", a);
		
		addChoice("B", b);
		
		addChoice("C", c);
		
		addChoice("D", d);
		
		addChoice("E", e);
		
		initQuestionDialog();
		
		//Instance variable can be accessed by constructors or code blocks
//		question = query + "\n";
//		
//		question += "A. " +a+ "\n";
//		question += "B. " +b+ "\n";
//		question += "C. " +c+ "\n";
//		question += "D. " +d+ "\n";
//		question += "E. " +e+ "\n";
		
		correctAnswer = answer.toUpperCase();
	} //End of constructor
	

	void addChoice(String name, String label){
		JPanel choice = new JPanel(new BorderLayout());
		JButton button = new JButton(name);
		
		button.addActionListener(question);
		choice.add(button,BorderLayout.WEST);
		
		choice.add(new JLabel(label+"       ", JLabel.LEFT), BorderLayout.CENTER);
		
		question.add(choice);
		
		
	}
	
//	String ask() {
//		
//		while(true) {	
//			
//			String answer = JOptionPane.showInputDialog(question);
//			
//			answer = answer.toUpperCase();
//
//			if(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
//				return answer;
//			}
//			else {
//				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
//			}
//		}//End of while loop
//		
//	}//End of ask method
	

	
	
}
