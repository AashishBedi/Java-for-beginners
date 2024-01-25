class variable{
    static int b = 20; //static variable
    int c=30; //Instance variable

    public static void main(String args[]){
        int a = 20; //local variable

        var obj=new variable(); //creation of object to access instance variable
        System.out.println(a);
        System.out.println(variable.b);
        System.out.println(obj.c);


    }
}


