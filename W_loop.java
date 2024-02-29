import java.util.Scanner;
class W_loop{
    public static void main(String[] args){
        int n;
        System.out.println("Enter value: ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        while(n < 5){
            System.out.print("Hello ");
            n++;
        }

    }
}