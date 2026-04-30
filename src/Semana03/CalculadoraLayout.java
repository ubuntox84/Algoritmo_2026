/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author u
 */
public class CalculadoraLayout extends JFrame{
    public CalculadoraLayout() {
        setTitle("Esquema Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        
        // 1. Definimos el Layout del Frame principal
        setLayout(new BorderLayout(5, 5));

        // 2. La Pantalla (Norte)
        JTextField pantalla = new JTextField("0");
        pantalla.setFont(new Font("Arial", Font.BOLD, 24));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        add(pantalla, BorderLayout.NORTH);

        // 3. El Panel de Botones (Centro)
        JPanel panelBotones = new JPanel();
        // GridLayout: 4 filas, 4 columnas, 5px de espacio entre ellos
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5));

        String[] botones = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String texto : botones) {
            panelBotones.add(new JButton(texto));
        }

        add(panelBotones, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        // Asegura que la UI se cree en el hilo de despacho de eventos
        SwingUtilities.invokeLater(() -> {
            new CalculadoraLayout().setVisible(true);
        });
    }

}
