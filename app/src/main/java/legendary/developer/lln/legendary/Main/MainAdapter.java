package legendary.developer.lln.legendary.Main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import legendary.developer.lln.legendary.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder>{

    List<MainItems> mainAdapterList;

    public MainAdapter(List<MainItems> list){
        this.mainAdapterList = list;
    }



    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_main, viewGroup, false);
        MainViewHolder viewHolder = new MainViewHolder(v);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull MainViewHolder mainViewHolder, int i) {
        mainViewHolder.title.setText(mainAdapterList.get(i).getTxtTitle());
        mainViewHolder.description.setText(mainAdapterList.get(i).getTxtDescription());
        mainViewHolder.imageView.setImageResource(mainAdapterList.get(i).getIdImage());
    }

    @Override
    public int getItemCount() {
        return mainAdapterList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView title;
        TextView description;
        ImageView imageView;

        MainViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.card_view_main);
            title = (TextView)itemView.findViewById(R.id.textView_title);
            description = (TextView)itemView.findViewById(R.id.textView_description);
            imageView = (ImageView)itemView.findViewById(R.id.imageView_header);
        }
    }
}
