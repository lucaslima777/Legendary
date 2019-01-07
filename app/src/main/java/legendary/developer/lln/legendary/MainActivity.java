package legendary.developer.lln.legendary;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import legendary.developer.lln.legendary.Main.MainAdapter;
import legendary.developer.lln.legendary.Main.MainModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    private MainAdapter mAdapter;
    private List<MainModel> mainItemsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recycler_view_main);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        initializeData();
        mAdapter = new MainAdapter(mainItemsList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initializeData(){
        mainItemsList = new ArrayList<>();
        int i = 0;
        mainItemsList.add(new MainModel(R.drawable.ic_launcher_foreground, "Titulo", "Descricao", i++));
        mainItemsList.add(new MainModel(R.drawable.ic_launcher_background, "Titulo 2", "Descricao 2", i++));
    }

}
