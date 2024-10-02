import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Interfaz");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Interfaz());
                frame.pack();
                frame.setLocationRelativeTo(null); // Centrar la ventana
                frame.setVisible(true);
            }
        });
    }
}