import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String path) {
        if(path != null && !path.isEmpty()) {
            ImageIcon icon = new ImageIcon(path);
            backgroundImage = icon.getImage();
            if(icon.getIconWidth() <= 0){
                System.out.println("Cannot load image: " + path);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }
}