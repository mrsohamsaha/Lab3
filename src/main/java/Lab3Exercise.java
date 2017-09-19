import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3Exercise {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(final String[] args) {
       String hamletString = urlToString("http://erdani.com/tdpl/hamlet.txt");
      String[] hamletArray = hamletString.split(" ");
      String leisureString = urlToString("https://www.bls.gov/tus/charts/chart9.txt");
      String[] leisureArray = leisureString.split(" ");
      String forecast = urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");
      String[] forecastArray = forecast.split(" ");


        System.out.println("Hamlet word count is " + hamletArray.length);
        System.out.println("Lesiure time word count is " + leisureArray.length);
        System.out.println("Forecast word count is " + forecastArray.length);

 }
 }
