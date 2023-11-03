package myJframe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MyJFrame {
    private JFrame frame;
    private JButton button;
    private JLabel label;

    public MyJFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        button = new JButton("Click me");
        label = new JLabel("Not clicked yet");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	/*
            	 * Quick note:
            	 * This method uses two parameters,
            	 * the first is to determine the position of the dialog box
            	 * null makes it centralized. 
            	 */
            	JOptionPane.showMessageDialog(null, "GO HATTERS!");
            	
                label.setText("You clicked!");
            }
        });

        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame();
            }
        });
    }
}
