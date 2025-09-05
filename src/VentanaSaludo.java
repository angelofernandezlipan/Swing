import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSaludo extends JFrame {

    private final JTextField campoTexto;
    private final JLabel etiquetaSaludo;

    public VentanaSaludo() {
        super("App de Saludo ICC490"); // Llama al constructor de JFrame

        // Configuración de la ventana
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        // Inicializar componentes
        campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 25);

        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270, 30, 100, 25);

        etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 80, 300, 25);

        // Agregar listener
        botonSaludar.addActionListener(e -> {
            String nombre = campoTexto.getText();
            etiquetaSaludo.setText("Hola, " + nombre + "!");
        });

        // Agregar componentes a la ventana
        this.add(campoTexto);
        this.add(botonSaludar);
        this.add(etiquetaSaludo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaSaludo ventana = new VentanaSaludo();
            ventana.setVisible(true);
        });
    }
}