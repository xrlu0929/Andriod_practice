package com.myappcompany.rob.exampleproject;

import android.support.v7.app.AppCompatActivity; // class for AppCompat
import android.os.Bundle;
import android.util.Log; // for Log.i()
import android.view.View; // the class for View type

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        /**
         * here the view refers to the button linked to clickFunction
         */
        Log.i("info", "Button Pressed");
        // view.setBackgroundColor(99);
        // Log.i("button color", "getColor(99)");
        // activity
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
