package view;



import java.awt.Color;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class FormFrame extends JFrame{
	
	
	//Fields
	private JLabel title=new JLabel("Projects");
	
	
	private ListPanel listPanel=new ListPanel();
	private WeekPanel weekPanel=new WeekPanel();
	private JButton complete=new JButton("Complete");
	public JLabel item=new JLabel("Project");
	
	


//Constructor
	public FormFrame(){
		setTitle("GANTT Chart Tool-Form");
		setLayout(null);
		setSize(1920,1080);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		title.setFont(new Font("Hevetica",Font.BOLD,40));
		title.setBounds(400, 30, 200, 80);
		
		listPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		weekPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		complete.setFont(new Font("Hevetica",Font.BOLD,15));
		complete.setBounds(1700,1300,200,50);
		
		add(title);
		add(weekPanel);
		add(listPanel);
		add(complete);
		setVisible(true);
	}

//getters and setters
	public JButton getComplete() {
		return complete;
	}



	public void setComplete(JButton complete) {
		this.complete = complete;
	}



	public WeekPanel getWeekPanel() {
		return weekPanel;
	}



	public void setWeekPanel(WeekPanel weekPanel) {
		this.weekPanel = weekPanel;
	}



	public ListPanel getListPanel() {
		return listPanel;
	}

	public void setListPanel(ListPanel listPanel) {
		this.listPanel = listPanel;
	}


	public JLabel getItem() {
		return item;
	}


	public void setItem(JLabel item) {
		this.item = item;
	}
	
	
	

}
