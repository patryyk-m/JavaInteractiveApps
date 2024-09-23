package Part3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;

public class InvestigatorClass extends JFrame {
    JTextArea textArea;
    JButton button;

    public InvestigatorClass() {
        setTitle("InvestigatorClass");
        textArea = new JTextArea(20, 50);
        button = new JButton("Investigate MysteryJarClass");

        setLayout(new BorderLayout());
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                investigateClass();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);;
        setVisible(true);
    }

    public void investigateClass() {
        try {
            Class<?> mysteryClass = Class.forName("mystery.MysteryJarClass");
            Method[] methods = mysteryClass.getDeclaredMethods();
            StringBuilder details = new StringBuilder();

            for (Method method : methods) {
                method.setAccessible(true); // Access private methods
                details.append("Method: ").append(method.getName()).append(", Parameters: ");

                Parameter[] parameters = method.getParameters();
                for (Parameter parameter : parameters) {
                    details.append(parameter.getType().getName()).append(" ").append(parameter.getName()).append(", ");
                }

                // If method has no parameters try to invoke it
                if (parameters.length == 0) {
                    try {
                        details.append("\nInvoking method with no parameters: ");
                        Object instance = mysteryClass.getDeclaredConstructor().newInstance(); // Create an instance
                        details.append(method.invoke(instance)); // Invoke the method
                    } catch (Exception e) {
                        details.append("Error invoking method: ").append(e.getMessage());
                    }
                }

                details.append("\n"); // Separate methods
            }
            textArea.setText(details.toString());
        } catch (ClassNotFoundException | SecurityException e) {
            textArea.setText("Failed to load MysteryJarClass: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new InvestigatorClass();
    }
}
