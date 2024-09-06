package Lib;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class lib_swing
{
    public static void SetUp()
    {
        JFrame frame = new JFrame();
        frame.setSize(450, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(10, 10, 10));
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JLabel output = new JLabel("null", SwingConstants.CENTER);
        output.setBounds(17, 25, 400, 50);
        output.setForeground(Color.white);
        output.setBackground(Color.black);
        output.setBorder(BorderFactory.createLineBorder(Color.white));
        output.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
        frame.add(output);

        JTextField input = new JTextField("", SwingConstants.CENTER);
        input.setBounds(90, 100, 250, 35);
        input.setForeground(Color.white);
        input.setBackground(new Color(10, 10, 10));
        input.setFont(new Font(Font.DIALOG, Font.PLAIN, 25));
        frame.add(input);

        JButton button = new JButton();
        button.setBounds(150, 150, 125, 20);
        button.setForeground(Color.white);
        button.setBackground(new Color(10, 10, 10));
        button.setText("Enter");
        button.setFont(new Font(Font.DIALOG, Font.PLAIN, 15));
        frame.add(button);

        button.addActionListener(new ActionListener()
        {
            @Override

            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    InetAddress ip = InetAddress.getByName(input.getText());

                    output.setText(ip.toString());
                }
                catch(UnknownHostException UHE)
                {
                    lib_misc.Error("Invalid URL");
                    output.setText("Invalid URL");
                }
            }
        });


        frame.setVisible(true);
    }
}