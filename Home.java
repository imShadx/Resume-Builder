import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

public class Home extends JFrame implements ActionListener {
    JButton signIn;
    JButton signUp;
    File username;
    File password;
    FileWriter saveUsername;
    FileWriter savePassword;
    JTextField name;
    JTextField pass;
    ArrayList<String> userList = new ArrayList<>();
    ArrayList<String> passList = new ArrayList<>();
    JLabel error;


    Home() {
        JPanel main = new JPanel();
        JPanel heading = new JPanel();
        JLabel header = new JLabel();
        JLabel box = new JLabel();
        JLabel about = new JLabel();
        JPanel buttonIn = new JPanel();
        JPanel buttonUp = new JPanel();
        JLabel img = new JLabel();
        error = new JLabel();
        name = new JTextField();
        pass = new JTextField();

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

        this.setSize(1210, 760);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
//        this.getContentPane().setBackground(new Color(66, 239, 245));
        this.setTitle("Resume Builder");
        ImageIcon icon = new ImageIcon("frame icon.jpg");
        this.setIconImage(icon.getImage());

        //creating the main panel for all the info
        main.setBounds(100, 100, 1000, 500);
        main.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        main.setBackground(new Color(68, 235, 215));
        main.setLayout(null);

        //setting up the box containing the log in stuff
        box.setBounds(600, 50, 300, 350);
//        box.setOpaque(true);
//        box.setBackground(Color.WHITE);
//        box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        box.setLayout(null);
        main.add(box);

        //setting up the text fields for login in the box
        name.setBounds(25, 80, 240, 40);
        name.setFont(new Font("Calibri", Font.ITALIC, 20));
        name.setText("Username");
        box.add(name);

        pass.setBounds(25, 180, 240, 40);
        pass.setFont(new Font("Calibri", Font.ITALIC, 20));
        pass.setText("Password");
        box.add(pass);

        //setting up the about section of the main panel
        about.setBounds(100, 50, 300, 350);
//        about.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        about.setText("<html> a humble project by Yathansh and gang<br> to help some useless idiots create better resumes</html>");
        about.setForeground(Color.BLACK);
        about.setFont(new Font("calibri", Font.TRUETYPE_FONT, 15));
        main.add(about);

        //adding the document image in the home page
//        ImageIcon ini = new ImageIcon("home page final.jpg");
//        Image temp = ini.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
//        ImageIcon docu = new ImageIcon(temp);

//        img.setBounds(150, 320, 200, 200);
//        img.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        img.setIcon(docu);
//        main.add(img);

        //adding an error for wrong sign in details
        error.setBounds(650, 350, 200, 40);
//        error.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        error.setText("*Account doesn't exist");
        error.setForeground(new Color(238, 238, 238));
        error.setFont(new Font("Calibri", Font.ITALIC, 20));
        main.add(error);

        //setting up the positions for the  sign in and sign up buttons
        buttonIn.setBounds(600, 420, 140, 50);
        buttonIn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonIn.setLayout(null);
        main.add(buttonIn);

        buttonUp.setBounds(760, 420, 140, 50);
        buttonUp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        buttonUp.setLayout(null);
        main.add(buttonUp);

        //creating the sign in and sign up buttons
        signIn = new JButton();
        signIn.setText("Sign in");
        signIn.setFont(new Font("Monotone", Font.BOLD, 20));
        signIn.setForeground(Color.BLACK);
        signIn.setFocusable(false);
        signIn.setBackground(Color.WHITE);
        signIn.setBounds(0, 0, 140, 50);
        signIn.addActionListener(this);
        buttonIn.add(signIn);

        signUp = new JButton();
        signUp.setText("Sign up");
        signUp.setFont(new Font("Monotone", Font.BOLD, 20));
        signUp.setForeground(Color.WHITE);
        signUp.setFocusable(false);
        signUp.setBackground(Color.BLACK);
        signUp.setBounds(0, 0, 140, 50);
        signUp.addActionListener(this);
        buttonUp.add(signUp);


        this.add(main);
        this.add(heading);
        this.setVisible(true);

        //**ACTUAL CODE FOR THE LOGIN**
        username = new File("username.txt");
        password = new File("password.txt");

        loadUserAndPassData();
    }

    //method to add user data to the file
    private void loadUserAndPassData() {
        try {
            Scanner checkUser = new Scanner(username);
            Scanner checkPass = new Scanner(password);

            userList.clear();
            passList.clear();

            while (checkUser.hasNextLine()) {
                userList.add(checkUser.nextLine());
            }
            checkUser.close();

            while (checkPass.hasNextLine()) {
                passList.add(checkPass.nextLine());
            }
            checkPass.close();
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUp) {
            try {
                FileWriter saveUsername = new FileWriter("username.txt", true);
                saveUsername.write(name.getText() + "\n");
                saveUsername.close();

                FileWriter savePassword = new FileWriter("password.txt", true);
                savePassword.write(pass.getText() + "\n");
                savePassword.close();

                loadUserAndPassData();

                error.setText("Account created!");
                error.setForeground(Color.BLACK);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        if (e.getSource() == signIn) {
            boolean successfulLogin = false;
            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).equals(name.getText()) && passList.get(i).equals(pass.getText())) {
                    this.dispose();
                    new Form1();
                    break;
                }
            }
            if (!successfulLogin) {
                error.setForeground(Color.BLACK);
            }
        }
    }
}

