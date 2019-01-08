package legendary.developer.lln.legendary.Lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import legendary.developer.lln.legendary.Lifecycle.Adapter.LifecycleAdapter;
import legendary.developer.lln.legendary.Lifecycle.Model.LifecycleModel;
import legendary.developer.lln.legendary.R;
import legendary.developer.lln.legendary.Util.AnimateDownUtil;

public class LifecycleActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private LifecycleAdapter mAdapter;
    private List<LifecycleModel> modelList;
    private AnimateDownUtil animateDownUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        modelList = new ArrayList<>();
        modelList.add(new LifecycleModel("onCreate"));


        mRecyclerView = findViewById(R.id.recycler_view_lifecycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        mAdapter = new LifecycleAdapter(modelList, this);
        animateDownUtil = new AnimateDownUtil(mRecyclerView);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        modelList.add(new LifecycleModel("onCreate"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        modelList.add(new LifecycleModel("onResume"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        modelList.add(new LifecycleModel("onPause"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        modelList.add(new LifecycleModel("onStop"));
    }
}
