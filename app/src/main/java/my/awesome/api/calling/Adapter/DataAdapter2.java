package my.awesome.api.calling.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import my.awesome.api.calling.Model.Hits;
import my.awesome.api.calling.R;

/**
 * Created by dd on 09.05.2017.
 */

public class DataAdapter2 extends RecyclerView.Adapter<DataAdapter2.ViewHolder> {

    private ArrayList<Hits> hitsArrayList;
     Context context;

    public DataAdapter2(ArrayList<Hits> hitsArrayList,Context context) {
        this.hitsArrayList = hitsArrayList;
        this.context = context;
    }

    @Override
    public DataAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter2.ViewHolder holder, int position) {

        Picasso.with(context).load(hitsArrayList.get(position).getLargeImageURL()).fit().centerCrop().into(holder.img);

    }

    @Override
    public int getItemCount() {
        return hitsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;


        public ViewHolder(View itemView) {
            super(itemView);


            img = (ImageView) itemView.findViewById(R.id.img);


        }
    }
}
