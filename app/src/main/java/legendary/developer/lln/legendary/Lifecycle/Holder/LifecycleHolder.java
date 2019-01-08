package legendary.developer.lln.legendary.Lifecycle.Holder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import legendary.developer.lln.legendary.R;

public class LifecycleHolder extends RecyclerView.ViewHolder {

    public TextView infoLifecycle;
    public ImageView delete;

    public LifecycleHolder(View itemView) {
        super(itemView);
        infoLifecycle = (TextView) itemView.findViewById(R.id.tvLifecycle);
        delete = (ImageView) itemView.findViewById(R.id.imageDelete);
    }
}
