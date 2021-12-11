package eg.myapp4;

public class MyTest1
{
    public static void main(String[] args) {
        //MyInterface mi = new MyInterfaceImpl();
        MyClass1 mc = new MyDerivedClass1();
        mc.methodOne();
        mc.methodTwo();
    }
}
