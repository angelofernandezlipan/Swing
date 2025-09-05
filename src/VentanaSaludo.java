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
        super("App de Saludo");

        // Configuración de la ventana
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(230, 230, 250)); // Color lavanda

        // Inicializar componentes
        campoTexto = new JTextField();
        campoTexto.setBounds(50, 30, 200, 25);

        botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270, 30, 100, 25);

        etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 80, 300, 25);
        etiquetaSaludo.setFont(new Font("Arial", Font.BOLD, 14));

        JButton botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(270, 60, 100, 25);

        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    botonSaludar.doClick(); // Simula el clic en el botón "Saludar"
                }
            }
        });

        botonSaludar.addActionListener(_ -> {
            String nombre = campoTexto.getText().trim();

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingresa tu nombre.");
            } else {
                Usuario usuario = new Usuario(nombre);
                etiquetaSaludo.setText(usuario.getSaludo());
            }
        });

        botonLimpiar.addActionListener(_ -> {
            campoTexto.setText("");
            etiquetaSaludo.setText("");
        });

        this.add(campoTexto);
        this.add(botonSaludar);
        this.add(etiquetaSaludo);
        this.add(botonLimpiar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaSaludo ventana = new VentanaSaludo();
            ventana.setVisible(true);
        });
    }
}