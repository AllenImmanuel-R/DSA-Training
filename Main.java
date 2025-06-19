interface A {
    void m1();
}

interface B {
    void m1();
}

class C implements A {
    public void m1() {
        System.out.println("Method m1 from interface A");
    }
}
class D implements B {
    public void m1() {
        System.out.println("Method m1 from interface B");
    }
}
public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.m1(); 
        D d = new D();
        d.m1(); 
    }
}
