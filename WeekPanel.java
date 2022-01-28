package view;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class WeekPanel extends JPanel{
	
	//Fields
	private JLabel question=new JLabel("Enter the Number of weeks: ");
	private JRadioButton choice1=new JRadioButton("1");
	private JRadioButton choice2=new JRadioButton("2");
	private JRadioButton choice3=new JRadioButton("3");
	private JRadioButton choice4=new JRadioButton("4");
	private JRadioButton choice5=new JRadioButton("5");
	private JRadioButton[] weekArray={choice1,choice2,choice3,choice4,choice5};
	
	//Constructor
	public WeekPanel() {
		setLayout(null);
		setBounds(400,100,700,200);
		
		//Stores the radio buttons into a Button Group
		//This allows only one button to be selected at a time. 
		ButtonGroup weeks=new ButtonGroup();
		weeks.add(weekArray[0]);
		weeks.add(weekArray[1]);
		weeks.add(weekArray[2]);
		weeks.add(weekArray[3]);
		weeks.add(weekArray[4]);
		
		choice1.setBounds(10, 60, 150, 20);
		choice1.setFont(new Font("Hevetica",Font.BOLD,15));
		choice2.setBounds(200, 60, 150, 20);
		choice2.setFont(new Font("Hevetica",Font.BOLD,15));
		choice3.setBounds(400, 60, 150, 20);
		choice3.setFont(new Font("Hevetica",Font.BOLD,15));
		choice4.setBounds(10, 100, 150, 20);
		choice4.setFont(new Font("Hevetica",Font.BOLD,15));
		choice5.setBounds(200, 100, 150, 20);
		choice5.setFont(new Font("Hevetica",Font.BOLD,15));
		
		question.setBounds(10, 0, 650, 50);
		question.setFont(new Font("Hevetica",Font.BOLD,20));
		add(question);
		add(choice1);
		add(choice2);
		add(choice3);
		add(choice4);
		add(choice5);
		
		
		
	}

	//Getters and setters
	public JRadioButton[] getWeekArray() {
		return weekArray;
	}

	public void setWeekArray(JRadioButton[] weekArray) {
		this.weekArray = weekArray;
	}

}
