class A {
    int x = 20;
    int y = 30;

    {
        System.out.println("Hello Ritik");
    }
}

class B {
    public static void main(String[] args) {
        A ob = new A();
        System.out.println(ob.x);
    }
}
