package com.sashamakkar.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG", "onCreate: ");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG", "onStart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "onDestroy: ");
    }

    public void Dialler(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel://9810437373"));
        startActivity(i);
        Log.e("TAG", "Dialler: ");
    }

    public void LinkedIn(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.linkedin.com/in/sasha-makkar-bb4954166/"));
        startActivity(i);
        Log.e("TAG", "LinkedIn: ");
    }

    public void Facebook(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/sasha.makkar"));
        startActivity(i);
        Log.e("TAG", "Facebook: ");
    }

    public void Twitter(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://twitter.com/MakkarSasha"));
        startActivity(i);
        Log.e("TAG", "Twitter: ");
    }
}
