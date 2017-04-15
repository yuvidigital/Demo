package com.example.dev_p.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent1 = new Intent();
        intent1.setAction(Intent.ACTION_SEND);
        intent1.setType("video/mp4");
        intent1.putExtra(android.content.Intent.EXTRA_SUBJECT,"Title_text");
        //intent1.putExtra(Intent.EXTRA_STREAM,selectedImageUri);
        startActivity(Intent.createChooser(intent1,"Upload video via"));    }
}

