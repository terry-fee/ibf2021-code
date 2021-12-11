package eg.myapp6;

public class LambdaEg2 
{
    public static void main(String[] args) {
        // Method Reference
        // Can be used if the lambda function implements an interface which
        // has a method whereby it takes in a parameter type and returns a type 
        // that can be obtained by using a method of that parameter type.
        // Frequently used for the String class.
        InterfaceEg2 if1 = s -> s.length();
        // This does the same as above.
        InterfaceEg2 if2 = String::length;
    }    
}
