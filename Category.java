package model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.NewTaskFrame;

public class Category extends JPanel implements ActionListener{
	
	//fields
	private JLabel taskname=new JLabel();
	private JLabel categoryLabel=new JLabel();
	private JButton addTask=new JButton("+ New Task");
	private NewTaskFrame newTaskFrame=new NewTaskFrame();	
	private ArrayList<JLabel> tasks=new ArrayList<JLabel>(6); 
	private String people=newTaskFrame.getWord3();
	private int i=0;
	private int n=0;
	private int a=0;

	//Constructor
	public Category(JLabel categoryLabel, JButton addTask) {
		super();
		this.categoryLabel = categoryLabel;
		this.addTask = addTask;
		
		setLayout(null);
		setBounds(100,200,500,50);
		categoryLabel.setBounds(10,0,350,30);
		addTask.setBounds(380,0,120,30);
		
		
		add(categoryLabel);
		add(addTask);
		
		
		addActionListener();
		
	}
	
	
//getters and setters
	public ArrayList<JLabel> getTasks() {
		return tasks;
	}



	public void setTasks(ArrayList<JLabel> tasks) {
		this.tasks = tasks;
	}



	public int getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
	}



	public JButton getAddTask() {
		return addTask;
	}

	public void setAddTask(JButton addTask) {
		this.addTask = addTask;
	}

	public JLabel getTaskname() {
		return taskname;
	}

	public void setTaskname(JLabel taskname) {
		this.taskname = taskname;
	}



	public JLabel getCategoryLabel() {
		return categoryLabel;
	}



	public void setCategoryLabel(JLabel categoryLabel) {
		this.categoryLabel = categoryLabel;
	}






	public String getPeople() {
		return people;
	}






	public void setPeople(String people) {
		this.people = people;
	}


//Adds an ActionListener to the addTask button 
	private void addActionListener() {
		addTask.addActionListener(this);
	}
	
	
/*
 * When the addTask button is clicked, opens a newTaskFrame for the user to enter their information
 * Displays the task name under it's respective category and stores the task into the tasks array.
 * Removes the actionListener on addTask when the user trys to add more than 5 tasks. 
 */
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==getAddTask() && i<5) {
			newTaskFrame=new NewTaskFrame();
			
			n+=50;
			
			a+=50;
			setSize(500,50+n);
			tasks.add(newTaskFrame.getTaskName());
			tasks.get(i).setBounds(0,0+a, 350, 30);
		    tasks.get(i).setBorder(BorderFactory.createLineBorder(Color.black));
			add(tasks.get(i));
			i++;
			repaint();
			
		}else if(event.getSource()==getAddTask() && a>=5) {
			System.out.println("Max number of tasks entered");
			addTask.removeActionListener(newTaskFrame);
			
			
		}
		
	}


	




	

	
	

}
