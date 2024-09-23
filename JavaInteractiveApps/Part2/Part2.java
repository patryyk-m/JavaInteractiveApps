package Part2;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.lang.reflect.*;

public class Part2 extends JFrame {
    JTextArea textArea;
    JButton button;
    String infoText;

    public Part2() {
        setTitle("Part2");
        textArea = new JTextArea(10, 20);
        button = new JButton("Update Info");

        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);


        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Anonymous inner class
        new InnerInfoClass();

    }

    private class InnerInfoClass {
        public InnerInfoClass() {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Building the information string
                    infoText = "Inner class: " + InnerInfoClass.class.getName() +
                               ", Outer class: " + Part2.this.getClass().getName();

                    // Adding field names using reflection
                    Field[] fields = Part2.this.getClass().getDeclaredFields();
                    for (Field field : fields) {
                        infoText += ", Field: " + field.getName();
                    }

                    // Update text area
                    textArea.setText(infoText);
                }
            });
        }
    }

    public static void main(String[] args) {
        new Part2();
    }
}
