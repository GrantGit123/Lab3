import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class WebScraper {
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

        String searchedWord = "Prince";
        String[] words = contents.replaceAll("[\\t\\n\\r]+"," ").split(searchedWord);
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(searchedWord));{
                //System.out.print(words[i]);
            }
        }



        System.out.print(words.length - 1);
        return contents;
    }



    public static void main(String[] unused) {
        System.out.print(urlToString("http://erdani.com/tdpl/hamlet.txt"));
    }
}
