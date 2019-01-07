package legendary.developer.lln.legendary.Main;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import legendary.developer.lln.legendary.R;

public class MainHolder extends RecyclerView.ViewHolder {

    CardView cardView;
    TextView title;
    TextView description;
    ImageView imageView;

    public MainHolder(View itemView) {
        super(itemView);
        cardView = (CardView)itemView.findViewById(R.id.card_view_main);
        title = (TextView)itemView.findViewById(R.id.textView_title);
        description = (TextView)itemView.findViewById(R.id.textView_description);
        imageView = (ImageView)itemView.findViewById(R.id.imageView_header);
    }

}