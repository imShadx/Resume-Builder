import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form3 extends JFrame implements ActionListener{
    //adding a string array to store all the work data
    public static ArrayList<String> workData;

    //declaring the text fields for work exp
    JTextField exp1;
    JTextField exp2;
    JTextField exp3;

    JButton submit;

    Form3() {
        //copy from here
        JPanel form = new JPanel();
        JPanel deco = new JPanel();
        JPanel instruc = new JPanel();
        JLabel instrucLabel = new JLabel();
        JLabel decoLabel = new JLabel();
        JProgressBar progressBar = new JProgressBar();
        exp1 = new JTextField();
        exp2 = new JTextField();
        exp3 = new JTextField();
        submit = new JButton();

        //setting up the text fields for work exp
        exp1.setBounds(30, 80, 300, 40);
        exp1.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        exp2.setBounds(30, 150, 300, 40);
        exp2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        exp3.setBounds(30, 220, 300, 40);
        exp3.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        form.add(exp1);
        form.add(exp2);
        form.add(exp3);

        workData = new ArrayList<>();

        //adding the work exp tag
        JLabel expTag = new JLabel();
        expTag.setText("Enter your work experience below:");
        expTag.setFont(new Font("Monotone", Font.BOLD, 15));
        expTag.setBounds(30, 30, 300, 40);
        form.add(expTag);

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
        progressBar.setValue(40);
        progressBar.setForeground(Color.BLACK);

        //setting up the form panel
        form.setBounds(50, 200, 350, 400);
        form.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        form.setOpaque(false);
        form.setLayout(null);

        //adding the submit button
        submit.setBounds(85, 350, 150, 40);
        submit.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        submit.setText("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Monotone", Font.BOLD, 20));
        submit.setFocusable(false);
        submit.addActionListener(this);

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

        instrucLabel.setText("Kindly enter your info below.");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            workData.add(exp1.getText());
            workData.add(exp2.getText());
            workData.add(exp3.getText());

            new Form4();
            this.dispose();
        }
    }
}
