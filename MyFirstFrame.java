/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author anele
 */
public class MyFirstFrame extends JFrame
{
    public MyFirstFrame()
    {
        setTitle("My First Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,250);
        setResizable(false);
        setForeground(Color.BLUE);
        setDefaultLookAndFeelDecorated(true);
        setVisible(true);
    }
    
}
