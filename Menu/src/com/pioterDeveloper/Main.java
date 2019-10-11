package com.pioterDeveloper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.security.Key;

public class Main{

    public static void main(String[] args){
        JFrame f = new JFrame("Button Example");

        //enter name label
        JLabel labe1_1 = new JLabel();
        JLabel labe1_2 = new JLabel();
        JLabel labe1_3 = new JLabel();

        labe1_1.setText("First number :");
        labe1_1.setBounds(10, 10, 100, 100);

        labe1_2.setText("Second number :");
        labe1_2.setBounds(10, 120, 200, 100);

        labe1_3.setText("Result :");
        labe1_3.setBounds(10, 220, 200, 100);

        //empty label which will show event after button clicked
//        JLabel label1 = new JLabel();
//        label1.setBounds(10, 110, 200, 100);

        //textfield to enter name
        JTextField textField_1 = new JTextField();
        textField_1.setBounds(120, 45, 130, 30);

        JTextField textField_2 = new JTextField();
        textField_2.setBounds(120, 155, 130, 30);

        JTextField textField_3 = new JTextField();
        textField_3.setBounds(120, 255, 130, 30);

        //submit button
        JButton button1 = new JButton("Submit");
        button1.setBounds(115,200,140, 40);

        //variable for operations
//        this.a = Integer.parseInt(textField_1.getText());
//        this.b = Integer.parseInt(textField_2.getText());

        JButton button2 = new JButton("+");
        button2.setBounds(70,90,50, 50);
//        button2.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                this.result = a + b;
//            }
//        });

        JButton button3 = new JButton("-");
        button3.setBounds(130,90,50, 50);

        JButton button4 = new JButton("/");
        button4.setBounds(190,90,50, 50);

        JButton button5 = new JButton("*");
        button5.setBounds(250,90,50, 50);


        //add to frame
        f.add(labe1_1);
        f.add(textField_1);
        f.add(button2);
        f.add(button4);
        f.add(button3);
        f.add(button5);
        f.add(labe1_2);
        f.add(textField_2);
        //f.add(label1);
        f.add(button1);
        f.add(labe1_3);
        f.add(textField_3);
        f.setSize(330,350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
