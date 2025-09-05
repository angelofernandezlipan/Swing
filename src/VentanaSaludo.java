import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaSaludo extends JFrame {

    private final JTextField campoTexto;
    private final JLabel etiquetaSaludo;
    private final JButton botonSaludar;

    public VentanaSaludo() {
        super("App de Saludo ICC490");

        // Window configuration
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(230, 230, 250)); // lavender color

        // Initialize components
        campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 25);

        botonSaludar = new JButton("Saludar"); // Initialized here
        botonSaludar.setBounds(270, 30, 100, 25);

        etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 80, 300, 25);
        etiquetaSaludo.setFont(new Font("Arial", Font.BOLD, 14));

        // Event handling
        // Add KeyListener to the text field to handle the ENTER key
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick(); // This now works because botonSaludar is a field
                }
            }
        });

        // Add ActionListener to the button
        botonSaludar.addActionListener(_ -> {
            String nombre = campoTexto.getText().trim();

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingresa tu nombre.");
            } else {
                etiquetaSaludo.setText("¡Hola, " + nombre + "!");
            }
        });

        // Add components to the window
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