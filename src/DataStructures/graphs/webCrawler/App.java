package DataStructures.graphs.webCrawler;

public class App {
    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();

        String rootURL = "http://www.bbc.com";
        crawler.discoverWeb(rootURL);

    }
}
