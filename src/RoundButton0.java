//import java.awt.*;
//import java.awt.geom.RoundRectangle2D;
//import java.io.File;
//import java.io.IOException;
//import javax.swing.*;
//
//public class RoundButton0 extends JButton {
//
//    Color colorB;
//    Color colorT;
//
//    public RoundButton0(String text, Color colorB, Color colorT) {
//        super(text);
//        this.colorB = colorB;
//        this.colorT = colorT;
//        setOpaque(false);
//        setFocusPainted(false);
//        setBorderPainted(false);
//        setBorder(null);
//        setContentAreaFilled(false);
//        try {
//            Font iPhone = Font.createFont(Font.TRUETYPE_FONT, new File("ios.otf")).deriveFont(Font.BOLD, 30);
//            setFont(iPhone);
//        } catch (IOException | FontFormatException e) {
//            e.printStackTrace();
//        }
//        setContentAreaFilled(false);
//        setHorizontalAlignment(SwingConstants.LEFT);
//        setVerticalAlignment(SwingConstants.CENTER);
//        setPreferredSize(new Dimension(50, 50)); // Définissez la taille préférée de votre bouton
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        Graphics2D g2 = (Graphics2D) g;
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        RoundRectangle2D.Float r = new RoundRectangle2D.Float(0.5f, 0.5f, getWidth()-1, getHeight()-1, 50.0f, 50.0f);
//        g2.clip(r);
//        g2.setColor(colorB);// Définir la couleur de fond
//        setForeground(colorT);// Définir la couleur du texte
//        g2.fillRect(0, 0, getWidth(), getHeight());
//        super.paintComponent(g2);
//    }
//
//    public void setTextBounds(int x, int y, int width, int height) {
//        setBounds(x, y, width, height);
//    }
//}
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class RoundButton0 extends JButton {

    Color colorB;
    Color colorT;
    int textMarginLeft;
    int textMarginTop;

    public RoundButton0(String text, Color colorB, Color colorT) {
        super(text);
        this.colorB = colorB;
        this.colorT = colorT;
        this.textMarginLeft = 20;
        this.textMarginTop = 5;
        setOpaque(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setBorder(null);
        setContentAreaFilled(false);
        try {
            Font iPhone = Font.createFont(Font.TRUETYPE_FONT, new File("ios.otf")).deriveFont(Font.BOLD, 30);
            setFont(iPhone);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        setContentAreaFilled(false);
        setHorizontalAlignment(SwingConstants.LEFT);
        setVerticalAlignment(SwingConstants.CENTER);
        setPreferredSize(new Dimension(50, 50)); // Définissez la taille préférée de votre bouton
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(getFont());
        RoundRectangle2D.Float r = new RoundRectangle2D.Float(0.5f, 0.5f, getWidth()-1, getHeight()-1, 50.0f, 50.0f);
        g2.clip(r);
        FontMetrics metrics = g2.getFontMetrics(getFont());
        g2.setColor(colorB);// Définir la couleur de fond
        setForeground(colorT);// Définir la couleur du texte
        g2.fillRect(0, 0, getWidth(), getHeight());
        //super.paintComponent(g2);
        int x = textMarginLeft;
        int y = textMarginTop + ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
        g2.setColor(getForeground());
        g2.drawString(getText(), x, y);
        g2.dispose();
    }

    public void setTextBounds(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
    }
}


