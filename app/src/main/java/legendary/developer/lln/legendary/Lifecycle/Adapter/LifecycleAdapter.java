package legendary.developer.lln.legendary.Lifecycle.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import legendary.developer.lln.legendary.Lifecycle.Holder.LifecycleHolder;
import legendary.developer.lln.legendary.Lifecycle.Model.LifecycleModel;
import legendary.developer.lln.legendary.Main.MainHolder;
import legendary.developer.lln.legendary.R;

public class LifecycleAdapter extends RecyclerView.Adapter<LifecycleHolder> {

    private List<LifecycleModel> modelList;
    private Context mContext;

    public LifecycleAdapter(List<LifecycleModel> list, Context context) {
        this.modelList = list;
        this.mContext = context;
    }

    @NonNull
    @Override
    public LifecycleHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new LifecycleHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_lifecycle, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull LifecycleHolder lifecycleHolder, int i) {
        lifecycleHolder.infoLifecycle.setText(modelList.get(i).getTxtLifecycle());
        lifecycleHolder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public void insertItem(LifecycleModel user) {
        modelList.add(user);
        notifyItemInserted(getItemCount());
    }

    public void removerItem(int position) {
        modelList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, modelList.size());
    }

    public void updateList(LifecycleModel user) {
        insertItem(user);
    }
}
