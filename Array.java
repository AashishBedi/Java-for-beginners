import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        //Static array
        int a[] = {10,20,30,40,50};
        System.out.println(a[3]);

        int b[] = new int [5];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        b[3] = 40;
        b[4] = 50;

        for(int i=0; i<b.length;i++){
            System.out.print(b[i] + " ");
        }

        //Dynamic Array
        int size;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = r.nextInt();
        int c[] = new int [size];

        for(int i=0; i<size; i++){
            c[i] = r.nextInt();
        }
        System.out.print("Printed array element: ");
        for(int i=0; i<size; i++){
            System.out.print(c[i] + " ");
        }

    }
}
