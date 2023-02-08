package MyOwnProject.GUI.VariousGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    public static String login = "Michał";
    public static String haslo = "aaaaa";

    public static JLabel userLabel;
    public static JTextField userTextField;
    public static JLabel passwordLabel;
    public static JPasswordField pswdText;
    public static JButton button;
    public static JLabel succes;
    public static JLabel foot;
    public static JLabel count;
    public int number = 0;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
//--------------------------------------------------------------------------
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
//--------------------------------------------------------------------------
        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
//--------------------------------------------------------------------------
        userTextField = new JTextField(20);
        userTextField.setBounds(100, 20, 165, 25);
        panel.add(userTextField);
//--------------------------------------------------------------------------
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 165, 25);
        panel.add(passwordLabel);
//--------------------------------------------------------------------------
        pswdText = new JPasswordField(10);
        pswdText.setBounds(100, 50, 165, 25);
        panel.add(pswdText);
//--------------------------------------------------------------------------
        button = new JButton("Login");
        button.setFocusable(false);
        button.setMargin(new Insets(0,0,0,0));
        button.setBounds(100, 80, 75, 25);
        button.addActionListener(new Login());
        panel.add(button);
//--------------------------------------------------------------------------
        succes = new JLabel("");
        succes.setBounds(10, 110, 300, 25);
        panel.add(succes);
        foot = new JLabel("");
        foot.setBounds(10, 140, 300, 25);
        panel.add(foot);
        count = new JLabel("Click: 0");
        count.setBounds(20, 170, 300, 25);
        panel.add(count);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        number++;
        String user = userTextField.getText();
        char[] pf = pswdText.getPassword();
        String pswd = new String(pf);
        if (user.equals(login) && pswd.equals(haslo)) {
            succes.setText("Login successful !");
        } else if (user.isEmpty() && pswd.isEmpty() ||
                !user.isEmpty() && pswd.isEmpty() ||
                user.isEmpty() && !pswd.isEmpty()) {
            succes.setText("Incomplete data !");
        } else if (!user.equals(login) || !pswd.equals(haslo)) {
            succes.setText("Access Denied");
        }
        if (number >= 30) {
            foot.setText("Dobra, starczy, skończ Pan klikać...!  Ile można?");
        }
        if (number >= 50) {
            foot.setText("No nienormalny, zwariował do reszty ?!?!?!?!");
        }
        if (number >= 65) {
            foot.setText("Nudzi Ci się, co ??");
        }
        if (number >= 80) {
            foot.setText(" A kij tam, klikaj... ja mam czas...");
        }
        if (user.equals(login) && pswd.equals(haslo)) {
            if(number>30) {
                succes.setText("Login successful !");
                foot.setText("Nareszcie... Ale przestań już klikać !");
            }
        }
        count.setText("Click: " + number);
    }
}
