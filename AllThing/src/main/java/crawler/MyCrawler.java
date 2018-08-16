package crawler;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Set;
import java.util.regex.Pattern;

public class MyCrawler extends WebCrawler {
    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|jpg"
            + "|png|mp3|mp4|zip|gz))$");
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
        logger.warn("URL visit: {}",url);
        String href = url.getURL().toLowerCase();
        logger.warn("should visit? {}",!FILTERS.matcher(href).matches()
                && href.startsWith("https://diemthi.vnexpress.net/"));
        return !FILTERS.matcher(href).matches() && href.startsWith("https://diemthi.vnexpress.net/");
    }

    @Override
    public void visit(Page page) {
        String url = page.getWebURL().getURL();
        logger.info("URL: " + url);

        if (page.getParseData() instanceof HtmlParseData) {
            HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
            String text = htmlParseData.getText();
            String html = htmlParseData.getHtml();
            Set<WebURL> links = htmlParseData.getOutgoingUrls();

            logger.info("Text length: " + text.length());
            logger.info("Html length: " + html.length());
            logger.info("Number of outgoing links: " + links.size());
        }
    }
}
