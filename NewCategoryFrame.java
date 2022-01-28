package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.AppController;


@SuppressWarnings("serial")
public class NewCategoryFrame extends JFrame implements ActionListener{
	
	//Fields
	private JTextField namebox=new JTextField();
	private JLabel name=new JLabel("Name: ");
	private JButton finish=new JButton("Finish: ");
	private JButton newTask=new JButton("+ New Task");
	private String word="";
	private JLabel categoryName=new JLabel();
	private JButton addTask=new JButton("+ New Task");
	
	
//Constructor
	public NewCategoryFrame(){
		setTitle("GANTT Chart Tool-New Category");
		setLayout(null);
		setSize(900,600);
		
		
		name.setFont(new Font("Hevetica",Font.BOLD,30));
		name.setBounds(400, 80, 200, 80);
		
		namebox.setBounds(500, 80, 200, 80);
		finish.setBounds(500,200,200,80);
		add(name);
		add(namebox);
		add(finish);
		addActionListener();
		setVisible(true);
		
	}
	
	
	
//getters and setters

	public JTextField getNamebox() {
		return namebox;
	}

	public void setNamebox(JTextField namebox) {
		this.namebox = namebox;
	}
	
	
	public JButton getFinish() {
		return finish;
	}

	public void setFinish(JButton finish) {
		this.finish = finish;
	}

	public JButton getAddTask() {
		return addTask;
	}


	public void setAddTask(JButton addTask) {
		this.addTask = addTask;
	}
	
	


	

	public JLabel getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(JLabel category) {
		this.categoryName = category;
	}


	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public JButton getFinish2() {
		return newTask;
	}


	public void setFinish2(JButton finish2) {
		this.newTask = finish2;
	}
	
	//Adds ActionListener to the finish button
	private void addActionListener() {
		finish.addActionListener(this);
	}
	
	
	/*
	 * Stores the text entered into namebox into the variable word.
	 * The string value of word is then stored into the JLabel categoryName 
	*/
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==getFinish()) {
			word=namebox.getText();
			categoryName.setText(word);
			
			this.dispose();
		}
		
	}

}
