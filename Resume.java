import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class Resume extends JFrame {
    Resume() {
        JPanel main = new JPanel();
        JPanel heading = new JPanel();
        JLabel header = new JLabel();
        JLabel img = new JLabel();
        JLabel disc = new JLabel();

        //adding all the necessary panels for the info
        JPanel hahaImg = new JPanel();
        hahaImg.setBounds(550, 100, 250, 250);
//        hahaImg.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        ImageIcon haha = new ImageIcon("tyler mugshot.jpg");
        Image temp = haha.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon haha2 = new ImageIcon(temp);

        JPanel name = new JPanel();
        name.setBounds(30, 30, 400, 60);
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        name.setLayout(new BorderLayout());

        JPanel quali = new JPanel();
        quali.setBounds(450, 30, 400, 60);
        quali.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        quali.setLayout(new BorderLayout());

        JPanel PQ = new JPanel();
        PQ.setBounds(30, 100, 350, 200);
        PQ.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        PQ.setLayout(new BorderLayout());

        JPanel skills = new JPanel();
        skills.setBounds(30, 320, 300, 200);
        skills.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        skills.setLayout(new BorderLayout());

        JPanel aBout = new JPanel();
        aBout.setBounds(30, 540, 300, 200);
        aBout.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        aBout.setLayout(new BorderLayout());

        JPanel beg = new JPanel();
        beg.setBounds(400, 360, 400, 250);
        beg.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        beg.setLayout(new BorderLayout());

        JPanel contact = new JPanel();
        contact.setBounds(550, 650, 300, 100);
//        contact.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contact.setLayout(new BorderLayout());

        main.add(name);
        main.add(quali);
        main.add(PQ);
        main.add(skills);
        main.add(aBout);
        main.add(hahaImg);
        main.add(beg);
        main.add(contact);

        //getting all the info from other classes

        String fullName = Form1.stringFirst + " " + Form1.stringLast;
        String field = Form2.schoolCheck + "-" + Form2.fieldCheck;

        StringBuilder PQtext = new StringBuilder("<html>");
        for (String item : Form3.workData) {
            PQtext.append(item).append("<br> <br>");
        }
        PQtext.append("</html>");

        StringBuilder skillText = new StringBuilder("<html>");
        for (String item : Form4.skillHobby) {
            skillText.append(item).append("<br> <br> <br>");
        }
        skillText.append("</html>");

        StringBuilder aboutText = new StringBuilder("<html>");
        for (String item : Form5.infoMe) {
            aboutText.append(item).append("<br> <br> <br>");
        }
        aboutText.append("</html>");

        //adding all the info in the panels
        JLabel imgwhy = new JLabel();
        JLabel nameL = new JLabel();
        JLabel qualiL = new JLabel();
        JLabel PQL = new JLabel();
        JLabel skillsL = new JLabel();
        JLabel aBoutL = new JLabel();
        JLabel begL = new JLabel();
        JLabel contactL = new JLabel();

        imgwhy.setIcon(haha2);
        hahaImg.add(imgwhy);

        nameL.setText(fullName);
        nameL.setFont(new Font("Monotone", Font.BOLD, 15));
        nameL.setHorizontalAlignment(JLabel.LEFT);
        name.add(nameL);

        qualiL.setText(field);
        qualiL.setFont(new Font("Monotone", Font.BOLD, 15));
        qualiL.setHorizontalAlignment(JLabel.LEFT);
        quali.add(qualiL);

        PQL.setText("<html> Professional Qualifications: <br><br> <html>" + PQtext.toString());
        PQL.setFont(new Font("Monotone", Font.BOLD, 15));
        PQL.setHorizontalAlignment(JLabel.LEFT);
        PQL.setVerticalAlignment(JLabel.TOP);
        PQ.add(PQL);

        skillsL.setText("<html> Skills and Hobbies: <br><br> <html>" + skillText.toString());
        skillsL.setFont(new Font("Monotone", Font.BOLD, 15));
        skillsL.setHorizontalAlignment(JLabel.LEFT);
        skillsL.setVerticalAlignment(JLabel.TOP);
        skills.add(skillsL);

        aBoutL.setText("<html> About me: <br><br> <html>" + aboutText.toString());
        aBoutL.setFont(new Font("Monotone", Font.BOLD, 15));
        aBoutL.setHorizontalAlignment(JLabel.LEFT);
        aBoutL.setVerticalAlignment(JLabel.TOP);
        aBout.add(aBoutL);

        begL.setText("<html>A hard worker, team player yada yada whatever, real talk <br>though I really need this job like right now cuz <br>my son really wants a happy meal but I can't <br>really afford that after the divorce so pls get <br>me a job and oh I also have knee surgery <br>tomorrow but really I'm just a chill guy haha <br>like those insta reels but no fr tho I actually <br>badly need this job or I won't be able to <br>afford rent this month and the judge will give <br>custody over to my ex-witch so pls gimme the <br>job I beg u, like I'll do anything you want <br>with all due diligence so pretty please</html>");

        begL.setFont(new Font("Monotone", Font.ITALIC, 15));
        begL.setHorizontalAlignment(JLabel.LEFT);
        begL.setVerticalAlignment(JLabel.TOP);
        beg.add(begL);

        contactL.setText("<html>Phone no. : 987-idk forgot <br>email: weird_dude@yahoo.com </html>");
        contactL.setFont(new Font("Monotone", Font.BOLD,15));
        contactL.setHorizontalAlignment(JLabel.CENTER);
        contactL.setVerticalAlignment(JLabel.CENTER);
        contact.add(contactL);

        //adding a final disclaimer
        disc.setText("*Resume Builder is not responsible for any user being kicked out of a job interview fo having a stupid resume");
        disc.setFont(new Font("Monotone", Font.ITALIC, 13));
        disc.setBounds(10, 780, 800, 20);

        main.add(disc);

        //creating a heading
        heading.setBounds(405, 10, 400, 70);
//        heading.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        heading.setBackground(new Color(66, 239, 245));
        heading.setLayout(new BorderLayout());

        //writing a heading
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setVerticalAlignment(JLabel.CENTER);
        header.setFont(new Font("Calibri", Font.BOLD, 45));
//        header.setForeground(new Color(29, 182, 209));
        header.setText("Resume Builder 1.0");

        heading.add(header);

        //basic settings for the frame

        this.setSize(1100, 1000);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
//        this.getContentPane().setBackground(new Color(66, 239, 245));
        this.setTitle("Resume Builder");
        ImageIcon icon = new ImageIcon("frame icon.jpg");
        this.setIconImage(icon.getImage());

        //creating the main panel for all the info
        main.setBounds(50, 100, 900, 800);
        main.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        main.setBackground(new Color(68, 235, 215));
        main.setLayout(null);

        this.add(main);
        this.add(heading);
        this.setVisible(true);

    }
}