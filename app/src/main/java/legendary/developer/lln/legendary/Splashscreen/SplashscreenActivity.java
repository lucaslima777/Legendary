package legendary.developer.lln.legendary.Splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import legendary.developer.lln.legendary.AutoText.AutoTextView;
import legendary.developer.lln.legendary.Callback.OnAutoTextView;
import legendary.developer.lln.legendary.MainActivity;
import legendary.developer.lln.legendary.R;
import legendary.developer.lln.legendary.Requester.AutoTextViewRequester;

public class SplashscreenActivity extends AppCompatActivity implements OnAutoTextView {

    AutoTextView tvAutoLegendary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        tvAutoLegendary = (AutoTextView)findViewById(R.id.tvAutoLegendary);
        tvAutoLegendary.setTypingSpeed(200);

        new AutoTextView(this);

    }

    @Override
    public void OnAnimateFinish() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
