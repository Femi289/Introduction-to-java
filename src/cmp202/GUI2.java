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

public class GUI2 {
    
    JFrame myJF = new JFrame();
    JPanel myJPanel = new JPanel();
    
    JTextField myTextField = new JTextField();
    JTextField myTextField2 = new JTextField();
    
    JComboBox myComboBox;
    
    JLabel checker = new JLabel("Everything is fine");
    
    JButton myButton1 = new JButton("Do stuff");
    JButton myButton2 = new JButton("Password");
 
    
    public void paintUIElements()
    {
        myJF.setSize(300,300);
        myJF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myJF.setVisible(true);
        
        myJF.add(myJPanel);
        myJF.setTitle("Welcome to Gotham");
        
        String[] myComboBoxContent = {"Arkham", "Joker", "Iron man"};
        myComboBox = new JComboBox(myComboBoxContent);
        
        myJPanel.add(myTextField);
        myJPanel.add(myTextField2);
        myJPanel.add(myComboBox);
        myJPanel.add(checker);
        myJPanel.add(myButton1);
        myJPanel.add(myButton2);
        
        myJPanel.setLayout(new GridLayout(3,2,4,4));
        
        myButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(myComboBox.getSelectedItem().toString().equals("Iron man"))
                {
                    JOptionPane.showMessageDialog(null, "Iron man sucks");
                }
                int num1 = Integer.parseInt(myTextField.getText().toString());
                int num2 = Integer.parseInt(myTextField.getText().toString());
                checker.setText("Error");
            }
        });
    }
    
    public GUI2()
    {
        paintUIElements();
    }
    
    public static void main(String [] args)
    {
     new GUI2();
    }
}