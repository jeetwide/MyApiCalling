package my.awesome.api.calling;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dd on 09.05.2017.
 */

public interface RequestInterface {
    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();


 @GET("android/jsonandroid")
    Call<JSONResponse> getJSON2();
}
