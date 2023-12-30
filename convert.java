import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class convert {

    private static double rateOfRupeesPerDollar = 83.19;
    private static double rateOfDollarPerRupees = 0.012;
    public static void converter(){
        // creating a new frame
        JFrame f = new JFrame("Converter");
        //create two label
        JLabel l1,l2;
        //creating two text field for dollar and rupees
        JTextField t1, t2;
        // create buttons for conversion and to close the window
        JButton b1,b2,b3;
        //Naming the labels and setting the bound for the labels
        l1 = new JLabel("Rupees:");
        l1.setBounds(20,35,60,30);
        l2 = new JLabel("Dollars:");
        l2.setBounds(170,35,60,30);

        //Initializing the text fields with 0 (initially) and setting the bound for the text fields
        t1 = new JTextField("");
        t1.setBounds(80,40,50,20);
        t2 = new JTextField("");
        t2.setBounds(240, 40, 50, 20);

        //Create one button for INR one for USD and one to close and setting the bounds
        b1 = new JButton("INR");
        b1.setBounds(50,80,60,15);
        b2 = new JButton("USD");
        b2.setBounds(190, 80, 60, 15);
        b3 = new JButton("Done with it!");
        b3.setBounds(150, 150, 60, 30);


        //adding action listener to button 1
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // converting the txt to double
                double d = Double.parseDouble(t1.getText());
                //concerting the inr to usd
                double d1 = (d/ rateOfRupeesPerDollar);
                // converting the double to string again
                String s1 = String.valueOf(Math.abs(d1));
                t2.setText(s1);
            }
        });

        //adding action listener to button 2
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d3 = Double.parseDouble(t2.getText());
                double d2 = (d3 / rateOfDollarPerRupees);
                String s1 = String.valueOf(Math.abs(d2));
                t1.setText(s1);
            }
        });

        // adding aciton listner to close the window
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        // Default method to close the frame
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });

        //adding the created objects to the form
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400,300);
        f.setVisible(true);
    }

    // Driver code
    public static void main(String args[])
    {
        converter();
    }
}
