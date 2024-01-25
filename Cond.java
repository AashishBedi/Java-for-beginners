import java.util.Scanner;
public class Cond{
    public static void main(String args[]){
        int n;
        System.out.print("Enter num: ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        if(n>5 && n<13){
            System.out.println("Kid");
        }
        else if(14<n && n<18){
            System.out.println("Teen");
        }
        else{
            System.out.println("Adult");
        }
    }
}
