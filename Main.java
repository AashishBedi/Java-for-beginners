abstract class Programming{
    public abstract void Dev();
}

class HTML extends Programming{
    @Override
    public void Dev(){
        System.out.println("HTML is developed by Tim Berners");
    }
}

class Java extends Programming{
    @Override 
    public void Dev(){
        System.out.println("James Gosling");
    }
}

class Main{
    public static void main(String[] args){
        Programming h = new HTML();
        h.Dev();
        Programming j = new Java();
        j.Dev();
    }
}