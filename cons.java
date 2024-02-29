import java.io.*;
public class cons {
    public  static void main(String[] args){
        String str;
        char ch[];
        Console obj = System.console();
        System.out.println("Enter Username: ");
        str = obj.readLine();
        System.out.println("Enter Password: ");
        ch = obj.readPassword();
        String a = String.valueOf(ch);

        System.out.println("Username: " + str);
        System.out.println("Password: " + a);

    }
}
