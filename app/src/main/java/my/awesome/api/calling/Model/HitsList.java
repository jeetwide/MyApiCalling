package my.awesome.api.calling.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Elite-D35 on 4/18/2018.
 */

public class HitsList {


    @SerializedName("hits")
    @Expose
    private ArrayList<Hits> hits = new ArrayList<>();

    /**
     * @return The hits
     */
    public ArrayList<Hits> getHits() {
        return hits;
    }

    /**
     * @param hits The contacts
     */
    public void setHits(ArrayList<Hits> hits) {
        this.hits = hits;
    }

}
