package my.awesome.api.calling.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * @author Pratik Butani
 */
public class RetroClient {

    /********
     * URLS
     *******/
    private static final String ROOT_URL = "https://pixabay.com";

    /**
     * Get Retrofit Instance
     */
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Get API Service
     *
     * @return API Service
     */
    public static RequestInterface getApiService() {
        return getRetrofitInstance().create(RequestInterface.class);
    }
}
