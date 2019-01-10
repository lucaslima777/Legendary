package legendary.developer.lln.legendary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import legendary.developer.lln.legendary.Main.MainAdapter;
import legendary.developer.lln.legendary.Main.MainModel;
import legendary.developer.lln.legendary.Util.AnimateDownUtil;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private List<MainModel> mainItemsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        initializeData();
        MainAdapter mAdapter = new MainAdapter(mainItemsList, this);
        AnimateDownUtil animate = new AnimateDownUtil(mRecyclerView);
        mRecyclerView.setAdapter(mAdapter);
        animate.runAnimationDown();
    }

    private void initializeData() {
        mainItemsList = new ArrayList<>();
        mainItemsList.add(new MainModel(R.drawable.icon_lifecycle, "Lifecycle", "Explains the activity lifecycle in detail.", 1));

    }
}
