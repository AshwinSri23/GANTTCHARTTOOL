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
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AppController;

@SuppressWarnings("serial")
public class ListPanel extends JPanel{
	
	//Fields
	private JButton newCategory=new JButton("+ New Category");
	public JLabel item=new JLabel("Project");
	int i=0;
	int a=0;
	
	//Constructor
	public ListPanel() {
		setLayout(null);
		setBounds(400,330,1500,960);	
		newCategory.setBounds(1350, 0, 150, 80);
		add(newCategory);
		
		
	}
	
	//Getters and setters
	public JButton getNewCategory() {
		return newCategory;
	}

	public void setNewProject(JButton newProject) {
		this.newCategory = newProject;
	}

			
	}
	
	
	
	
	

