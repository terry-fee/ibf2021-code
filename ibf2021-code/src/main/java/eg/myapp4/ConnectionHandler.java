package eg.myapp4;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ConnectionHandler implements Runnable
{
    private final Socket socket;
    private int id;

    public ConnectionHandler(Socket socket, int id) {
        this.socket = socket;
        this.id = id;
    }

    @Override
    public void run() {

        try (InputStream is = socket.getInputStream()) {

            System.out.println("Connection ID: " + id);
            BufferedInputStream bis = new BufferedInputStream(is);
            DataInputStream dis = new DataInputStream(bis);
            String line = "";

            while (!line.equals("exit")) {
                
                try {
                    line = dis.readUTF();
                    System.out.println("Client " + id + ": " + line);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                } 
            }
        } catch (EOFException eofe) {
            
        } catch (IOException ioe) { 
            
        } finally {

            try {
                socket.close();
            } catch (IOException ioe) { }
        }
    } 
}
