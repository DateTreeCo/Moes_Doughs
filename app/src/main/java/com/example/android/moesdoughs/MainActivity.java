package com.example.android.moesdoughs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBrowser(View view) {
        String url = (String) view.getTag();
        Intent openUrl = new Intent();
        openUrl.setAction(Intent.ACTION_VIEW);
        openUrl.addCategory(Intent.CATEGORY_BROWSABLE);
        openUrl.setData(Uri.parse(url));
        startActivity(openUrl);
    }
}
