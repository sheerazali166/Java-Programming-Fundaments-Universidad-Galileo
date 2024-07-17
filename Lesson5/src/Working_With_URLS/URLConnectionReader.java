package Working_With_URLS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

    public static void main(String[] args) throws Exception {

        URL urlOracle = new URL("https://www.oracle.com");
        URLConnection urlConnection = urlOracle.openConnection();
        BufferedReader bufferedReaderIn = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String inputLine;

        while ((inputLine = bufferedReaderIn.readLine()) != null) {
            System.out.println(inputLine);

        }

        bufferedReaderIn.close();
    }
}
