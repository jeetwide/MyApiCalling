package my.awesome.api.calling.api;

import my.awesome.api.calling.Model.HitsList;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dd on 09.05.2017.
 */

public interface RequestInterface {

    @GET("/api/?key=8716055-bbf7ebb4e2fe4719229979ebe&q=yellow+flowers&image_type=photo&pretty=true")
    Call<HitsList> getMyJSON();


}
