package basic;

class A {
    int val=5;
    A(){
        val+=3;
        show();
    }
    void show(){
        System.out.println("A" + val + " ");
    }
}

class B extends A{
    int val=10;
    B(){
        val+=2;
        show();

    }
    @Override
    void show(){
        System.out.println("B:" +val+" ");
    }

}
public class Ma{
    public static void main(String[] args) {
        new B();
    }
}
