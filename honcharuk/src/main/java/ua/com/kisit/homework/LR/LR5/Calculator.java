package ua.com.kisit.homework.LR.LR5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Інженерний калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 450);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(50, 50, 50));

        JTextField display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBackground(new Color(60, 60, 60));  // Темно-сірий фон для дисплею
        display.setForeground(Color.WHITE);  // Білий текст
        panel.add(display, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(5, 5, 5, 5));
        buttonsPanel.setBackground(new Color(50, 50, 50));  // Сірий фон для панелі кнопок

        String[] buttons = {
                "(", ")", "mc", "m+", "m-", "mr", "AC", "+/-", "%", "/",
                "2nd", "x^2", "x^3", "x^y", "y^x", "2^x", "7", "8", "9", "*",
                "1/x", "\u221A", "\u221B", "y\u221A", "logy", "log2", "4", "5", "6", "-",
                "x!", "sin^-1", "cos^-1", "tan^-1", "e", "EE", "1", "2", "3", "+",
                "sinh^-1", "cosh^-1", "tanh^-1", "\u03C0", "Rad", "Rand", "0", ",", "="
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.setFocusPainted(false);
            button.setBackground(new Color(80, 80, 80));
            button.setForeground(Color.WHITE);
            button.setOpaque(true);

            if (text.equals("AC")) {
                button.setBackground(new Color(150, 50, 50));
            } else if (text.equals("+/-")) {
                button.setBackground(new Color(150, 50, 50));
            } else if (text.equals("%")) {
                    button.setBackground(new Color(150, 50, 50));
            } else if ("/*-+=".contains(text)) {
                button.setBackground(new Color(200, 150, 50));
            } else if ("0123456789".contains(text)) {
                button.setBackground(new Color(100, 100, 100));
            }

            button.addActionListener(new ButtonClickListener(display));
            buttonsPanel.add(button);
        }

        panel.add(buttonsPanel, BorderLayout.CENTER);
        frame.add(panel);
        frame.setVisible(true);
    }

    private static class ButtonClickListener implements ActionListener {
        private final JTextField display;

        public ButtonClickListener(JTextField display) {
            this.display = display;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            if (command.equals("AC")) {
                display.setText("0");
            } else if (command.equals("=")) {
                try {
                    String result = evaluateExpression(display.getText());
                    display.setText(result);
                } catch (Exception ex) {
                    display.setText("Error");
                }
            } else {
                if (display.getText().equals("0")) {
                    display.setText(command);
                } else {
                    display.setText(display.getText() + command);
                }
            }
        }

        private String evaluateExpression(String expression) {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            try {
                Object result = engine.eval(expression);
                return result.toString();
            } catch (Exception e) {
                throw new RuntimeException("Invalid Expression");
            }
        }
    }
}
