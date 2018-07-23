package com.leadconn.merging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition();
    }

    public void addition()
    {
        int a= 10;
        int b =20;
        int c = (a+b);
    }
}
