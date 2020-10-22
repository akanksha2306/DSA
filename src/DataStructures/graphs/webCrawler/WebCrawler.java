package DataStructures.graphs.webCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

    private Queue<String> queue;
    private List<String> discoveredWebsiteList;


    public WebCrawler() {
        this.queue = new LinkedList<>();
        this.discoveredWebsiteList = new ArrayList<>();
    }

    //instead of vertices we have strings becoz we are dealing with websites url
    public void discoverWeb(String root) {
        //added the root url
        this.queue.add(root);
        this.discoveredWebsiteList.add(root);
        //queue will have the entire

        while (!queue.isEmpty()) {

            String v = this.queue.remove();
            String rawHtml = readURL(v);
            // now we have regular expression to be able to get the urls out of this rawHTML
            String regexp = "http://(\\w+\\.)*(\\w+)";
            // we are going to find the urls in the rawHTML, we have to use this pattern
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);//going to find the urls in the rawHTML
            // we have to import a matcher

            // we have so many urls in the single web page, then we would like to find all of them
            while (matcher.find()) {
                //its going to find the new url in the row html
                String actualUrl = matcher.group();
                if (!discoveredWebsiteList.contains(actualUrl)) {
                    discoveredWebsiteList.add(actualUrl);
                    System.out.println("Website has been found with url:" + actualUrl);
                    //now adding actual website to the queue
                    queue.add(actualUrl);

                }
            }
        }
    }

    private String readURL(String v) {

        String rawHtml = "";

        try {
            URL url = new URL(v);
            // To read the data from the web we need to create buffered reader
            //v = url of the website;
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            //we are going to read the row html, on a line by line basis.and we are going to pose a question, is there any url?
            //url is anything satrting with http://
            String inputLine = "";
            while ((inputLine = in.readLine()) != null) {//means we are not at the end of the html document,
                //then we read the input line by line and append the rawhtml
                rawHtml += inputLine;

            }
            in.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return rawHtml;
    }


}
