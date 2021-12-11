package eg.myapp6;

public class LambdaEg1
{
    public static void main(String[] args) {
        InterfaceEg1 if1 = (s) -> { return s; };
        System.out.println(if1.myMethod2("KABOOM!"));

        InterfaceEg1 if2 = (s) -> { return s+s; };
        System.out.println(if2.myMethod2("KABOOM!"));
    }    
}
 