package eg.myapp6;

public interface InterfaceEg1
{
    // Single Abstract Method means an interface with one and only one 
    // single unimplemented method, not an interface with only a single method!

    public String myMethod2(String s);

    default void someMethod() {
        System.out.println("");
    }

    default void someMethod2() {
        System.out.println("");
    }
}
