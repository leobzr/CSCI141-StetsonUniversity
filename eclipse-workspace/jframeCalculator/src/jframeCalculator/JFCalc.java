package jframeCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class JFCalc {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        frame.add(buttonPanel, BorderLayout.CENTER);

        String[] buttonLabels = {
        	"7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        CalculatorButtonListener listener = new CalculatorButtonListener(textField);
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
            button.addActionListener(listener);
        }

        frame.setVisible(true);
    }

    static class CalculatorButtonListener implements ActionListener {
        private JTextField textField;

        public CalculatorButtonListener(JTextField textField) {
            this.textField = textField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonLabel = button.getText();

            if (buttonLabel.equals("=")) {
                String expression = textField.getText();
                try {
                    double result = evaluateExpression(expression);
                    textField.setText(Double.toString(result));
                } catch (Exception ex) {
                    ex.printStackTrace();  // Print the exception to the console
                    textField.setText("Error");
                }
            } else {
                textField.setText(textField.getText() + buttonLabel);
            }
        }

        private double evaluateExpression(String expression) {
            try {
                Expression e = new ExpressionBuilder(expression)
                    .build();
                return e.evaluate();
            } catch (Exception ex) {
                ex.printStackTrace();  // Print the exception to the console
                textField.setText("Error: Invalid expression");
                return 0;
            }
        }
    }
}
