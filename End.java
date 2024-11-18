import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class End extends JFrame {
    JButton submit;

    End() {
        //copy from here
        JPanel form = new JPanel();
        JPanel deco = new JPanel();
        JPanel instruc = new JPanel();
        JLabel instrucLabel = new JLabel();
        JLabel decoLabel = new JLabel();
        JProgressBar progressBar = new JProgressBar();
        submit = new JButton();

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

        //adding the final note
        JLabel note = new JLabel();
        note.setText("Your Resume is ready!");
        note.setBounds(60, 100, 200, 200);
        note.setFont(new Font("Monotone", Font.BOLD, 18));

        form.add(note);

        //setting up the progress bar
        progressBar.setBounds(50, 100, 600, 20);
        progressBar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        progressBar.setStringPainted(true);
        progressBar.setValue(100);
        progressBar.setForeground(Color.BLACK);

        //setting up the form panel
        form.setBounds(50, 200, 350, 400);
        form.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        form.setOpaque(false);
        form.setLayout(null);

        //adding the submit button
        submit.setBounds(70, 250, 200, 40);
        submit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submit.setText("Less go");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Monotone", Font.BOLD, 20));
        submit.setFocusable(false);

        form.add(submit);

        //setting up the deco
        deco.setBounds(700, 200, 300, 300);
        deco.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        deco.setLayout(new BorderLayout());

        decoLabel.setText("<html>;;;;;;;;;;<br>aaaaaaaaaa<br>~~~~~~~~~~<br>zzzzzzzzzz<br>**********<br>$$$$$$$$$$<br>" +
                "&&&&&&&&&&<br>##########<br>4444444444<br>qqqqqqqqqq<br>;;;;;;;;;;</html>");
        decoLabel.setFont(new Font("Monotone", Font.BOLD, 20));
        decoLabel.setHorizontalAlignment(JLabel.CENTER);
        decoLabel.setVerticalAlignment(JLabel.TOP);

        deco.add(decoLabel);

        this.add(deco);


        //adding an info bar at the top
        instruc.setBounds(50, 60, 400, 30);
//     instruc.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        instruc.setLayout(new BorderLayout());

        instrucLabel.setText("And here we are :)");
        instrucLabel.setFont(new Font("monotone", Font.BOLD, 20));
        instrucLabel.setHorizontalAlignment(JLabel.LEFT);
        instrucLabel.setVerticalAlignment(JLabel.BOTTOM);

        instruc.add(instrucLabel);

        this.add(instruc);

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
