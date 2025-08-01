package cyberchicken;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Floor5LinServ implements WindowListener {
    GridBagConstraints loginGBC = new GridBagConstraints();
    public Floor5LinServ(int width, int height) {
        JFrame login = new JFrame();
        login.setSize(width, height);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel infoPanel = new JPanel();
        login.add(infoPanel, BorderLayout.SOUTH);
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.X_AXIS));
        infoPanel.add(Box.createHorizontalGlue());
        infoPanel.add(new JButton("Info"));
        login.addWindowListener(this);
        JPanel holder = new JPanel();
// testing git

        login.add(holder);

        JPanel loginPanel = new JPanel();

        JPanel credentials = new JPanel(new GridBagLayout());
// default accent = new Color(140, 36, 51);
        credentials.setBorder(BorderFactory.createLineBorder(UIManager.getColor("Component.accentColor")));

        JPanel user = new JPanel();
        JPanel password = new JPanel();
        JPanel port = new JPanel();

        JPanel userLabelPanel = new JPanel();
        JPanel passwordLabelPanel = new JPanel();
        JPanel portLabelPanel = new JPanel();

        JLabel userLabel = new JLabel("User: ");
        JTextField userField = new JTextField();
        user.setLayout(new BoxLayout(user, BoxLayout.Y_AXIS));
        userLabelPanel.add(userLabel);
        //userLabelPanel.add(Box.createHorizontalGlue());
        user.add(userLabelPanel);
        user.add(userField);
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField passwordField = new JPasswordField();
        password.setLayout(new BoxLayout(password, BoxLayout.Y_AXIS));
        passwordLabelPanel.add(passwordLabel);
        //passwordLabelPanel.add(Box.createHorizontalGlue());
        password.add(passwordLabelPanel);
        password.add(passwordField);
        JLabel portLabel = new JLabel("Port: ");
        JTextField portField = new JTextField();
        port.setLayout(new BoxLayout(port, BoxLayout.Y_AXIS));
        portLabelPanel.add(portLabel);
        port.add(portLabelPanel);
        port.add(portField);
        userLabelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        passwordLabelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        portLabelPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        userLabelPanel.setMinimumSize(new Dimension(240,20));
        passwordLabelPanel.setMinimumSize(new Dimension(240,20));
        portLabelPanel.setMinimumSize(new Dimension(120,20));
        userLabelPanel.setMaximumSize(new Dimension(240,20));
        passwordLabelPanel.setMaximumSize(new Dimension(240,20));
        portLabelPanel.setMaximumSize(new Dimension(120,20));
        userLabelPanel.setPreferredSize(new Dimension(240,20));
        passwordLabelPanel.setPreferredSize(new Dimension(240,20));
        portLabelPanel.setPreferredSize(new Dimension(120,20));

        userField.setMinimumSize(new Dimension(240,20));
        passwordField.setMinimumSize(new Dimension(240,20));
        portField.setMinimumSize(new Dimension(120,20));
        userField.setMaximumSize(new Dimension(240,20));
        passwordField.setMaximumSize(new Dimension(240,20));
        portField.setMaximumSize(new Dimension(120,20));
        userField.setPreferredSize(new Dimension(240,20));
        passwordField.setPreferredSize(new Dimension(240,20));
        portField.setPreferredSize(new Dimension(120,20));

        loginGBC.gridx = 0;
        loginGBC.gridy = 0;
        credentials.add(user, loginGBC);
        loginGBC.gridx = 0;
        loginGBC.gridy = 1;
        credentials.add(password, loginGBC);
        loginGBC.gridx = 0;
        loginGBC.gridy = 2;
        credentials.add(port, loginGBC);


        holder.add(credentials);
        login.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Waiting for login...");
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
