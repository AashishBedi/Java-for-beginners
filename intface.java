import java.util.Scanner;
interface client{
    void input();
    void output();
}

class intface implements client{
    String name; double sal;
    public void input(){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter username: ");
        name = r.nextLine();

        System.out.println("Enter Salary: ");
        sal = r.nextDouble();
    }
    public void output(){
        System.out.println(name + " " + sal);
    }
    public static void main(String[] args){
        client c = new intface();
        c.input();
        c.output();
    }

}
