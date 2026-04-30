/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author u
 */
public class ejer04 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Mi primer APP");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel label=new JLabel("Presion el boton");
        label.setBounds(50, 30, 200, 30);
        frame.add(label);
        
        JButton button=new JButton("Haz clic aquí");
        button.setBounds(50, 80, 150, 30);
        frame.add(button);
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("Hola desde Java Swing!");
            }
        });
        
        frame.setVisible(true);
    }
}
