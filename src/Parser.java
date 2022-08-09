import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;


public class Parser {

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://biblioteket.stockholm.se/titel/415768").get();
        Element bookIsAvailable = doc.selectFirst("tbody td strong");

        String isOnLibrary = bookIsAvailable.text();
        System.out.println(isOnLibrary);


    }
}
