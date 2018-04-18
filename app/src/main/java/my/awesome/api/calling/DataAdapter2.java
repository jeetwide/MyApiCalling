package my.awesome.api.calling;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dd on 09.05.2017.
 */

public class DataAdapter2 extends RecyclerView.Adapter<DataAdapter2.ViewHolder> {

    private ArrayList<AndroidVersion2> android;

    public DataAdapter2(ArrayList<AndroidVersion2> android) {
        this.android = android;
    }

    @Override
    public DataAdapter2.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter2.ViewHolder holder, int position) {
        holder.txt.setText(android.get(position).getWebformatHeight());

    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txt;
       private ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);

            txt = (TextView)itemView.findViewById(R.id.txt);
            img = (ImageView) itemView.findViewById(R.id.img);


        }
    }
}
