package legendary.developer.lln.legendary.Main;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import legendary.developer.lln.legendary.R;

public class MainHolder extends RecyclerView.ViewHolder {

    public ImageView imageHeader;
    public TextView title;
    public TextView description;

    public MainHolder(View itemView) {
        super(itemView);
        imageHeader = (ImageView) itemView.findViewById(R.id.imageView_header);
        title = (TextView) itemView.findViewById(R.id.textView_title);
        description = (TextView) itemView.findViewById(R.id.textView_description);
    }
}