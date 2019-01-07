package legendary.developer.lln.legendary.Main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import legendary.developer.lln.legendary.R;

public class MainAdapter extends RecyclerView.Adapter<MainHolder> {

    private List<MainModel> mainAdapterList;

    public MainAdapter(List<MainModel> list) {
        this.mainAdapterList = list;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MainHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_main, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder mainHolder, final int i) {
        mainHolder.title.setText(mainAdapterList.get(i).getTxtTitle());
        mainHolder.description.setText(mainAdapterList.get(i).getTxtDescription());
        mainHolder.imageView.setImageResource(mainAdapterList.get(i).getIdImage());

        mainHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //insertItem(new MainModel(R.drawable.ic_launcher_foreground, "Titulo", "Descricao", 2));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainAdapterList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void insertItem(MainModel user) {
        mainAdapterList.add(user);
        notifyItemInserted(getItemCount());
    }

    public void updateItem(int position) {
        mainAdapterList.get(position).incrementPosition();
        notifyItemChanged(position);
    }

    public void removerItem(int position) {
        mainAdapterList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mainAdapterList.size());
    }

    public void updateList(MainModel user) {
        insertItem(user);
    }
}
