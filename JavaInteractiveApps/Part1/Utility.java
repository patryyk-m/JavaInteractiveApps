package Part1;
import javax.swing.*;
import java.awt.*;

/**
 * class used for calculating the circumference of a circle
 */
public class Utility extends JFrame {
    JTextField radiusField;
    JTextField circumferenceField;
    JButton calculateButton;

    /**
     * The value of PI
     */
    private static final double PI = 3.14159;

    /**
     * Constructs the GUI and sets up the action listeners
     */
    public Utility() {
        setTitle("Circumference Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Radius:"));
        radiusField = new JTextField();
        add(radiusField);
        add(new JLabel("Circumference:"));
        circumferenceField = new JTextField();
        circumferenceField.setEditable(false); // Prevent user from editing the output
        add(circumferenceField);
        calculateButton = new JButton("Calculate");
        add(calculateButton);

        // Setting up button action using lambda expression
        calculateButton.addActionListener(e -> {
            try {
                double radius = Double.parseDouble(radiusField.getText());
                double circumference = calculateCircumference(radius);
                circumferenceField.setText(String.format("%.2f", circumference));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number for the radius", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }

    /**
     * Calculates the circumference of a circle
     *
     * @param radius The radius of the circle
     * @return The circumference of the circle
     */
    private static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }


    /**
     * Runs the application
     */
    public static void main(String[] args) {
        new Utility(); 
    }
}
