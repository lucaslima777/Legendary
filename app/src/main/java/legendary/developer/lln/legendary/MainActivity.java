package legendary.developer.lln.legendary;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;
import java.util.List;
import legendary.developer.lln.legendary.Main.MainAdapter;
import legendary.developer.lln.legendary.Main.MainModel;
import legendary.developer.lln.legendary.Util.AnimateDownUtil;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private MainAdapter mAdapter;
    private List<MainModel> mainItemsList;
    private AnimateDownUtil animateDownUtil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        initializeData();
        mAdapter = new MainAdapter(mainItemsList, this);
        animateDownUtil = new AnimateDownUtil(mRecyclerView);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initializeData() {
        mainItemsList = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            mainItemsList.add(new MainModel(R.drawable.ic_launcher_foreground, "Titulo " + i, "Descricao " + i, i));
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        animateDownUtil.runLayoutAnimation();
    }
}
