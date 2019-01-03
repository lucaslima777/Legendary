package legendary.developer.lln.legendary.Requester;

import android.os.AsyncTask;

import legendary.developer.lln.legendary.Callback.OnAutoTextView;

public class AutoTextViewRequester {

    OnAutoTextView onAutoTextView;

    public AutoTextViewRequester(final OnAutoTextView onAutoTextView){
        this.onAutoTextView = onAutoTextView;
    }

    public void execute(){
        new Thread(new Runnable(){
            public void run(){
                onAutoTextView.OnAnimateFinish();
            }
        }).start();
    }

}
