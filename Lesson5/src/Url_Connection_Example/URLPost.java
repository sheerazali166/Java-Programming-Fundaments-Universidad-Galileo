package Url_Connection_Example;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class URLPost {

    public static void main(String[] args) {

        // Check the input arguments, has to be the url and a value to post
        if (args.length != 2) {
            System.err.println("Usage:  java post " +
                    "http://<Server Location/script>" +
                    " name_to_post");
            System.exit(1);
        }

        // Encode the value to post string to avoid problem with special characters.
        String stringToPost = null;
        try {
            stringToPost = URLEncoder.encode(args[1], "UTF-8");


        // create the URL Object and open a connection
        URL url = new URL(args[0]);
        URLConnection urlConnection = url.openConnection();

        // Enable write capability on the url
        urlConnection.setDoOutput(true);

        // get the connection outputstream, write to it and close it
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(urlConnection.getOutputStream());

        // Write to de connection, the method write will do a http post to the url.
        System.out.write(("name=" + stringToPost).getBytes());
        System.out.close();

        // Get the connection inputstream,
        BufferedReader bufferedReaderIn = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String welcomeMessage;

        // read the returned lines and print to standard output
        while ((welcomeMessage = bufferedReaderIn.readLine()) != null) {
            System.out.println(welcomeMessage);
        }

        bufferedReaderIn.close();
    }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException(unsupportedEncodingException);
        } catch (MalformedURLException malformedURLException) {
            throw new RuntimeException(malformedURLException);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }


    }
}
