import java.awt.*;
import javax.swing.JButton;
import java.awt.Font;
import java.io.File;
import java.io.IOException;

public class RoundedButton extends JButton {

    Color colorB;
    Color colorT;

    public RoundedButton(String text, Color colorB, Color colorT) {
        super(text);
        this.colorT = colorT;
        this.colorB = colorB;
        setOpaque(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setBorder(null);
        setContentAreaFilled(false);
        setPreferredSize(new Dimension(50, 50)); // Définissez la taille préférée de votre bouton
        try {
            Font iPhone = Font.createFont(Font.TRUETYPE_FONT, new File("ios.otf")).deriveFont(Font.BOLD, 30);
            setFont(iPhone);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        setContentAreaFilled(false);
        setPreferredSize(new Dimension(50, 50)); // Définissez la taille préférée de votre bouton
    }


    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(colorB);
        setForeground(colorT);
        g2.fillOval(0, 0, getWidth(), getHeight());
        g2.setColor(colorT);
        g2.drawString(getText(), getWidth()/2 - g2.getFontMetrics().stringWidth(getText())/2, getHeight()/2 + g2.getFontMetrics().getHeight()/4);
        g2.dispose();
    }

}

