package controller;


import view.DisplayFrame;

import view.NewCategoryFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Category;
import view.FormFrame;
import view.WeekPanel;

public class AppController implements ActionListener{
	
	
	//fields
	private FormFrame projectframe;
	public static ArrayList<String> categories=new ArrayList<String>();
	private NewCategoryFrame newCategoryFrame;
	private DisplayFrame displayFrame;
	private int i=0;
	public static int a=0;
	private JLabel item1=new JLabel();
	private String text="";
	private int weeknum;
	private int g;
	public static ArrayList<Category> category=new ArrayList<Category>();
	
	
	//Constructor
	public AppController() {
		projectframe=new FormFrame();
		addActionListener();
		
	}
	
	

	//getters and setters
	public FormFrame getProjectframe() {
		return projectframe;
	}

	public void setProjectframe(FormFrame projectframe) {
		this.projectframe = projectframe;
	}

	
/*
 * Adds actionListener to NewProject and Complete button in ProjectFrame
 * Also adds an actionListener to each radio button in weekPanel 
 */
	private void addActionListener() {
		projectframe.getListPanel().getNewCategory().addActionListener(this);
		projectframe.getComplete().addActionListener(this);
		
		for(int f=0; f<5; f++) {
			projectframe.getWeekPanel().getWeekArray()[f].addActionListener(this);
		}
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		
		/*
		 * When the user clicks on the NewProject button, a NewCategoryFrame is opened
		 * Here, the user enters the name of the category
		 * When the user clicks the finish button in the Category array, a new Category object is created and stored into the category array. 
		 * The name of the Category is displayed 
		 */
		
		if(event.getSource()==projectframe.getListPanel().getNewCategory()&& a<5) {
			
			
			newCategoryFrame=new NewCategoryFrame();
			JLabel text=newCategoryFrame.getCategoryName();
			JButton button=newCategoryFrame.getAddTask();
			
			
			text.setFont(new Font("Hevetica",Font.BOLD,20));
			category.add(new Category(text,button));
			if(a%2==0) {
				category.get(a).setBorder(BorderFactory.createLineBorder(Color.black));
				category.get(a).setLocation(10,30+i);
				i+=310;
			}else if(a%2!=0) {
				category.get(a).setBorder(BorderFactory.createLineBorder(Color.black));
				category.get(a).setLocation(700,30+g);
				g+=310;
			}
			
			projectframe.getListPanel().add(category.get(a));
			projectframe.getListPanel().repaint();
			a++;
			
			
		//If the user tries to add more than 5 categories, the actionListener on NewCategory is removed
			
		}else if(event.getSource()==projectframe.getListPanel().getNewCategory() && a==5) {
			System.out.println("Max number of projects reached");
			projectframe.getListPanel().getNewCategory().removeActionListener(newCategoryFrame);
		}
		
		for(int f=0; f<projectframe.getWeekPanel().getWeekArray().length; f++) {
			if(event.getSource()==projectframe.getWeekPanel().getWeekArray()[f]) {
				weeknum=f+1;
				
			}
		}
		
		/*
		 * When the user clicks on the Complete button in ProjectFrame, a new DisplayFrame is created and ProjectFrame is closed
		 * The DisplayFrame contains the completed GANTT chart
		 */
		
		
		if(event.getSource()==projectframe.getComplete()) {
			displayFrame=new DisplayFrame(weeknum,category);
			projectframe.dispose();
		}
		
	}
	
	

	public JLabel getItem1() {
		return item1;
	}

	public void setItem1(JLabel item1) {
		this.item1 = item1;
	}

	public int getWeeknum() {
		return weeknum;
	}

	public void setWeeknum(int weeknum) {
		this.weeknum = weeknum;
	}
	
}
