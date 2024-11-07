import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File username = new File("username.txt");
        File password = new File("password.txt");
        //Sign up
        System.out.println("Username: ");
        String newUsername = sc.next();
        System.out.println("Password: ");
        String newPassword = sc.next();

        //Saving the info in a file
        try {
            FileWriter saveUsername = new FileWriter("username.txt", true);
            saveUsername.write(newUsername + "\n");
            saveUsername.close();

            FileWriter savePassword = new FileWriter("password.txt", true);
            savePassword.write(newPassword + "\n");
            savePassword.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //creating arraylists of the login details

        try {
            Scanner checkUser = new Scanner(username);
            Scanner checkPass = new Scanner(password);

            ArrayList<String> userList = new ArrayList<>();
            ArrayList<String> passList = new ArrayList<>();

            while (checkUser.hasNextLine()) {
                userList.add(checkUser.nextLine());
            }
            checkUser.close();

            while (checkPass.hasNextLine()) {
                passList.add(checkPass.nextLine());
            }
            checkPass.close();

            System.out.println("Enter username: ");
            String enterName = sc.next();
            System.out.println("Enter password: ");
            String enterPass = sc.next();


            boolean successfulLogin = false;

            for (int i = 0; i < userList.size(); i++) {
                if (userList.get(i).equals(enterName) && passList.get(i).equals(enterPass)) {
                    System.out.println("Login Successful");
                    successfulLogin = true;
                    break;
                }
            }
            if (!successfulLogin) {
                System.out.println("No such user exists");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Boo");
    }
}