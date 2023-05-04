import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.JButton;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

public class App extends JFrame {

    float res = 0;
    public App() throws IOException, FontFormatException {
        // Create APP

        Color realOrange = new Color(246,153,6);
        setTitle("Calculator");
        setIconImage(new ImageIcon("icon.png").getImage());
        setSize(350, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create Panel for the calculator
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(350, 600));

        // Create the button0
        RoundButton0 button0 = new RoundButton0("0", Color.DARK_GRAY, Color.WHITE);
        button0.setBorder(null);
        button0.setBounds(20, 460, 135, 60);
        panel.add(button0);

        // Create the buttonVirgule
        RoundedButton buttonVirgule = new RoundedButton(",", Color.DARK_GRAY, Color.WHITE);
        buttonVirgule.setBounds(170, 460, 60, 60);
        buttonVirgule.setBorder(null);
        panel.add(buttonVirgule);

        // Create the buttonEgal
        RoundedButton buttonEgal = new RoundedButton("=", realOrange, Color.WHITE);
        buttonEgal.setBorder(null);
        buttonEgal.setBounds(245, 460, 60, 60);
        panel.add(buttonEgal);

        // Create button 1
        RoundedButton button1 = new RoundedButton("1", Color.DARK_GRAY, Color.WHITE);
        button1.setBorder(null);
        button1.setBounds(20, 380, 60, 60);
        panel.add(button1);

        // Create button 2
        RoundedButton button2 = new RoundedButton("2", Color.DARK_GRAY, Color.WHITE);
        button2.setBorder(null);
        button2.setBounds(95, 380, 60, 60);
        panel.add(button2);

        // Create button 3
        RoundedButton button3 = new RoundedButton("3", Color.DARK_GRAY, Color.WHITE);
        button3.setBorder(null);
        button3.setBounds(170, 380, 60, 60);
        panel.add(button3);

        // Create button Plus
        RoundedButton buttonPlus = new RoundedButton("+", realOrange, Color.WHITE);
        buttonPlus.setBorder(null);
        buttonPlus.setBounds(245, 380, 60, 60);
        panel.add(buttonPlus);

        // Create button 4
        RoundedButton button4 = new RoundedButton("4", Color.DARK_GRAY, Color.WHITE);
        button4.setBorder(null);
        button4.setBounds(20, 300, 60, 60);
        panel.add(button4);

        // Create button 5
        RoundedButton button5 = new RoundedButton("5", Color.DARK_GRAY, Color.WHITE);
        button5.setBorder(null);
        button5.setBounds(95, 300, 60, 60);
        panel.add(button5);

        // Create button 6
        RoundedButton button6 = new RoundedButton("6", Color.DARK_GRAY, Color.WHITE);
        button6.setBorder(null);
        button6.setBounds(170, 300, 60, 60);
        panel.add(button6);

        // Create button Moins
        RoundedButton buttonMoins = new RoundedButton("-", realOrange, Color.WHITE);
        buttonMoins.setBorder(null);
        buttonMoins.setBounds(245, 300, 60, 60);
        panel.add(buttonMoins);

        // Create button 7
        RoundedButton button7 = new RoundedButton("7", Color.DARK_GRAY, Color.WHITE);
        button7.setBorder(null);
        button7.setBounds(20, 220, 60, 60);
        panel.add(button7);

        // Create button 8
        RoundedButton button8 = new RoundedButton("8", Color.DARK_GRAY, Color.WHITE);
        button8.setBorder(null);
        button8.setBounds(95, 220, 60, 60);
        panel.add(button8);

        // Create button 9
        RoundedButton button9 = new RoundedButton("9", Color.DARK_GRAY, Color.WHITE);
        button9.setBorder(null);
        button9.setBounds(170, 220, 60, 60);
        panel.add(button9);

        // Create button Fois
        RoundedButton buttonFois = new RoundedButton("x", realOrange, Color.WHITE);
        buttonFois.setBorder(null);
        buttonFois.setBounds(245, 220, 60, 60);
        panel.add(buttonFois);

        // Create button C
        RoundedButton buttonC = new RoundedButton("C", Color.LIGHT_GRAY, Color.BLACK);
        buttonC.setBorder(null);
        buttonC.setBounds(20, 140, 60, 60);
        panel.add(buttonC);

        // Create button PlusMoins
        RoundedButton buttonPlusMoins = new RoundedButton("+/-", Color.LIGHT_GRAY, Color.BLACK);
        buttonPlusMoins.setBorder(null);
        buttonPlusMoins.setBounds(95, 140, 60, 60);
        panel.add(buttonPlusMoins);

        // Create button Pourcent
        RoundedButton buttonPourcent = new RoundedButton("%", Color.LIGHT_GRAY, Color.BLACK);
        buttonPourcent.setBorder(null);
        buttonPourcent.setBounds(170, 140, 60, 60);
        panel.add(buttonPourcent);

        // Create button Divise
        RoundedButton buttonDivise = new RoundedButton("÷", realOrange, Color.WHITE);
        buttonDivise.setBorder(null);
        buttonDivise.setBounds(245, 140, 60, 60);
        panel.add(buttonDivise);


        JLabel affichage = new JLabel(String.valueOf(res));
        Font iPhone = Font.createFont(Font.TRUETYPE_FONT, new File("ios.otf")).deriveFont(Font.BOLD, 30);
        affichage.setFont(iPhone);
        affichage.setForeground(Color.WHITE);
        affichage.setBounds(250, 30, 600, 180);
        panel.add(affichage);
        add(panel);
    }

    public static void main(String[] args) throws IOException, FontFormatException {
        App app = new App();
        app.setVisible(true);
    }
}
