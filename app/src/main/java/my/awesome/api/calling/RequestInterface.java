package my.awesome.api.calling;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by dd on 09.05.2017.
 */

public interface RequestInterface {
    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();


    @GET("api/?key=8716055-bbf7ebb4e2fe4719229979ebe&q=yellow+flowers&image_type=photo&pretty=true")
    Call<JSONResponse> getJSON2();


}
