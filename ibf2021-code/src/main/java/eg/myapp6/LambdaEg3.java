package eg.myapp6;

public class LambdaEg3 
{
    public static void main(String[] args) {
        MyOwnClass moc = new MyOwnClass();
        
        // Here, the class does not implement the interface.
        // But I have a class which has a method with the exact signature
        // and return type of the interface. So I can "borrow"
        // the implementation of the method in the class.
        InterfaceEg3 i = moc::concatThreeStrings;
    }
}
