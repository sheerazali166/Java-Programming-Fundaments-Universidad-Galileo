package EchoServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);

        }

        int portNumber = Integer.parseInt(args[0]);

        try {
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0]));
            Socket socket = serverSocket.accept();
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedReaderIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        } catch (IOException ioException) {
            System.out.println(" Exception caught when trying to listen on port " + portNumber + " or listening for a connection");
            System.out.println(ioException.getMessage());
        }

    }
}
