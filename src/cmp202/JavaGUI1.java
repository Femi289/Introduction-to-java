/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cmp202;

/**
 *
 * @author Barka
 */

import java.awt.AWTEvent;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.*;
import javax.swing.Action;

public class JavaGUI1 {
    
    JFrame mFrame = new JFrame();
    JPanel mPanel = new JPanel();
    JTextField myText = new JTextField("Enter name here");
    JLabel myLabel = new JLabel();
    JButton mButton = new JButton("Click me");
    JButton mButton1 = new JButton("Submit");
    
    public JavaGUI1()
    {
        mFrame.setSize(400,400);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mPanel.add(myText);
        mPanel.add(mButton);
        mPanel.add(mButton1);
        mFrame.add(mPanel);
        mFrame.setVisible(true);
        
        mButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Button Clicked");
                mButton.setText("clicked other button");
            }
        });
    }
    
    public static void main(String [] args)
    {
        new JavaGUI1();
    }
    
}
