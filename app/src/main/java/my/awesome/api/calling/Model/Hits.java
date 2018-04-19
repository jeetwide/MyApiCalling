package my.awesome.api.calling.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by dd on 08.05.2017.
 */

public class Hits {


    @SerializedName("largeImageURL")
    @Expose
    private String largeImageURL;


    @SerializedName("webformatHeight")
    @Expose
    private String webformatHeight;

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public String getWebformatHeight() {
        return webformatHeight;
    }

    public void setWebformatHeight(String webformatHeight) {
        this.webformatHeight = webformatHeight;
    }
}
