import javax.swing.*;
import java.awt.*;

public class Form1 extends JFrame {
    Form1(){
        JTextField firstName = new JTextField();
        JTextField lastName = new JTextField();

        //copy from here
        JPanel form = new JPanel();
//        JPanel art = new JPanel();
//        JLabel artLabel = new JLabel();
        JProgressBar progressBar = new JProgressBar();
        JButton submit = new JButton();

        //setting up a basic frame
        this.setSize(1210, 760);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
//        this.getContentPane().setBackground(new Color(66, 239, 245));
        this.setTitle("Resume Builder");
        ImageIcon icon = new ImageIcon("frame icon.jpg");
        this.setIconImage(icon.getImage());

        //setting up the progress bar
        progressBar.setBounds(50, 100, 600, 20);
        progressBar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        progressBar.setStringPainted(true);
        progressBar.setValue(0);

        //setting up the form panel
        form.setBounds(50, 200, 350, 400);
        form.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        form.setOpaque(false);
        form.setLayout(null);

        //adding the name text fields
        firstName.setBounds(20, 80, 300, 40);
        firstName.setText("First Name");
        firstName.setFont(new Font("calibri", Font.ITALIC, 20));

        lastName.setBounds(20, 200, 300, 40);
        lastName.setText("Last Name");
        lastName.setFont(new Font("calibri", Font.ITALIC, 20));

        form.add(firstName);
        form.add(lastName);

        //adding the submit button
        submit.setBounds(85, 350, 150, 40);
        submit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submit.setText("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Monotone", Font.BOLD, 20));
        submit.setFocusable(false);

        form.add(submit);

//        //IGOR ( backchod joke )
//        ImageIcon tyler = new ImageIcon("tyler mugshot.jpg");
//        JLabel pic = new JLabel();
//        pic.setIcon(tyler);
//        pic.setBounds(500, 200, 500, 300);
//        this.add(pic);


        this.add(form);
        this.add(progressBar);
        this.setVisible(true);
    }
}
