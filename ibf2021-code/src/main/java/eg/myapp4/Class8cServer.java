package eg.myapp4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Class8cServer 
{
    public static void main(String[] args) throws IOException  {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        ServerSocket serverSocket = new ServerSocket(3002);
        System.out.println("Listening to connections at port 3002..");

        while (true) {
            Socket socket = serverSocket.accept();
            int id = (int) (Math.random()*100);
            ConnectionHandler worker = new ConnectionHandler(socket, id);
            threadPool.submit(worker);
        }
    }
}
