package com.example.zqf.theaim.ZQF;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zqf.theaim.R;

import cn.bmob.v3.Bmob;

public class Startpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        Bmob.initialize(this, "ec3bba86368b1357bc945565b76b617c");
    }
}
