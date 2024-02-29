public class methods {
    public static void Add(){
        int a=10, b=20;
        System.out.println("Sum: " + (a+b));
    }
    public static void main(String[] args){
        methods obj = new methods();
        obj.Disp();
        obj.Add();
    }
    void Disp(){
        System.out.println("Hello World");
    }
}
