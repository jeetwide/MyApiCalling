package my.awesome.api.calling;

/**
 * Created by dd on 08.05.2017.
 */

public class AndroidVersion2 {

    private String largeImageURL;
    private String webformatHeight;

    public AndroidVersion2(String largeImageURL,String webformatHeight) {
        this.largeImageURL = largeImageURL;
        this.webformatHeight=webformatHeight;

    }

    public String getWebformatHeight() {
        return webformatHeight;
    }

    public void setWebformatHeight(String webformatHeight) {
        this.webformatHeight = webformatHeight;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }
}
