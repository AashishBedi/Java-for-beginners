//Instance block
class block {
    int a, b;
    void show()
    {
        a = 50; b = 60;
        System.out.println(a + " "+b);
    }
    block()
    {
        a = 30; b  =40;
        System.out.println(a + " "+b);
    }

    {
        a = 10; b = 20;
        System.out.println(a + " "+b);
    }
}

class inst_block{
    public static void main(String[] args){
    block ref = new block();
    ref.show();
    }
}