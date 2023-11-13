package awtReview;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtReview {

	public static void main(String[] args) {
		//You can call both functions here
		//They do basically the same as the ones in swing
		//But you can see that there are some differences
		//And some things in common
		//Because Swing relies on awt.
	}
	
	public static void AWTExample() {
		Frame frame = new Frame("Basic AWT Window");
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
	
	public static void ButtonExample() {
		Frame frame = new Frame("Button Example");
		Button button = new Button("Click Me");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicke");
			}
		});
		
		frame.add(button);
		frame.setSize(300, 200);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}
	
	public static void PanelExample() {
		Frame frame = new Frame("Panel Example");
		Panel panel = new Panel();
		panel.setLayout(new FlowLayout());
		
		Button button1 = new Button("Button 1");
		Button button2 = new Button("Button 2");
		panel.add(button1);
		panel.add(button2);
		
		frame.add(panel);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
	
}