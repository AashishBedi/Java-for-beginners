import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
         int a,b,inp;
         System.out.print("Enter choice: ");
         Scanner sc = new Scanner(System.in);
        inp = sc.nextInt();

        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();

        switch(inp){
            case 1: 
            System.out.println(a+b);
            break;

            case 2:
            System.out.println(a-b);
            break;

            case 3:
            System.out.print(a*b);
            break;

            case 4:
            System.out.print(a/b);
            break;

            default:
            System.out.print("Invalid choice");
        }
    }
}
