import java.util.Scanner;

public class UUsernamePassword {
    public static void control(String uName, String password){
        if(uName.equals("") && password.equals("")) {
            System.out.println("UserName and Password Fields cannot be empty");
        } else if (uName.equals("") && !password.equals("")) {
            System.out.println("UserName cannot be empty");
        } else if (!uName.equals("") && password.equals("")){
            System.out.println("Password cannot be empty");
        } else if (uName.equals("admin") && password.equals("qwert123")) {
            System.out.println("User Logged in successfully");
        }else
            System.out.println("UserName or password is not valid. Please verify");
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String uName = "";
        String password = "";
        System.out.println("-----Please enter your username and password!-----");
        System.out.print("\nUsername : ");
        uName = keyboard.nextLine();
        System.out.print("Password : ");
        password = keyboard.nextLine();

        control(uName, password);
    }
}
