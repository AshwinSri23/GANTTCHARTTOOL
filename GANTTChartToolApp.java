/*
 * Name: Ashwin Srirankan
 * Date: January 18th 2022
 * Course Code: ICS4U1-Mr.Fernandes
 * Title: GANTT Chart Tool
 * 
 * Description: 
 * 
 * Generates a GANTT chart based on: the number of weeks the user has to complete the project, 
 * the number of tasks the user has, and the number of categories the users organizes said tasks into. 
 * 
 * Features: 
 * 
 * 1.User can enter their preferences into a form in order to generate a GANTT chart.
 * 2.In the form, user's can create a new category to organize their tasks. The user can enter the name of their category.
 * 3.For each category, the user can add up to 5 tasks. For each task, the user can enter the name of the task and the person assigned to said task. 
 * 4.Once the form is complete, displays a GANTT chart based on the information entered by user. Users can change the colour of the empty boxes beside each task based on the number of consecutive clicks(ex: single click, double click). 
 * 5.A person can hover their mouse over a task on the completed GANTT chart to see the person assigned to it. 
 *           
 * Major Skills: 
 * 
 * 	Object-Oriented Programming: Created a Category object to store the name of the categories,their respective tasks, and the names of people assigned to each task. 
 * 	When a new category is created by the user a new Category object is created.
 * 	Furthermore, I also used methods in the DisplayFrame class to retrieve information from the user and generate the GANTT chart. 
 * 
 * 	Data Structures: I used this concept by storing new Category objects into an ArrayList. Furthermore, I also created an array in the Category class to store any new tasks the user has created for a category.  
 * 	In addition, I also created an array in WeekPanel to store the radio buttons in the panel. Also, I created a 2-D array to store and display the different parts of the GANTT table with JLabels. 
 * 
 * 	Designing Algorithms: I used this concept by creating an Algorithm for displaying the GANTT table from the information entered by the user into the form. 
 * 	
 * 	Code Maintenance: I used this concept by adding the ability to remove the existing colour of an empty box by right clicking said box. In addition, I also worked through a number of bugs involving the collection of 
 * 	data from the user. More specifically, they were instances In addition, I also resolved a bug where not all the empty boxes in the generated GANTT chart were able to have their colours changed when clicked on. 
 * 
 * Areas of Concern: 
 * 
 * Instructions:
 * 	Make sure to answer all questions on the form before submitting. On the completed GANTT Chart, you can change the colour of the empty boxes beside each row to indicate their priority.
 * 	Single click a box to change it's colour to yellow. Double click a box to change it's colour to orange. Triple click a box to change it's colour to red. Right click to remove the colour of a box.
 * 
 * Issues:
 * 	Due the amount of time that I had found myself working on the other parts of the project, the option for the user to enter the starting and ending day of a task was not implemented. 
 * 	In addition, when the user clicks on the add Category button, a new task frame is opened. 
 * 	The name of the task and/or category may be too long. This would result in the name not being fully visible on the completed GANTT chart. 
 * 	The user may find it cumbersome to change the colour of an empty box.
 * 
 * Notes for End Users:
 * 	The application should be viewed on a monitor. The application won't be fully visible on a Laptop screen.
 * 	When a new NewTaskFrame or NewCategoryFrame is opened, it is meant to be viewed and interacted with as they appear.
 * 	The FormFrame and DisplayFrame are meant to be viewed maximized.
 * 
 * External Sources:
 * 	https://stackhowto.com/how-to-create-a-right-click-context-menu-in-java-swing/
 * 
 */

package application;

import controller.AppController;

public class GANTTChartToolApp {
	
	public static void main(String args[]) {
		new AppController();
	}

}
