package Working_With_URLS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {

    public static void main(String[] args) throws Exception {

        URL urlOracle = new URL("https://www.oracle.com");
        BufferedReader bufferedReaderIn = new BufferedReader(new InputStreamReader(urlOracle.openStream()));
        String inputLine;

        while ((inputLine = bufferedReaderIn.readLine()) != null) {
            System.out.println(inputLine);
        }

        bufferedReaderIn.close();

    }
}
