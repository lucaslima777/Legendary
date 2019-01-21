package legendary.developer.lln.legendary.Lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import legendary.developer.lln.legendary.Lifecycle.Adapter.LifecycleAdapter;
import legendary.developer.lln.legendary.Lifecycle.Model.LifecycleModel;
import legendary.developer.lln.legendary.R;
import legendary.developer.lln.legendary.Util.AnimateDownUtil;

public class LifecycleActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private LifecycleAdapter mAdapter;
    private List<LifecycleModel> modelList;

    private static final String LAST_STATE_ACTIVITY = "null";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        getSupportActionBar().setTitle("Lifecycle");

        modelList = new ArrayList<>();
        modelList.add(new LifecycleModel("onCreate"));

        mRecyclerView = findViewById(R.id.recycler_view_lifecycle);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        mAdapter = new LifecycleAdapter(modelList, this);
        AnimateDownUtil animate = new AnimateDownUtil(mRecyclerView);
        mRecyclerView.setAdapter(mAdapter);
        animate.runAnimationRight();
    }

    @Override
    protected void onStart() {
        super.onStart();
        modelList.add(new LifecycleModel("onStart"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onResume() {
        super.onResume();
        modelList.add(new LifecycleModel("onResume"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onPause() {
        super.onPause();
        modelList.add(new LifecycleModel("onPause"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onStop() {
        super.onStop();
        modelList.add(new LifecycleModel("onStop"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        modelList.add(new LifecycleModel("onActivityResult"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        modelList.add(new LifecycleModel("onPostResume"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        modelList.add(new LifecycleModel("onPostCreate"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        modelList.add(new LifecycleModel("onRestart"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        modelList.add(new LifecycleModel("onDestroy"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(LAST_STATE_ACTIVITY, "onDestroy");
        super.onSaveInstanceState(outState);
        modelList.add(new LifecycleModel("onSaveInstanceState"));
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String last_activity;
        String currentDateTimeString = DateFormat.getTimeInstance().format(new Date());
        last_activity = savedInstanceState.getString(LAST_STATE_ACTIVITY);
        modelList.add(new LifecycleModel("onRestoreInstanceState:\n"  + last_activity + " in "+ currentDateTimeString));
        mAdapter.notifyDataSetChanged();
    }

}
