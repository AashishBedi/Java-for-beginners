/* 
import java.util.Scanner;
import java.util.Arrays;

public class methode_array {
    public static void main(String[] args){
    
        //Dynamic Array
        int size;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = r.nextInt();
        int c[] = new int [size];
        int d[] = new int [size];

        for(int i=0; i<size; i++){
            c[i] = r.nextInt();
        }

        for(int i=0; i<size; i++){
            d[i] = r.nextInt();
        }
        //Sort the array
        Arrays.sort(c);
     //   System.out.print("Printed array element: ");
         for(int i=0; i<size; i++){
            System.out.print(c[i] + " ");
        }

        for(int i=0; i<size; i++){
            System.out.print(d[i] + " ");
        }

        //Checks the array
        boolean e = Arrays.equals(c,d);
        System.out.println(e);

    }
}  
*/
import java.util.Arrays;

public class methode_array {
   public static void main(String[] args) {
      int[] intArr = { 10, 20, 30, 13 };

      // Issue 1: Use the value directly in the enhanced for loop, not the index
      for (int value : intArr) {
         System.out.print(value + " ");
      }
      System.out.print("\nCopied Array: \n");

      // Create copy of the array of same size
      int[] intArrCopy = Arrays.copyOf(intArr, intArr.length);

      // Issue 2: Use the value directly in the enhanced for loop, not the index
      for (int value : intArrCopy) {
         System.out.print(value + " ");
      }
   }
}
