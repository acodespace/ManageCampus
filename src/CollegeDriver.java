/**
 * Create a Java GUI Application that takes user input for a Student and a Faculty
 *  Both Student and Faculty attributes are idNum, lastName, firstName and an Email Address.
 *  Each Student has an additional gpa attribute.
 *  Each Faculty has an additional salary attribute.
 *  Convert first and last name of a Student and a Faculty into UpperCase 
 *  Create an ArrayList where a user can store Student and Faculty input information
 *  Display contents of the ArrayList variable in the Console. hint* use toString method of each object.
 *  Display an individual count of Students and Faculty objects stored in the ArrayList.
 *  
 * 
 * @author Arzoo Shahzad
 * @version 1.1
 * 
 * Project Name : ManageCampus
 * CollegeDriver.java
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class CollegeDriver implements ActionListener {

	// Declare private variables for JFrame, JPanel, JTabbedPane and JMenuBar, JMenu
	// and JMenuItem
	private JFrame frame;
	private JPanel panel1, panel2;
	private JTabbedPane tabbedPane;
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem menuItemExit;

	// Declare JLabels for Student panel1.
	private JLabel lblStudent_idNum, lblStudent_lastName, lblStudent_firstName, lblStudent_Email, lblStudent_gpa;
	// Declare JTextFields for Student panel1.
	private JTextField txtStudent_idNum, txtStudent_lastName, txtStudent_firstName, txtStudent_Email, txtStudent_gpa;
	// Declare JLabels for Faculty panel2.
	private JLabel lblFaculty_idNum, lblFaculty_lastName, lblFaculty_firstName, lblFaculty_Email, lblFaculty_salary;
	// Declare JTextFields for Faculty panel2.
	private JTextField txtFaculty_idNum, txtFaculty_lastName, txtFaculty_firstName, txtFaculty_Email, txtFaculty_salary;

	// Declare JButton btnAddStudent
	private JButton btnAddStudent;
	// Declare JButton btnAddStudent
	private JButton btnAddFaculty;
	// Create an ArrayList of type CampusPerson
	ArrayList<CampusPerson> campusPerson = new ArrayList<CampusPerson>();

	// Default Constructor for Graphical User Interface (GUI)
	public CollegeDriver() {

		// Initialize frame and tabbedPane object variables
		frame = new JFrame();
		tabbedPane = new JTabbedPane();
		// Initialize menubar, menu and menuItemExit object variables
		menubar = new JMenuBar();
		menu = new JMenu("Menu");
		menuItemExit = new JMenuItem("Exit");

		// Initialize JLabels with a text and JTextFields for Student input values
		lblStudent_idNum = new JLabel("ID Number");
		txtStudent_idNum = new JTextField();
		lblStudent_firstName = new JLabel("First Name");
		txtStudent_firstName = new JTextField();
		lblStudent_lastName = new JLabel("Last Name");
		txtStudent_lastName = new JTextField();
		lblStudent_Email = new JLabel("Email");
		txtStudent_Email = new JTextField();
		lblStudent_gpa = new JLabel("GPA");
		txtStudent_gpa = new JTextField();

		// Initialize JLabels with a text and JTextFields for Faculty input values
		lblFaculty_idNum = new JLabel("ID Number");
		txtFaculty_idNum = new JTextField();
		lblFaculty_firstName = new JLabel("First Name");
		txtFaculty_firstName = new JTextField();
		lblFaculty_lastName = new JLabel("Last Name");
		txtFaculty_lastName = new JTextField();
		lblFaculty_Email = new JLabel("Email");
		txtFaculty_Email = new JTextField();
		lblFaculty_salary = new JLabel("Salary");
		txtFaculty_salary = new JTextField();

		// Initialize JButtons with text
		btnAddStudent = new JButton("Add Student");
		btnAddFaculty = new JButton("Add Faculty");

		// Initialize panel1 and panel2;
		panel1 = new JPanel();
		panel2 = new JPanel();

		// set panel1 and panel2 layout of type GridLayout with 0 rows and 2 columns.
		panel1.setLayout(new GridLayout(0, 2));
		panel2.setLayout(new GridLayout(0, 2));

		// Add JLabels and JTextFields for a Student's input information into the panel1
		panel1.add(lblStudent_idNum);
		panel1.add(txtStudent_idNum);
		panel1.add(lblStudent_firstName);
		panel1.add(txtStudent_firstName);
		panel1.add(lblStudent_lastName);
		panel1.add(txtStudent_lastName);
		panel1.add(lblStudent_Email);
		panel1.add(txtStudent_Email);
		panel1.add(lblStudent_gpa);
		panel1.add(txtStudent_gpa);

		// Add JLabels and JTextFields for a Faculty's input information into the panel1
		panel2.add(lblFaculty_idNum);
		panel2.add(txtFaculty_idNum);
		panel2.add(lblFaculty_firstName);
		panel2.add(txtFaculty_firstName);
		panel2.add(lblFaculty_lastName);
		panel2.add(txtFaculty_lastName);
		panel2.add(lblFaculty_Email);
		panel2.add(txtFaculty_Email);
		panel2.add(lblFaculty_salary);
		panel2.add(txtFaculty_salary);

		// Add ActionListener interface for receiving action events because this class
		// object implements ActionListener.
		btnAddStudent.addActionListener(this);
		btnAddFaculty.addActionListener(this);
		menuItemExit.addActionListener(this);

		// Add btnAddStudent to panel1
		panel1.add(btnAddStudent);
		// Add btnAddFaculty to panel2
		panel2.add(btnAddFaculty);

		// Add panel1 into Student Tab
		tabbedPane.addTab("Student", null, panel1, "Student Tab");
		// Add panel2 into Faculty Tab
		tabbedPane.addTab("Faculty", null, panel2, "Faculty Tab");

		// Add tabbedPane object and set border layout
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		// frame.add(panel, BorderLayout.CENTER);
		// add menuItemExit to menu and then add menu to menubar then add menubar to
		// frame
		menu.add(menuItemExit);
		menubar.add(menu);
		frame.setJMenuBar(menubar);

		// set default and required attributes of the frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Manage Campus");
		frame.pack();
		frame.setVisible(true);
	}

	// Main method to execute Default constructor of the this CollegeDriver class.
	public static void main(String[] args) {

		new CollegeDriver();

	} // end main

	@Override
	public void actionPerformed(ActionEvent e) {
		// Check condition if btnAddStudent is clicked
		if (e.getSource() == btnAddStudent) {
			// Create an object student of type Student
			Student student = new Student();

			// Obtain value from a GUI text field and assign it to its respective student
			// attribute using the setter method.
			student.setIdNum(txtStudent_idNum.getText());
			student.setFirstName(txtStudent_firstName.getText());
			student.setLastName(txtStudent_lastName.getText());
			student.setEmail(txtStudent_Email.getText());
			student.setGpa(txtStudent_gpa.getText());

			// add the student object to campusPerson arrayList object
			campusPerson.add(student);

		} // Check condition if btnAddFaculty is clicked
		else if (e.getSource() == btnAddFaculty) {
			// Create an object faculty of type Faculty
			Faculty faculty = new Faculty();

			// Obtain value from a GUI text field and assign it to its respective faculty
			// attribute using the setter method.
			faculty.setIdNum(txtFaculty_idNum.getText());
			faculty.setFirstName(txtFaculty_firstName.getText());
			faculty.setLastName(txtFaculty_lastName.getText());
			faculty.setEmail(txtFaculty_Email.getText());
			faculty.setSalary(txtFaculty_salary.getText());

			// add the faculty object to campusPerson arrayList object
			campusPerson.add(faculty);

		} // Check condition if menuItemExit is clicked
		else if (e.getSource() == menuItemExit) {
			// Close the application
			System.exit(0);
		} // end if

		// Create int variables studentCount and facultyCount and initialize to 0
		int studentCount = 0;
		int facultyCount = 0;

		for (CampusPerson person : campusPerson) {
			// System.out.println(person.getClass().getName());
			if (person.getClass().getName() == "Student") {
				System.out.println(person);
				studentCount++;
			} else if (person.getClass().getName() == "Faculty") {
				System.out.println(person);
				facultyCount++;
			} // end if
		} // end for loop
		System.out.println(
				"--- There are " + studentCount + " Students and " + facultyCount + " Faculty from the ArrayList---");

	} // end actionPerformed
} // end class
