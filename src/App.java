import java.util.Scanner;
import java.util.regex.*;

public class App {
    public static void main(String[] args) throws Exception {
        int verifycount = 0;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter your password: ");
        String password = scnr.nextLine();
        
        String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])" + "(?=.*[~!@#$%^&*()-=+_])"+ "(?=\\S+$).{8,16}$";
        String regex2 = "^(?=.*[0-9])" + "(?=.*[A-Z])"+ "(?=.*[~!@#$%^&*()-=+_])"+ "(?=\\S+$).{8,16}$";
        String regex3 = "(?=.*[a-z])" + "(?=.*[A-Z])"+ "(?=.*[~!@#$%^&*()-=+_])"+ "(?=\\S+$).{8,16}$";
        String regex4 = "^(?=.*[0-9])" + "(?=.*[A-Z])"+ "(?=.*[a-z])"+ "(?=\\S+$).{8,16}$";

        Pattern patt = Pattern.compile(regex);
        Pattern patt2 = Pattern.compile(regex2);
        Pattern patt3 = Pattern.compile(regex3);
        Pattern patt4 = Pattern.compile(regex4);

        Matcher match = patt.matcher(password);
        Matcher match2 = patt2.matcher(password);
        Matcher match3 = patt3.matcher(password);
        Matcher match4 = patt4.matcher(password);
        
        if (match.matches() == true || match2.matches() == true || match3.matches() == true || match4.matches() == true){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid password");
        }
    }
}
