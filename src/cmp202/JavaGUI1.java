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

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class JavaGUI1 {
    
    JComboBox jCB;
    JFrame mFrame = new JFrame();
    JPanel mPanel = new JPanel();
    JPanel mPanel2 = new JPanel();
    JTextField myText = new JTextField("Enter name here");
    JLabel myLabel = new JLabel();
    JButton mButton = new JButton("Click me");
    JButton mButton1 = new JButton("Submit");
    JButton mButton2 = new JButton("Load previous panel");
    
    public JavaGUI1()
    {
        mFrame.setSize(400,500);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mPanel.add(myText);
        mPanel.add(mButton);
        mPanel.add(mButton1);
        mFrame.add(mPanel2);
        mFrame.add(mPanel);
        mFrame.setVisible(true);
        mFrame.setTitle("Iron man rocks");
        mPanel.setLayout(new GridLayout(2,3,4,4));
        //mPanel2.add(mButton2);
        
        String[] myArray = {"barka","batman","bossmajor"};
        jCB = new JComboBox(myArray);
        mPanel.add(jCB);
        mPanel.add(mButton2);
        
        mButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(jCB.getSelectedItem().toString().equals("bossmajor"))
                {
                    System.out.print("boss major");
                }
                else
                {
                    mFrame.add(mPanel);
                }
            }
        });
        
        mButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if(jCB.getSelectedItem().toString().equals("batman"))
                {
                    JOptionPane.showMessageDialog(null,"Iron man sucks");
                    mButton.setText("clicked other button");
                }
            }
        });
        
        mButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                mFrame.add(mPanel);
            }
        });
        
    }
    
    public static void main(String [] args)
    {
        new JavaGUI1();
    }
    
}