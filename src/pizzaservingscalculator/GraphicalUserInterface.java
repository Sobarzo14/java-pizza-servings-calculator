/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaservingscalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author abela
 */
public class GraphicalUserInterface extends JFrame {
    GraphicalUserInterface() {
        //Creating the frames
        JFrame mainFrame = new JFrame("Pizza Servings Calculator");
        mainFrame.setLayout(new GridLayout(4, 1));
        JPanel panel2 = new JPanel();

        

        //Creating the components
        JLabel mainLabel = new JLabel("Pizza Servings Calculator", SwingConstants.CENTER);
        mainLabel.setForeground(Color.red);
        mainLabel.setFont(new Font("Serif", Font.BOLD, 24));
        mainLabel.setVerticalAlignment(SwingConstants.CENTER);
        JLabel enterLabel = new JLabel("Enter the size of the pizza in inches:");
        JTextField input = new JTextField(4);
        JButton button = new JButton("Calculate Servings");
        JLabel output = new JLabel("", SwingConstants.CENTER);
        output.setVerticalAlignment(SwingConstants.CENTER);
        


        //Add components to the frames
        mainFrame.add(mainLabel);
        panel2.add(enterLabel);
        panel2.add(input);
        mainFrame.add(panel2);
        mainFrame.add(button);
        mainFrame.add(output);

        //Function of the app
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                String size = input.getText();        
                double servings = Math.pow((Double.parseDouble(size) / 8),2);
                output.setText("A " + size + " inch pizza will serve " + String.format("%.2f", servings) + " people");
            }

        });
       
        //The frame required functions
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        mainFrame.setSize(350,300);
        mainFrame.setVisible(true);
        
    }
    
}
