import javax.swing.*;
import java.awt.event.*;

public class VentanaSaludo {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("App de Saludo");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);

        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 25);

        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270, 30, 100, 25);

        JLabel etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 80, 300, 25);

        // Línea corregida:
        botonSaludar.addActionListener(e -> {
            String nombre = campoTexto.getText();
            etiquetaSaludo.setText("Hola, " + nombre + "!");
        });

        ventana.add(campoTexto);
        ventana.add(botonSaludar);
        ventana.add(etiquetaSaludo);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}