package my.awesome.api.calling;

/**
 * Created by dd on 08.05.2017.
 */

public class AndroidVersion2 {

    private String largeImageURL;
    private String webformatWidth;


    public AndroidVersion2(String largeImageURL, String webformatWidth) {
        this.largeImageURL = largeImageURL;
        this.webformatWidth = webformatWidth;

    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public String getWebformatWidth() {
        return webformatWidth;
    }

    public void setWebformatWidth(String webformatWidth) {
        this.webformatWidth = webformatWidth;
    }
}
