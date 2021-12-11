package eg.myapp6;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class7 
{
    public static void main(String[] args) throws Exception {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.submit( () -> { 
            System.out.println("Hello, World"); }
        ); 
        threadPool.shutdown();
    }
}
