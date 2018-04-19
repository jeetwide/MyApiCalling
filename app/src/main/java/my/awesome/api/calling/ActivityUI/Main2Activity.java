package my.awesome.api.calling.ActivityUI;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import my.awesome.api.calling.Adapter.DataAdapter2;
import my.awesome.api.calling.Model.Hits;
import my.awesome.api.calling.Model.HitsList;
import my.awesome.api.calling.R;
import my.awesome.api.calling.api.RetroClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Hits> hitsArrayList;
    private DataAdapter2 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initViews();
    }

    private void initViews() {
        recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
    }

    private void loadJSON() {

        //Creating an object of our api interface
      my.awesome.api.calling.api.RequestInterface api = RetroClient.getApiService();

        /**
         * Calling JSON
         */
        Call<HitsList> call = api.getMyJSON();

        call.enqueue(new Callback<HitsList>(){

            @Override
            public void onResponse(Call<HitsList> call, Response<HitsList> response) {
                hitsArrayList=response.body().getHits();
                adapter= new DataAdapter2(hitsArrayList,Main2Activity.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<HitsList> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
