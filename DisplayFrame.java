package view;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import model.Category;

public class DisplayFrame extends JFrame implements MouseListener{
	
	//Fields
	private JLabel[][]chart=new JLabel[25][50];
	private int weeknum;
	private JLabel week;
	private int num=0;
	private int nm=130;
	private int n=0;
	private int length=0;
	private ArrayList<Category> category;
	private JLabel[][] boxes=new JLabel[30][50];
	private int clickCount=0;
	private int row=0;
	
	
	//Constructor
	public DisplayFrame(int weeknum,ArrayList<Category> category){
		super();
		this.category=category;
		this.weeknum = weeknum;
		setTitle("GANTT Chart Tool-Completed GANTT chart");
		setLayout(null);
		setSize(900,600);
		addWeeks(weeknum);
		addcategory(category,weeknum);
		
		
		setVisible(true);
		
	}


	
	

	
	
	
	
	//Displays the number of weeks the user enters onto the GANTT chart.
	private void addWeeks(int weeknum) {
		for(int i=0; i<weeknum; i++) {
			
			week=new JLabel(" Week "+(i+1));
			week.setFont(new Font("Hevetica",Font.BOLD,25));
			week.setBounds(160+num,100,400,50);
			week.setBorder(BorderFactory.createLineBorder(Color.black));
			num+=400;
			chart[0][i]=week;
			add(chart[0][i]);
		}
	}
	
	
	
	/*
	 * Method for adding the added categories and their respective tasks.
	 * Also adds for each task a row of empty boxes for each task.
	 * These empty boxes can be used to indicate the priority of a task on a given day. 
	 * Each empty box displayed is given a MouseListener to allow for color change when the user clicks on it.   
	 */
	
	private void addcategory(ArrayList<Category> categories, int weeknum) {
		
		for(int h=0; h<weeknum; h++) {
			length+=400;
		}
		
		for(int i=0; i<categories.size(); i++) {
			nm+=50;
			categories.get(i).getCategoryLabel().setFont(new Font("Hevetica",Font.BOLD,20));
			categories.get(i).getCategoryLabel().setBounds(10,nm,150+length,45);
			categories.get(i).getCategoryLabel().setBorder(BorderFactory.createLineBorder(Color.black));
			add(categories.get(i).getCategoryLabel());
			
			for(int g=0; g<categories.get(i).getTasks().size(); g++) {
				if(g==0) {
					n=0;
					nm+=60;
					categories.get(i).getTasks().get(g).setBounds(10,nm,150,30);
					categories.get(i).getTasks().get(g).setFont(new Font("Hevetica",Font.BOLD,15));
					add(categories.get(i).getTasks().get(g));
					row++;
						for(int f=0; f<(weeknum*5); f++) {
							n+=80;
							boxes[row][f]=new JLabel();
							boxes[row][f].setOpaque(true);
							boxes[row][f].setBounds(80+n,nm,80,30);
							boxes[row][f].setBorder(BorderFactory.createLineBorder(Color.black));
							boxes[row][f].addMouseListener(this);
							chart[g][f]=boxes[row][f];
							add(chart[g][f]);	
						}
	
				}else if(g>0){
					n=0;
					nm+=35;
					categories.get(i).getTasks().get(g).setBounds(10,nm,150,30);
					categories.get(i).getTasks().get(g).setFont(new Font("Hevetica",Font.BOLD,15));
					add(categories.get(i).getTasks().get(g));
					row++;
						for(int f=0; f<(weeknum*5); f++) {
							n+=80;
							boxes[row][f]=new JLabel();
							boxes[row][f].setOpaque(true);
							boxes[row][f].setBounds(80+n,nm,80,30);
							boxes[row][f].setBorder(BorderFactory.createLineBorder(Color.black));
							boxes[row][f].addMouseListener(this);
							chart[g][f]=boxes[row][f];
							add(chart[g][f]);
						}
						
				}
				
			}
		}
		
		
		
		
	}









/*
 * Changes the colour of an empty box based on the number of consecutive times the user clicks on it. 
 * Single click-Box turns yellow
 * Double click-Box turns orange
 * Triple click-Box turns red
 * Right click-Box colour is removed
 */
	@Override
	public void mouseClicked(MouseEvent e) {
		for(int g=0; g<30; g++) {
			for(int f=0; f<25; f++) {
				if(SwingUtilities.isLeftMouseButton(e)) {
					if(e.getSource()==boxes[g][f] && e.getClickCount()==1) {
						boxes[g][f].setBackground(Color.YELLOW);
						boxes[g][f].setText(" Low Priority");
						boxes[g][f].setFont(new Font("Hevetica",Font.BOLD,10));
						boxes[g][f].setForeground(Color.BLACK);
					}else if(e.getSource()==boxes[g][f] && e.getClickCount()==2) {
						boxes[g][f].setBackground(Color.ORANGE);
						boxes[g][f].setText(" Medium Priority");
						boxes[g][f].setFont(new Font("Hevetica",Font.BOLD,9));
						boxes[g][f].setForeground(Color.WHITE);
					}else if(e.getSource()==boxes[g][f] && e.getClickCount()==3) {
						boxes[g][f].setBackground(Color.RED);
						boxes[g][f].setText(" High Priority");
						boxes[g][f].setFont(new Font("Hevetica",Font.BOLD,10));
						boxes[g][f].setForeground(Color.WHITE);
					}
				}else if(SwingUtilities.isRightMouseButton(e)) {
					if(e.getSource()==boxes[g][f]) {
						boxes[g][f].setBackground(null);
						boxes[g][f].setText(null);
					}
				}
				
			}
			
		}
		
		
	}










	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}










	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}










	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}










	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	}

	


	
	

	

