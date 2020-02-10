/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author arivera
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sorting gui = new Sorting();
    }
    
    private JFrame frame = new JFrame("Sorting");
    private JLabel instructions;
    private JTextField input;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;
   
    public Sorting(){
       // Frame Characteristics
       frame.setLayout(null);
              
       // JLabel(instructions) Characteristics
       instructions = new JLabel("Enter Up To 10 Integers To Sort");
       instructions.setFont(new Font("Times New Roman", Font.BOLD, 15));
       instructions.setForeground(Color.black);
       instructions.setBounds(115, 26, 250, 30);
       
       // JTextField Characteristics
       input = new JTextField();
       input.setBounds(120, 80, 200, 30);
       
       // Create the menu Bar
       menuBar = new JMenuBar();
       menuBar.setBackground(Color.BLACK);
       
       frame.setJMenuBar(menuBar);
       
       // First menu(Sort Menu)
       menu = new JMenu("Sort");
       menu.setForeground(Color.WHITE);
       menuBar.add(menu);
       
       // adding JMenuItems
       menuItem = new JMenuItem("Bubble");
       menu.add(menuItem);
       menuItem = new JMenuItem("Selection");
       menu.add(menuItem);
       
       //Second Menu(Clear Menu)
       menu = new JMenu("Clear");
       menu.setForeground(Color.WHITE);
       menuBar.add(menu);
       
       menuItem = new JMenuItem("Clear Label");
       menu.add(menuItem);
       menuItem = new JMenuItem("Clear TextBox");
       menu.add(menuItem);
       
       // Third Menu(Print Menu)
       menu = new JMenu("Print");
       menu.setForeground(Color.WHITE);
       menuBar.add(menu);
       
       menuItem = new JMenuItem("Print");
       menu.add(menuItem);
       
       
       frame.add(instructions);
       frame.add(input);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       frame.setSize(new Dimension(450,375));
    }
    
    
}
