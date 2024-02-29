public class recur {
    public static void main(String[] args){
        recur obj = new recur();
        int a = obj.sum(10);
        System.out.println("Sum pf n natural numbers: " + a);
    }
    int sum(int b){
        if(b>0){
            return b+sum(b-1);
        }
        else{
            return 0;
        }
    }
}
