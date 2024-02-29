import java.util.Scanner;
class f_loop {
    public static void main(String[] args){
        int n;
        System.out.println("Enter n: ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(i + " ");
        }
    }
}
