package legendary.developer.lln.legendary.Lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import legendary.developer.lln.legendary.R;

public class LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
    }
}
