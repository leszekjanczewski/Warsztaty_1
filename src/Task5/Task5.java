package Task5;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Connection connection = Jsoup.connect("http://www.onet.pl");

        try {
            FileWriter popularWords = new FileWriter("popular_words.txt");
            popularWords.flush();
            FileWriter filteredPopularWords = new FileWriter("filtered_popular_words.txt");
            filteredPopularWords.flush();

            Document document = connection.get();
            Elements links = document.select("span.title");
            for (Element elem: links) {
                System.out.println(elem.text());
                popularWords.append(elem.text()+"\n");
            }
            popularWords.close();

            File file = new File("popular_words.txt");
//            StringBuilder reading = new StringBuilder();
            String words = "";
            Scanner scanner = new Scanner(file);
            String[] excludedWords = {"przez", "oraz", "ponieważ", "albo", "gdyż", "jest"};
            boolean addWord = true;
            while (scanner.hasNext()) {
                words = scanner.next();
                if (words.length() > 3) {
                    for (int i = 0; i < excludedWords.length; i++) {
                        if (words.equals(excludedWords[i])) {
                            i = excludedWords.length;
                            words = " ";
                        }
                    }
                    System.out.println(words);
                    filteredPopularWords.append(words+"\n");
                }
            }
            filteredPopularWords.close();
        } catch (IOException e)  {
            e.printStackTrace();
        }
    }
}
