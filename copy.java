class Demo {
    int a; String b; int c; String d;
    Demo(){
        a = 10; b = "Java";
        System.out.println(a + " " + b);
    }
    Demo(Demo ref){
        c = ref.a;
        d = ref.b;
        System.out.println(c + " " + d);
    }
}

class copy{
    public static void main(String[] args){
        Demo r = new Demo();
        Demo r2 = new Demo(r);
    }
}

