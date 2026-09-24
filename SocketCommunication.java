import java.net.*;
import java.io.*;

class SocketCommunication {
    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            try {
                ServerSocket ss = new ServerSocket(5000);
                Socket s = ss.accept();
                DataInputStream in = new DataInputStream(s.getInputStream());
                System.out.println("Client: " + in.readUTF());
                s.close();
                ss.close();
            } catch (Exception e) {}
        }).start();

        Thread.sleep(500);
        Socket s = new Socket("localhost", 5000);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF("Hello Server");
        s.close();
    }
}
