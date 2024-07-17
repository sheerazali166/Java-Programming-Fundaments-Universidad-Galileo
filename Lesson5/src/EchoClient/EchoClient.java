package EchoClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }

        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        try {
            Socket socket = new Socket(hostName, portNumber);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader bufferedReaderIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader bufferedReaderStandardIn = new BufferedReader(new InputStreamReader(System.in));

            String stringUserInput;

            while ((stringUserInput = bufferedReaderStandardIn.readLine()) != null) {
                System.out.println(stringUserInput);
                System.out.println("echo: " + bufferedReaderIn.readLine());
            }

        } catch (UnknownHostException unknownHostException) {

            System.err.println("Don't know about host" + hostName);
            System.exit(1);

        } catch (IOException ioException) {

            System.out.println("Couldn't get I/O for the connection to " + hostName);
            System.exit(1);
        }



    }
}
