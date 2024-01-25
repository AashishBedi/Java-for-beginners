public class TypeCast{
    public static void main(String args[]){
        int a=10; //4 bytes
        double b=a; //8 bytes
        System.out.println(b);

        double c=4.5;
        int d = (int) c;
        System.out.println(d);
    }
}
