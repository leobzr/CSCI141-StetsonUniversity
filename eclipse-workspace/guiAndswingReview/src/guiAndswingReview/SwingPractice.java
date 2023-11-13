package guiAndswingReview;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class SwingPractice {

	public static void main(String[] args) {
		//Practising GUI and some different applications for them
		//I'm going to create some different functions here, and to test them out, just call them here on main!
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which example would you like to test:\n[1]Basic Window\n[2]Button Example\n[3]Panel Example\n[4]TextField Example\n[5]Menu Bar Example");
		int choice = input.nextInt();
		
		if (choice == 1) {
			BasicWindow();
		} else if (choice == 2) {
			ButtonExample();
		} else if (choice == 3) {
			PanelExample();
		} else if (choice == 4) {
			TextFieldExample();
		} else if (choice == 5) {
			MenuExample();
		}
		
	}
	
	
	/*
	 * The Examples below cover some of the basic components and functionalities of java swing.
	 * Swing is a vast library and these examples are just the surface of what it can be done with this library
	 * Remember to run these example on the Event Dispatch Thread, using swing utilities, as is is written below (invoke later)
	 */
	
	//Use the resources to just create a window, text could be added here
	public static void BasicWindow() {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Basic Swing Window");
			frame.setSize(400, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
	
	
	//This object basically creates a button and shows on the console when it is pressed
	public static void ButtonExample() {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Button Example");
			frame.setSize(400, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton button = new JButton("Click me");
			button.addActionListener(e -> System.out.println("Button Clicked"));
			frame.add(button);
			frame.setVisible(true);
		});
	}
	
	public static void PanelExample() {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Panel Example");
			frame.setSize(400, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//creating the JPanel
			JPanel panel = new JPanel();
			JButton button1 = new JButton("Button 1");
			JButton button2 = new JButton("Button 2");
			
			panel.add(button1);
			panel.add(button2);
			
			frame.setVisible(true);
		});
	}
	
	public static void TextFieldExample() {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("TextField Example");
			JTextField textField = new JTextField(20);
			JButton button = new JButton("Submit");
			
			button.addActionListener((ActionListener) new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String text = textField.getText();
					System.out.println("Input: "+ text);
				}
			});
			
			
			frame.setLayout(new  FlowLayout());
			frame.add(textField);
			frame.add(button);
			frame.pack();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		});
	}
	
	public static void MenuExample(){
		JFrame frame = new JFrame("Menu Example");
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		openItem.addActionListener(e -> System.out.println("Open Clicked."));
		exitItem.addActionListener(e -> System.exit(0));
		
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
