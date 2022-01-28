package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class NewTaskFrame extends JFrame implements ActionListener{
	
	//Fields
	private JButton finish=new JButton("Finish");
	private JTextField tasknamebox=new JTextField();
	private JTextField personname=new JTextField();
	private JLabel name=new JLabel("Task Name:");
	private JLabel person=new JLabel("Assigned to: ");
	private String word2="";
	private JLabel taskName=new JLabel();
	private String word3;
	
	//Constructor
	public NewTaskFrame(){
		setTitle("app");
		setLayout(null);
		setSize(900,600);
		
		
		name.setFont(new Font("Hevetica",Font.BOLD,25));
		name.setBounds(350, 80, 200, 80);
		person.setBounds(350,130,200,80);
		person.setFont(new Font("Hevetica",Font.BOLD,25));
		
		tasknamebox.setBounds(500, 90, 200, 50);
		personname.setBounds(500,150,200,50);
		
		finish.setBounds(500,250,200,50);
		
		addActionListener();
		
		add(name);
		add(tasknamebox);
		add(person);
		add(personname);
		add(finish);
		setVisible(true);
	}

//Getters and setters
	public JTextField getPersonname() {
		return personname;
	}


	public void setPersonname(JTextField personname) {
		this.personname = personname;
	}





	public JButton getFinish() {
		return finish;
	}


	public void setFinish(JButton finish) {
		this.finish = finish;
	}


	public JTextField getTasknamebox() {
		return tasknamebox;
	}


	public void setTasknamebox(JTextField tasknamebox) {
		this.tasknamebox = tasknamebox;
	}

	
	public JLabel getTaskName() {
		return taskName;
	}


	public void setTaskName(JLabel item2) {
		this.taskName = item2;
	}


	public String getWord2() {
		return word2;
	}


	public void setWord2(String word2) {
		this.word2 = word2;
	}


	public JLabel getPerson() {
		return person;
	}


	public void setPerson(JLabel person) {
		this.person = person;
	}


	public String getWord3() {
		return word3;
	}


	public void setWord3(String word3) {
		this.word3 = word3;
	}
	
	//Adds ActionListener to the finish button
	private void addActionListener() {
		finish.addActionListener(this);
	}

	/*
	 * When the finish button is clicked in NewTaskFrame, the text from the tasknamebox will be stored into variable word2.
	 * The text from personname will be stored into variable word3.
	 * String value stored in word2 is then stored in the JLabel taskName. 
	 * taskName is also given a ToolTip containing the String value stored in word3.
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==getFinish()) {
			word2=tasknamebox.getText();
			word3="Assigned to: "+personname.getText();
			taskName.setText(word2);
			taskName.setToolTipText(word3);
			taskName.setFont(new Font("Hevetica",Font.BOLD,15));
			this.dispose();
		}
	}


	
}
