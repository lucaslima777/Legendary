package legendary.developer.lln.legendary.Util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import legendary.developer.lln.legendary.R;

public class AnimateDownUtil {

    private RecyclerView mRecyclerView;

    public AnimateDownUtil(RecyclerView recyclerView){
        this.mRecyclerView = recyclerView;
    }

    public void runAnimationDown() {
        final Context context = mRecyclerView.getContext();
        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_down);

        mRecyclerView.setLayoutAnimation(controller);
        mRecyclerView.getAdapter().notifyDataSetChanged();
        mRecyclerView.scheduleLayoutAnimation();
    }

    public void runAnimationRight() {
        final Context context = mRecyclerView.getContext();
        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_right);

        mRecyclerView.setLayoutAnimation(controller);
        mRecyclerView.getAdapter().notifyDataSetChanged();
        mRecyclerView.scheduleLayoutAnimation();
    }
}
