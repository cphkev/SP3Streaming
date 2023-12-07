

import java.io.*;
import java.util.Scanner;

public class Login {
private static final String Filepath = "src/data/users.txt";
  private String usernameInput;
  private String passwordInput;


    public void login() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username: ");
        usernameInput = scan.nextLine();

        System.out.println("Enter password");
        passwordInput = scan.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(Filepath))){

            String line;
            while ((line = reader.readLine()) != null){
                String[] split = line.split(",");
                String storedUsername = split[0];
                String storedPassword = split[1];
                if(usernameInput.equals(storedUsername) && passwordInput.equals(storedPassword)){
                    System.out.println("You have successfully logged in");
                    scan.close();
                    return;
                }

            }
            System.out.println("Invalid username or password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
scan.close();
    }

}
